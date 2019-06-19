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
		
		result.add(CardItem.builder().cardCode("2h").cardId(1).cardColor(CardColor.HEART).cardValue(CardValue.TWO).cactusValue(73730).build());
		result.add(CardItem.builder().cardCode("3h").cardId(2).cardColor(CardColor.HEART).cardValue(CardValue.THREE).cactusValue(139523).build());
		result.add(CardItem.builder().cardCode("4h").cardId(3).cardColor(CardColor.HEART).cardValue(CardValue.FOUR).cactusValue(270853).build());
		result.add(CardItem.builder().cardCode("5h").cardId(4).cardColor(CardColor.HEART).cardValue(CardValue.FIVE).cactusValue(533255).build());
		result.add(CardItem.builder().cardCode("6h").cardId(5).cardColor(CardColor.HEART).cardValue(CardValue.SIX).cactusValue(1057803).build());
		result.add(CardItem.builder().cardCode("7h").cardId(6).cardColor(CardColor.HEART).cardValue(CardValue.SEVEN).cactusValue(2106637).build());
		result.add(CardItem.builder().cardCode("8h").cardId(7).cardColor(CardColor.HEART).cardValue(CardValue.EIGHT).cactusValue(4204049).build());
		result.add(CardItem.builder().cardCode("9h").cardId(8).cardColor(CardColor.HEART).cardValue(CardValue.NINE).cactusValue(8398611).build());
		result.add(CardItem.builder().cardCode("Th").cardId(9).cardColor(CardColor.HEART).cardValue(CardValue.TEN).cactusValue(16787479).build());
		result.add(CardItem.builder().cardCode("Jh").cardId(10).cardColor(CardColor.HEART).cardValue(CardValue.JACK).cactusValue(33564957).build());
		result.add(CardItem.builder().cardCode("Qh").cardId(11).cardColor(CardColor.HEART).cardValue(CardValue.QUEEN).cactusValue(67119647).build());
		result.add(CardItem.builder().cardCode("Kh").cardId(12).cardColor(CardColor.HEART).cardValue(CardValue.KING).cactusValue(134228773).build());
		result.add(CardItem.builder().cardCode("Ah").cardId(13).cardColor(CardColor.HEART).cardValue(CardValue.ACE).cactusValue(268446761).build());
		result.add(CardItem.builder().cardCode("2s").cardId(14).cardColor(CardColor.SPADE).cardValue(CardValue.TWO).cactusValue(69634).build());
		result.add(CardItem.builder().cardCode("3s").cardId(15).cardColor(CardColor.SPADE).cardValue(CardValue.THREE).cactusValue(135427).build());
		result.add(CardItem.builder().cardCode("4s").cardId(16).cardColor(CardColor.SPADE).cardValue(CardValue.FOUR).cactusValue(266757).build());
		result.add(CardItem.builder().cardCode("5s").cardId(17).cardColor(CardColor.SPADE).cardValue(CardValue.FIVE).cactusValue(529159).build());
		result.add(CardItem.builder().cardCode("6s").cardId(18).cardColor(CardColor.SPADE).cardValue(CardValue.SIX).cactusValue(1053707).build());
		result.add(CardItem.builder().cardCode("7s").cardId(19).cardColor(CardColor.SPADE).cardValue(CardValue.SEVEN).cactusValue(2102541).build());
		result.add(CardItem.builder().cardCode("8s").cardId(20).cardColor(CardColor.SPADE).cardValue(CardValue.EIGHT).cactusValue(4199953).build());
		result.add(CardItem.builder().cardCode("9s").cardId(21).cardColor(CardColor.SPADE).cardValue(CardValue.NINE).cactusValue(8394515).build());
		result.add(CardItem.builder().cardCode("Ts").cardId(22).cardColor(CardColor.SPADE).cardValue(CardValue.TEN).cactusValue(16783383).build());
		result.add(CardItem.builder().cardCode("Js").cardId(23).cardColor(CardColor.SPADE).cardValue(CardValue.JACK).cactusValue(33560861).build());
		result.add(CardItem.builder().cardCode("Qs").cardId(24).cardColor(CardColor.SPADE).cardValue(CardValue.QUEEN).cactusValue(67115551).build());
		result.add(CardItem.builder().cardCode("Ks").cardId(25).cardColor(CardColor.SPADE).cardValue(CardValue.KING).cactusValue(134224677).build());
		result.add(CardItem.builder().cardCode("As").cardId(26).cardColor(CardColor.SPADE).cardValue(CardValue.ACE).cactusValue(268442665).build());
		result.add(CardItem.builder().cardCode("2d").cardId(27).cardColor(CardColor.DIAMOND).cardValue(CardValue.TWO).cactusValue(81922).build());
		result.add(CardItem.builder().cardCode("3d").cardId(28).cardColor(CardColor.DIAMOND).cardValue(CardValue.THREE).cactusValue(147715).build());
		result.add(CardItem.builder().cardCode("4d").cardId(29).cardColor(CardColor.DIAMOND).cardValue(CardValue.FOUR).cactusValue(279045).build());
		result.add(CardItem.builder().cardCode("5d").cardId(30).cardColor(CardColor.DIAMOND).cardValue(CardValue.FIVE).cactusValue(541447).build());
		result.add(CardItem.builder().cardCode("6d").cardId(31).cardColor(CardColor.DIAMOND).cardValue(CardValue.SIX).cactusValue(1065995).build());
		result.add(CardItem.builder().cardCode("7d").cardId(32).cardColor(CardColor.DIAMOND).cardValue(CardValue.SEVEN).cactusValue(2114829).build());
		result.add(CardItem.builder().cardCode("8d").cardId(33).cardColor(CardColor.DIAMOND).cardValue(CardValue.EIGHT).cactusValue(4212241).build());
		result.add(CardItem.builder().cardCode("9d").cardId(34).cardColor(CardColor.DIAMOND).cardValue(CardValue.NINE).cactusValue(8406803).build());
		result.add(CardItem.builder().cardCode("Td").cardId(35).cardColor(CardColor.DIAMOND).cardValue(CardValue.TEN).cactusValue(16795671).build());
		result.add(CardItem.builder().cardCode("Jd").cardId(36).cardColor(CardColor.DIAMOND).cardValue(CardValue.JACK).cactusValue(33573149).build());
		result.add(CardItem.builder().cardCode("Qd").cardId(37).cardColor(CardColor.DIAMOND).cardValue(CardValue.QUEEN).cactusValue(67127839).build());
		result.add(CardItem.builder().cardCode("Kd").cardId(38).cardColor(CardColor.DIAMOND).cardValue(CardValue.KING).cactusValue(134236965).build());
		result.add(CardItem.builder().cardCode("Ad").cardId(39).cardColor(CardColor.DIAMOND).cardValue(CardValue.ACE).cactusValue(268454953).build());
		result.add(CardItem.builder().cardCode("2c").cardId(40).cardColor(CardColor.CLUB).cardValue(CardValue.TWO).cactusValue(98306).build());
		result.add(CardItem.builder().cardCode("3c").cardId(41).cardColor(CardColor.CLUB).cardValue(CardValue.THREE).cactusValue(164099).build());
		result.add(CardItem.builder().cardCode("4c").cardId(42).cardColor(CardColor.CLUB).cardValue(CardValue.FOUR).cactusValue(295429).build());
		result.add(CardItem.builder().cardCode("5c").cardId(43).cardColor(CardColor.CLUB).cardValue(CardValue.FIVE).cactusValue(557831).build());
		result.add(CardItem.builder().cardCode("6c").cardId(44).cardColor(CardColor.CLUB).cardValue(CardValue.SIX).cactusValue(1082379).build());
		result.add(CardItem.builder().cardCode("7c").cardId(45).cardColor(CardColor.CLUB).cardValue(CardValue.SEVEN).cactusValue(2131213).build());
		result.add(CardItem.builder().cardCode("8c").cardId(46).cardColor(CardColor.CLUB).cardValue(CardValue.EIGHT).cactusValue(4228625).build());
		result.add(CardItem.builder().cardCode("9c").cardId(47).cardColor(CardColor.CLUB).cardValue(CardValue.NINE).cactusValue(8423187).build());
		result.add(CardItem.builder().cardCode("Tc").cardId(48).cardColor(CardColor.CLUB).cardValue(CardValue.TEN).cactusValue(16812055).build());
		result.add(CardItem.builder().cardCode("Jc").cardId(49).cardColor(CardColor.CLUB).cardValue(CardValue.JACK).cactusValue(33589533).build());
		result.add(CardItem.builder().cardCode("Qc").cardId(50).cardColor(CardColor.CLUB).cardValue(CardValue.QUEEN).cactusValue(67144223).build());
		result.add(CardItem.builder().cardCode("Kc").cardId(51).cardColor(CardColor.CLUB).cardValue(CardValue.KING).cactusValue(134253349).build());
		result.add(CardItem.builder().cardCode("Ac").cardId(52).cardColor(CardColor.CLUB).cardValue(CardValue.ACE).cactusValue(268471337).build());
		
		return result;
	}
}
