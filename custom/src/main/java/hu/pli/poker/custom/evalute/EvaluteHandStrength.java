package hu.pli.poker.custom.evalute;

import hu.pli.poker.custom.board.Board;
import hu.pli.poker.custom.board.CoveredCards;

public class EvaluteHandStrength {
	private int[] cards = new int[7];

	public EvaluteHandStrength(Board board, CoveredCards coveredCards) {
		cards[0] = board.getFlop().getCard1().cactusValue();
		cards[1] = board.getFlop().getCard2().cactusValue();
		cards[2] = board.getFlop().getCard3().cactusValue();

		cards[3] = board.getTurn().getCard().cactusValue();

		cards[4] = board.getRiver().getCard().cactusValue();

		cards[5] = coveredCards.getCard1().cactusValue();
		cards[6] = coveredCards.getCard2().cactusValue();
	}
}
