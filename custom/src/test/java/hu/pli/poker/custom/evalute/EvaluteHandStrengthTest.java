package hu.pli.poker.custom.evalute;

import static org.junit.Assert.assertEquals;

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

	CoveredCards coveredCards = new CoveredCards(Card.of("Td").getCardId(), Card.of("Qd").getCardId());

	EvaluteHandStrength testObj = new EvaluteHandStrength(board, coveredCards);
	assertEquals(1, testObj.evalute());
    }

    @Test
    public void testCalculate() {
	EvaluteHandStrength testObj = new EvaluteHandStrength(null);

	int[] cards = new int[5];

	cards[0] = Card.of("Ac").cactusValue();
	cards[1] = Card.of("3h").cactusValue();
	cards[2] = Card.of("8d").cactusValue();
	cards[3] = Card.of("2d").cactusValue();
	cards[4] = Card.of("Ad").cactusValue();

	assertEquals(3525, testObj.calculateHand(cards));
    }

    @Test
    public void testHands() {
	int[] cards = new int[] { 40, 22, 2, 33, 27, 39, 30 };
	EvaluteHandStrength testObj = new EvaluteHandStrength(cards);
	System.out.println(testObj.evalute());

    }
}
