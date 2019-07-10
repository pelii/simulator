package hu.pli.poker.custom.board;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import hu.pli.poker.custom.card.Card;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder
public class Board {
    private Flop flop;
    private Turn turn;
    private River river;

    private int missingCards;

    @Tolerate
    public Board(List<Card> cards) {
	setPages(cards);
    }
// TODO: Lehet hogy inkább int array-t kellene tárolni a Card class helyett.

    private void setPages(List<Card> cards) {
	missingCards = 5;
	if (cards != null) {
	    if (cards.size() > 2) {
		flop = Flop.builder().card1(cards.get(0)).card2(cards.get(1)).card3(cards.get(2)).build();
		missingCards = 2;
	    } else {
		flop = Flop.builder().build();
	    }
	    if (cards.size() > 3) {
		turn = Turn.builder().card(cards.get(3)).build();
		missingCards = 1;
	    } else {
		turn = Turn.builder().build();
	    }
	    if (cards.size() == 5) {
		river = River.builder().card(cards.get(4)).build();
		missingCards = 0;
	    } else {
		river = River.builder().build();
	    }
	} else {
	    flop = Flop.builder().build();
	    turn = Turn.builder().build();
	    river = River.builder().build();
	}
    }

    @Tolerate
    public Board(String boardString) {
	List<Card> cards = new ArrayList<>();
	if (StringUtils.isNotBlank(boardString)) {
	    String[] cardsString = boardString.split(",");

	    for (String card : cardsString) {
		cards.add(Card.of(card));
	    }
	}

	setPages(cards);
    }

    public List<Card> getCards() {
	List<Card> cards = new ArrayList<>();
	if (getFlop().isExists()) {
	    cards.add(getFlop().getCard1());
	    cards.add(getFlop().getCard2());
	    cards.add(getFlop().getCard3());
	}

	if (getTurn().isExists()) {
	    cards.add(getTurn().getCard());
	}

	if (getRiver().isExists()) {
	    cards.add(getRiver().getCard());
	}

	return cards;
    }

    public int[] getCardIds() {
	int[] result = new int[5 - missingCards];
	if (getFlop().isExists()) {
	    result[0] = getFlop().getCard1().getCardId();
	    result[1] = getFlop().getCard2().getCardId();
	    result[2] = getFlop().getCard3().getCardId();
	}

	if (getTurn().isExists()) {
	    result[3] = getTurn().getCard().getCardId();
	}

	if (getRiver().isExists()) {
	    result[4] = getRiver().getCard().getCardId();
	}

	return result;
    }

    public boolean existsFlop() {
	return getFlop().isExists();
    }

    public boolean existsTurn() {
	return getTurn().isExists();
    }

    public boolean existsRiver() {
	return getRiver().isExists();
    }

    public int missingCards() {
	return missingCards;
    }

    @Override
    public String toString() {
	return flop.toString() + "," + turn.toString() + "," + river.toString();
    }
}
