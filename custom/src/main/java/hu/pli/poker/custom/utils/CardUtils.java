package hu.pli.poker.custom.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import hu.pli.poker.custom.card.Card;

public class CardUtils {
    private static Map<Integer, Integer> cactusCodeAndCardIds;

    static {
	cactusCodeAndCardIds = new HashMap<>();

	cactusCodeAndCardIds.put(1, 73730);
	cactusCodeAndCardIds.put(2, 139523);
	cactusCodeAndCardIds.put(3, 270853);
	cactusCodeAndCardIds.put(4, 533255);
	cactusCodeAndCardIds.put(5, 1057803);
	cactusCodeAndCardIds.put(6, 2106637);
	cactusCodeAndCardIds.put(7, 4204049);
	cactusCodeAndCardIds.put(8, 8398611);
	cactusCodeAndCardIds.put(9, 16787479);
	cactusCodeAndCardIds.put(10, 33564957);
	cactusCodeAndCardIds.put(11, 67119647);
	cactusCodeAndCardIds.put(12, 134228773);
	cactusCodeAndCardIds.put(13, 268446761);
	cactusCodeAndCardIds.put(14, 69634);
	cactusCodeAndCardIds.put(15, 135427);
	cactusCodeAndCardIds.put(16, 266757);
	cactusCodeAndCardIds.put(17, 529159);
	cactusCodeAndCardIds.put(18, 1053707);
	cactusCodeAndCardIds.put(19, 2102541);
	cactusCodeAndCardIds.put(20, 4199953);
	cactusCodeAndCardIds.put(21, 8394515);
	cactusCodeAndCardIds.put(22, 16783383);
	cactusCodeAndCardIds.put(23, 33560861);
	cactusCodeAndCardIds.put(24, 67115551);
	cactusCodeAndCardIds.put(25, 134224677);
	cactusCodeAndCardIds.put(26, 268442665);
	cactusCodeAndCardIds.put(27, 81922);
	cactusCodeAndCardIds.put(28, 147715);
	cactusCodeAndCardIds.put(29, 279045);
	cactusCodeAndCardIds.put(30, 541447);
	cactusCodeAndCardIds.put(31, 1065995);
	cactusCodeAndCardIds.put(32, 2114829);
	cactusCodeAndCardIds.put(33, 4212241);
	cactusCodeAndCardIds.put(34, 8406803);
	cactusCodeAndCardIds.put(35, 16795671);
	cactusCodeAndCardIds.put(36, 33573149);
	cactusCodeAndCardIds.put(37, 67127839);
	cactusCodeAndCardIds.put(38, 134236965);
	cactusCodeAndCardIds.put(39, 268454953);
	cactusCodeAndCardIds.put(40, 98306);
	cactusCodeAndCardIds.put(41, 164099);
	cactusCodeAndCardIds.put(42, 295429);
	cactusCodeAndCardIds.put(43, 557831);
	cactusCodeAndCardIds.put(44, 1082379);
	cactusCodeAndCardIds.put(45, 2131213);
	cactusCodeAndCardIds.put(46, 4228625);
	cactusCodeAndCardIds.put(47, 8423187);
	cactusCodeAndCardIds.put(48, 16812055);
	cactusCodeAndCardIds.put(49, 33589533);
	cactusCodeAndCardIds.put(50, 67144223);
	cactusCodeAndCardIds.put(51, 134253349);
	cactusCodeAndCardIds.put(52, 268471337);
    }

    private CardUtils() {
	//
    }

    public static List<Card> convertStringToCardList(String cards) {
	List<Card> result = new ArrayList<>();
	if (StringUtils.isNotBlank(cards)) {
	    String[] items = cards.split(",");

	    Arrays.stream(items).forEach(item -> result.add(Card.of(item)));
	}
	return result;
    }

    public static int[] convertStringToIntArray(String cards) {
	int[] result = new int[0];
	if (StringUtils.isNotBlank(cards)) {
	    String[] items = cards.split(",");
	    result = new int[items.length];

	    for (int index = 0; index < items.length; index++) {
		result[index] = Card.of(items[index]).getCardId();
	    }
	}
	return result;
    }

    public static int convertCardIdToCactusId(int cardId) {
	if (cardId < 1 || cardId > 52) {
	    return 0;
	} else {
	    return cactusCodeAndCardIds.get(cardId);
	}

    }

}
