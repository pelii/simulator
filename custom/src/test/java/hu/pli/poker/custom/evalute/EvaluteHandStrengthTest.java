package hu.pli.poker.custom.evalute;

import org.junit.Test;

import hu.pli.poker.custom.board.Board;
import hu.pli.poker.custom.board.CoveredCards;
import hu.pli.poker.custom.board.Flop;
import hu.pli.poker.custom.board.River;
import hu.pli.poker.custom.board.Turn;
import hu.pli.poker.custom.card.Card;

public class EvaluteHandStrengthTest {

    @Test
    public void test() {
	Board board = Board.builder()//
		.flop(Flop.builder().card1(Card.of("Ad")).card2(Card.of("Th")).card3(Card.of("Kd")).build())//
		.turn(new Turn(Card.of("5s")))//
		.river(new River(Card.of("Jd")))//
		.build();

	CoveredCards coveredCards = new CoveredCards(Card.of("Td"), Card.of("Qd"));

	EvaluteHandStrength testObj = new EvaluteHandStrength(board, coveredCards);
	testObj.evalute();
    }

}
