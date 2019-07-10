package hu.pli.poker.custom.equitycalculate;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;

import hu.pli.poker.custom.board.Board;
import hu.pli.poker.custom.card.Card;
import hu.pli.poker.custom.evalute.EvaluteHandStrength;
import hu.pli.poker.custom.evalute.data.CactusKevHands;
import hu.pli.poker.custom.player.PlayerCard;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EquityCalculate {
    private Board board;
    private List<PlayerCard> playerCards;
    private Random random;
    private int count;

    Map<Integer, Card> cards;
    Integer[] cardArray;

    public EquityCalculate(Board board, List<PlayerCard> playerCards) {
	this.board = board;
	this.playerCards = playerCards;

	init();

	cardArray = cards.keySet().toArray(new Integer[0]);
	count = 100000;

	if (board.existsRiver()) {
	    calculate(1);
	} else {
	    calculate(100000);
	}
    }

    public EquityCalculateResult calculate() {
	return calculate(count);
    }

    public EquityCalculateResult calculate(int repeat) {
	if (board.existsRiver()) {
	    repeat = 1;
	}

	random = new Random();
	int[] sum = new int[playerCards.size()];
	for (int i = 0; i < repeat; i++) {

	    int[] boardCards = ArrayUtils.addAll(readRandomCards(board.getMissingCards()), board.getCardIds());

	    int[] handValue = new int[playerCards.size()];
	    int minHandValue = 9999;
	    for (PlayerCard playerCard : playerCards) {
		int[] allCards = ArrayUtils.addAll(boardCards, playerCard.getCoverredCards().getCardIds());

		EvaluteHandStrength handStrength = new EvaluteHandStrength(allCards);
		int evalute = handStrength.evalute();
		handValue[playerCard.getPlayerId() - 1] = evalute;
		if (evalute < minHandValue) {
		    minHandValue = evalute;
		}
		if (log.isTraceEnabled()) {
		    log.trace("Hand strength: {}", CactusKevHands.getByRank(evalute));
		}
	    }

	    for (int index = 0; index < playerCards.size(); index++) {
		if (handValue[index] == minHandValue) {
		    sum[index] = sum[index] + 1;
		}
	    }
	}

	return createResult(sum, repeat);
    }

    private EquityCalculateResult createResult(int[] sum, int repeat) {
	EquityCalculateResult equityCalculateResult = new EquityCalculateResult();
	for (int index = 0; index < sum.length; index++) {
	    equityCalculateResult.addNewResult(EquityCalculateResultItem.builder().playerId(index).percent(sum[index] / (repeat / 100.0)).build());
	}

	return equityCalculateResult;
    }

    private int[] readRandomCards(int size) {
	int[] result = new int[size];
	int resultIndex = 0;
	int lastIndex = cardArray.length - 1;
	while (resultIndex < size) {
	    int cardIndex = random.nextInt(cardArray.length);
	    result[resultIndex] = cardArray[cardIndex];
	    int tempValue = cardArray[lastIndex];
	    cardArray[lastIndex] = cardArray[cardIndex];
	    cardArray[cardIndex] = tempValue;

	    lastIndex--;
	    resultIndex++;
	}

	return result;
    }

    private void init() {
	cards = new Hashtable<>();

	for (Card card : Card.allCards()) {
	    cards.put(card.getCardId(), card);
	}

	List<Card> usedCards = new ArrayList<>(board.getCards());

	for (PlayerCard playerCard : playerCards) {
	    usedCards.addAll(playerCard.getCoverredCards().getCards());
	}

	usedCards.forEach(card -> cards.remove(card.getCardId()));
    }
}
