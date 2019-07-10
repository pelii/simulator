package hu.pli.poker.custom.evalute;

import hu.pli.poker.custom.board.Board;
import hu.pli.poker.custom.board.CoveredCards;
import hu.pli.poker.custom.card.Card;
import hu.pli.poker.custom.evalute.data.CactusKevFind;
import hu.pli.poker.custom.evalute.data.CactusKevFlush;
import hu.pli.poker.custom.evalute.data.CactusKevUniques5;
import hu.pli.poker.custom.utils.CardUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EvaluteHandStrength {
    private int[] cards = new int[7];
    // private int[] actHand = new int[5];

    public EvaluteHandStrength(Board board, CoveredCards coveredCards) {
	cards[0] = board.getFlop().getCard1().cactusValue();
	cards[1] = board.getFlop().getCard2().cactusValue();
	cards[2] = board.getFlop().getCard3().cactusValue();

	cards[3] = board.getTurn().getCard().cactusValue();

	cards[4] = board.getRiver().getCard().cactusValue();

	cards[5] = CardUtils.convertCardIdToCactusId(coveredCards.getCard1());
	cards[6] = CardUtils.convertCardIdToCactusId(coveredCards.getCard2());
    }

    public EvaluteHandStrength(int[] cards) {
	if (cards != null && cards.length == 7) {
	    this.cards[0] = CardUtils.convertCardIdToCactusId(cards[0]);
	    this.cards[1] = CardUtils.convertCardIdToCactusId(cards[1]);
	    this.cards[2] = CardUtils.convertCardIdToCactusId(cards[2]);

	    this.cards[3] = CardUtils.convertCardIdToCactusId(cards[3]);

	    this.cards[4] = CardUtils.convertCardIdToCactusId(cards[4]);

	    this.cards[5] = CardUtils.convertCardIdToCactusId(cards[5]);
	    this.cards[6] = CardUtils.convertCardIdToCactusId(cards[6]);
	}
    }

    public int evalute() {
	if (log.isTraceEnabled()) {
	    log.trace("Evalute cards: {},{},{},{},{},{},{}", cards);
	}

	int result = 9999;
	int[] actHand = new int[5];

	for (int rowCount = 0; rowCount < Permutation.ROW_COUNT; rowCount++) {
	    actHand[0] = cards[Permutation.data[rowCount][0]];
	    actHand[1] = cards[Permutation.data[rowCount][1]];
	    actHand[2] = cards[Permutation.data[rowCount][2]];
	    actHand[3] = cards[Permutation.data[rowCount][3]];
	    actHand[4] = cards[Permutation.data[rowCount][4]];

	    int evaluteValue = calculateHand(actHand);

	    if (evaluteValue < result) {
		result = evaluteValue;
	    }
	}
	if (log.isDebugEnabled()) {
	    log.debug("CactusKev handId: {}", result);
	}
	return result;
    }

    public int calculateHand(int[] actHand) {
	int result = 0;
	if (log.isTraceEnabled()) {
	    log.trace("Evalute hand: {},{},{},{},{}", Card.ofCactusCode(actHand[0]), Card.ofCactusCode(actHand[1]), Card.ofCactusCode(actHand[2]), Card.ofCactusCode(actHand[3]),
		    Card.ofCactusCode(actHand[4]));
	}
	if (isFlush(actHand)) {
	    result = CactusKevFlush.lookupFlush((actHand[0] | actHand[1] | actHand[2] | actHand[3] | actHand[4]) >> 16);
	    if (log.isTraceEnabled()) {
		log.trace("is Flush, {}", result);

	    }

	} else {
	    result = CactusKevUniques5.lookUP((actHand[0] | actHand[1] | actHand[2] | actHand[3] | actHand[4]) >> 16);
	    if (result == 0) {
		result = CactusKevFind.readCardValue((actHand[0] & 0xFF) * (actHand[1] & 0xFF) * (actHand[2] & 0xFF) * (actHand[3] & 0xFF) * (actHand[4] & 0xFF));
	    }
	    if (log.isTraceEnabled()) {
		log.trace("is not Flush {}", result);
	    }
	}
	return result;
    }

    private boolean isFlush(int[] actHand) {
	return (actHand[0] & actHand[1] & actHand[2] & actHand[3] & actHand[4] & 0xF000) != 0;

    }

}
