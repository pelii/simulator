package hu.pli.poker.custom.card;

import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testAllPage() {
		for(CardItem cardItem :CardItem.getAllItem()) {
			Card testObj = Card.of(cardItem.getCardCode());
			
			assertEquals(testObj.getCardColor(),cardItem.getCardColor());
			assertEquals(testObj.getCardValue(), cardItem.getCardValue());
			
			assertEquals(testObj.cactusValue(),cardItem.getCactusValue());
			
			Card testObj2 = Card.of(cardItem.getCardId());
			
			assertEquals(testObj.getCardColor(),testObj2.getCardColor());
			assertEquals(testObj.getCardValue(), testObj2.getCardValue());
			assertEquals(testObj2.getCardColor(),cardItem.getCardColor());
			assertEquals(testObj2.getCardValue(), cardItem.getCardValue());
		}
	}
	
}
