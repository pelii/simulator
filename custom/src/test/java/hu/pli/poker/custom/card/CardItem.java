package hu.pli.poker.custom.card;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CardItem {
    private String cardCode;
    private int cardId;
    private CardValue cardValue;
    private CardColor cardColor;
    private int cactusValue;

    public static List<CardItem> getAllItem() {
	List<CardItem> result = new ArrayList<>();

	result.add(CardItem.builder().cardCode("2h").cardId(Card.HEART_TWO).cardColor(CardColor.HEART).cardValue(CardValue.TWO).cactusValue(73730).build());
	result.add(CardItem.builder().cardCode("3h").cardId(Card.HEART_THREE).cardColor(CardColor.HEART).cardValue(CardValue.THREE).cactusValue(139523).build());
	result.add(CardItem.builder().cardCode("4h").cardId(Card.HEART_FOUR).cardColor(CardColor.HEART).cardValue(CardValue.FOUR).cactusValue(270853).build());
	result.add(CardItem.builder().cardCode("5h").cardId(Card.HEART_FIVE).cardColor(CardColor.HEART).cardValue(CardValue.FIVE).cactusValue(533255).build());
	result.add(CardItem.builder().cardCode("6h").cardId(Card.HEART_SIX).cardColor(CardColor.HEART).cardValue(CardValue.SIX).cactusValue(1057803).build());
	result.add(CardItem.builder().cardCode("7h").cardId(Card.HEART_SEVEN).cardColor(CardColor.HEART).cardValue(CardValue.SEVEN).cactusValue(2106637).build());
	result.add(CardItem.builder().cardCode("8h").cardId(Card.HEART_EIGHT).cardColor(CardColor.HEART).cardValue(CardValue.EIGHT).cactusValue(4204049).build());
	result.add(CardItem.builder().cardCode("9h").cardId(Card.HEART_NINE).cardColor(CardColor.HEART).cardValue(CardValue.NINE).cactusValue(8398611).build());
	result.add(CardItem.builder().cardCode("Th").cardId(Card.HEART_TEN).cardColor(CardColor.HEART).cardValue(CardValue.TEN).cactusValue(16787479).build());
	result.add(CardItem.builder().cardCode("Jh").cardId(Card.HEART_JACK).cardColor(CardColor.HEART).cardValue(CardValue.JACK).cactusValue(33564957).build());
	result.add(CardItem.builder().cardCode("Qh").cardId(Card.HEART_QUEEN).cardColor(CardColor.HEART).cardValue(CardValue.QUEEN).cactusValue(67119647).build());
	result.add(CardItem.builder().cardCode("Kh").cardId(Card.HEART_KING).cardColor(CardColor.HEART).cardValue(CardValue.KING).cactusValue(134228773).build());
	result.add(CardItem.builder().cardCode("Ah").cardId(Card.HEART_ACE).cardColor(CardColor.HEART).cardValue(CardValue.ACE).cactusValue(268446761).build());
	result.add(CardItem.builder().cardCode("2s").cardId(Card.SPADE_TWO).cardColor(CardColor.SPADE).cardValue(CardValue.TWO).cactusValue(69634).build());
	result.add(CardItem.builder().cardCode("3s").cardId(Card.SPADE_THREE).cardColor(CardColor.SPADE).cardValue(CardValue.THREE).cactusValue(135427).build());
	result.add(CardItem.builder().cardCode("4s").cardId(Card.SPADE_FOUR).cardColor(CardColor.SPADE).cardValue(CardValue.FOUR).cactusValue(266757).build());
	result.add(CardItem.builder().cardCode("5s").cardId(Card.SPADE_FIVE).cardColor(CardColor.SPADE).cardValue(CardValue.FIVE).cactusValue(529159).build());
	result.add(CardItem.builder().cardCode("6s").cardId(Card.SPADE_SIX).cardColor(CardColor.SPADE).cardValue(CardValue.SIX).cactusValue(1053707).build());
	result.add(CardItem.builder().cardCode("7s").cardId(Card.SPADE_SEVEN).cardColor(CardColor.SPADE).cardValue(CardValue.SEVEN).cactusValue(2102541).build());
	result.add(CardItem.builder().cardCode("8s").cardId(Card.SPADE_EIGHT).cardColor(CardColor.SPADE).cardValue(CardValue.EIGHT).cactusValue(4199953).build());
	result.add(CardItem.builder().cardCode("9s").cardId(Card.SPADE_NINE).cardColor(CardColor.SPADE).cardValue(CardValue.NINE).cactusValue(8394515).build());
	result.add(CardItem.builder().cardCode("Ts").cardId(Card.SPADE_TEN).cardColor(CardColor.SPADE).cardValue(CardValue.TEN).cactusValue(16783383).build());
	result.add(CardItem.builder().cardCode("Js").cardId(Card.SPADE_JACK).cardColor(CardColor.SPADE).cardValue(CardValue.JACK).cactusValue(33560861).build());
	result.add(CardItem.builder().cardCode("Qs").cardId(Card.SPADE_QUEEN).cardColor(CardColor.SPADE).cardValue(CardValue.QUEEN).cactusValue(67115551).build());
	result.add(CardItem.builder().cardCode("Ks").cardId(Card.SPADE_KING).cardColor(CardColor.SPADE).cardValue(CardValue.KING).cactusValue(134224677).build());
	result.add(CardItem.builder().cardCode("As").cardId(Card.SPADE_ACE).cardColor(CardColor.SPADE).cardValue(CardValue.ACE).cactusValue(268442665).build());
	result.add(CardItem.builder().cardCode("2d").cardId(Card.DIAMOND_TWO).cardColor(CardColor.DIAMOND).cardValue(CardValue.TWO).cactusValue(81922).build());
	result.add(CardItem.builder().cardCode("3d").cardId(Card.DIAMOND_THREE).cardColor(CardColor.DIAMOND).cardValue(CardValue.THREE).cactusValue(147715).build());
	result.add(CardItem.builder().cardCode("4d").cardId(Card.DIAMOND_FOUR).cardColor(CardColor.DIAMOND).cardValue(CardValue.FOUR).cactusValue(279045).build());
	result.add(CardItem.builder().cardCode("5d").cardId(Card.DIAMOND_FIVE).cardColor(CardColor.DIAMOND).cardValue(CardValue.FIVE).cactusValue(541447).build());
	result.add(CardItem.builder().cardCode("6d").cardId(Card.DIAMOND_SIX).cardColor(CardColor.DIAMOND).cardValue(CardValue.SIX).cactusValue(1065995).build());
	result.add(CardItem.builder().cardCode("7d").cardId(Card.DIAMOND_SEVEN).cardColor(CardColor.DIAMOND).cardValue(CardValue.SEVEN).cactusValue(2114829).build());
	result.add(CardItem.builder().cardCode("8d").cardId(Card.DIAMOND_EIGHT).cardColor(CardColor.DIAMOND).cardValue(CardValue.EIGHT).cactusValue(4212241).build());
	result.add(CardItem.builder().cardCode("9d").cardId(Card.DIAMOND_NINE).cardColor(CardColor.DIAMOND).cardValue(CardValue.NINE).cactusValue(8406803).build());
	result.add(CardItem.builder().cardCode("Td").cardId(Card.DIAMOND_TEN).cardColor(CardColor.DIAMOND).cardValue(CardValue.TEN).cactusValue(16795671).build());
	result.add(CardItem.builder().cardCode("Jd").cardId(Card.DIAMOND_JACK).cardColor(CardColor.DIAMOND).cardValue(CardValue.JACK).cactusValue(33573149).build());
	result.add(CardItem.builder().cardCode("Qd").cardId(Card.DIAMOND_QUEEN).cardColor(CardColor.DIAMOND).cardValue(CardValue.QUEEN).cactusValue(67127839).build());
	result.add(CardItem.builder().cardCode("Kd").cardId(Card.DIAMOND_KING).cardColor(CardColor.DIAMOND).cardValue(CardValue.KING).cactusValue(134236965).build());
	result.add(CardItem.builder().cardCode("Ad").cardId(Card.DIAMOND_ACE).cardColor(CardColor.DIAMOND).cardValue(CardValue.ACE).cactusValue(268454953).build());
	result.add(CardItem.builder().cardCode("2c").cardId(Card.CLUB_TWO).cardColor(CardColor.CLUB).cardValue(CardValue.TWO).cactusValue(98306).build());
	result.add(CardItem.builder().cardCode("3c").cardId(Card.CLUB_THREE).cardColor(CardColor.CLUB).cardValue(CardValue.THREE).cactusValue(164099).build());
	result.add(CardItem.builder().cardCode("4c").cardId(Card.CLUB_FOUR).cardColor(CardColor.CLUB).cardValue(CardValue.FOUR).cactusValue(295429).build());
	result.add(CardItem.builder().cardCode("5c").cardId(Card.CLUB_FIVE).cardColor(CardColor.CLUB).cardValue(CardValue.FIVE).cactusValue(557831).build());
	result.add(CardItem.builder().cardCode("6c").cardId(Card.CLUB_SIX).cardColor(CardColor.CLUB).cardValue(CardValue.SIX).cactusValue(1082379).build());
	result.add(CardItem.builder().cardCode("7c").cardId(Card.CLUB_SEVEN).cardColor(CardColor.CLUB).cardValue(CardValue.SEVEN).cactusValue(2131213).build());
	result.add(CardItem.builder().cardCode("8c").cardId(Card.CLUB_EIGHT).cardColor(CardColor.CLUB).cardValue(CardValue.EIGHT).cactusValue(4228625).build());
	result.add(CardItem.builder().cardCode("9c").cardId(Card.CLUB_NINE).cardColor(CardColor.CLUB).cardValue(CardValue.NINE).cactusValue(8423187).build());
	result.add(CardItem.builder().cardCode("Tc").cardId(Card.CLUB_TEN).cardColor(CardColor.CLUB).cardValue(CardValue.TEN).cactusValue(16812055).build());
	result.add(CardItem.builder().cardCode("Jc").cardId(Card.CLUB_JACK).cardColor(CardColor.CLUB).cardValue(CardValue.JACK).cactusValue(33589533).build());
	result.add(CardItem.builder().cardCode("Qc").cardId(Card.CLUB_QUEEN).cardColor(CardColor.CLUB).cardValue(CardValue.QUEEN).cactusValue(67144223).build());
	result.add(CardItem.builder().cardCode("Kc").cardId(Card.CLUB_KING).cardColor(CardColor.CLUB).cardValue(CardValue.KING).cactusValue(134253349).build());
	result.add(CardItem.builder().cardCode("Ac").cardId(Card.CLUB_ACE).cardColor(CardColor.CLUB).cardValue(CardValue.ACE).cactusValue(268471337).build());

	return result;
    }
}
