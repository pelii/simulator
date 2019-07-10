package hu.pli.poker.custom.evalute.data;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hu.pli.poker.custom.evalute.HandStrength;

public class CactusKevHandsTest {

    @Test
    public void test() {
	CactusKevHand testObj = CactusKevHands.getByRank(44);

	assertEquals(HandStrength.POKER, testObj.getHandStrength());

	testObj = CactusKevHands.getByRank(7463);
	assertEquals(HandStrength.UNKNOWN, testObj.getHandStrength());
    }

}
