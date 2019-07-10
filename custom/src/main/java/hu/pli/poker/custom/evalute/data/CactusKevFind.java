package hu.pli.poker.custom.evalute.data;

import java.util.HashMap;
import java.util.Map;

public class CactusKevFind {
    private CactusKevFind() {
	//
    }

    private static Map<Integer, Short> cardIndexes = null;

    public static Map<Integer, Short> getCardIndexes() {
	if (cardIndexes == null) {
	    cardIndexes = new HashMap<>();
	    for (int index = 0; index < ProductArray.getProducts().length; index++) {
		cardIndexes.put(ProductArray.getProducts()[index], ValueArray.getValues()[index]);
	    }
	}

	return cardIndexes;
    }

    public static short readCardValue(int primeValue) {
	if (getCardIndexes().containsKey(primeValue)) {
	    return getCardIndexes().get(primeValue);
	}

	return 0;
    }
}
