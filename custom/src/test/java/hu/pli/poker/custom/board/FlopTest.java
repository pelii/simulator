package hu.pli.poker.custom.board;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hu.pli.poker.custom.card.Card;

public class FlopTest {

    @Test
    public void testCreate() {
	Flop testObj = new Flop("");

	assertEquals(Card.getUnknownCard(), testObj.getCard1());
	assertEquals(Card.getUnknownCard(), testObj.getCard2());
	assertEquals(Card.getUnknownCard(), testObj.getCard3());

	testObj = new Flop("2h,3d,Ts");

	assertEquals(Card.of("2h"), testObj.getCard1());
	assertEquals(Card.of("3d"), testObj.getCard2());
	assertEquals(Card.of("Ts"), testObj.getCard3());
    }
}
