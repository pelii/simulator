package hu.pli.poker.custom.board;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hu.pli.poker.custom.card.Card;

public class BoardTest {

    @Test
    public void testNullInit() {
	List<Card> cards = null;
	Board testObj = new Board(cards);
	nullInit(testObj);

	assertTrue(testObj.getCards().isEmpty());
	String cardString = null;
	nullInit(new Board(cardString));
    }

    private void nullInit(Board testObj) {
	assertFalse(testObj.existsFlop());
	assertFalse(testObj.existsTurn());
	assertFalse(testObj.existsRiver());
    }

    @Test
    public void testCorrectInit() {
	List<Card> cards = new ArrayList<Card>() {
	    {
		add(Card.of(10));
		add(Card.of(11));
		add(Card.of(24));
		add(Card.of(34));
		add(Card.of(1));
	    }
	};

	Board testObj = new Board(cards);
	bordTest(testObj);

	testObj = new Board("2h,Qs,Qh,9d,Jh");
	bordTest(testObj);

	testObj = Board.builder().flop(new Flop("")).build();

    }

    private void bordTest(Board board) {
	assertTrue(board.getCards().contains(Card.of(1)));
	assertTrue(board.getCards().contains(Card.of(10)));
	assertTrue(board.getCards().contains(Card.of(11)));
	assertTrue(board.getCards().contains(Card.of(24)));
	assertTrue(board.getCards().contains(Card.of(34)));
    }
}
