package hu.pli.poker.custom.card;

import lombok.Getter;

@Getter
public enum CardValue {
	UNKNOWN(CardValue.UNKNOWN_CARD_VALUE, -1, "", CardValue.UNKNOWN_CARD_CACTUS_VALUE), //
	TWO(CardValue.TWO_CARD_VALUE, 1, "Two", CardValue.TWO_CARDCACTUS_VALUE), //
	THREE(CardValue.THREE_CARD_VALUE, 2, "Three", CardValue.THREE_CARD_CACTUS_VALUE), //
	FOUR(CardValue.FOUR_CARD_VALUE, 3, "Four", CardValue.FOUR_CARD_CACTUS_VALUE), //
	FIVE(CardValue.FIVE_CARD_VALUE, 4, "Five", CardValue.FIVE_CARD_CACTUS_VALUE), //
	SIX(CardValue.SIX_CARD_VALUE, 5, "Six", CardValue.SIX_CARD_CACTUS_VALUE), //
	SEVEN(CardValue.SEVEN_CARD_VALUE, 6, "Seven", CardValue.SEVEN_CARD_CACTUS_VALUE), //
	EIGHT(CardValue.EIGHT_CARD_VALUE, 7, "Eight", CardValue.EIGHT_CARD_CACTUS_VALUE), //
	NINE(CardValue.NINE_CARD_VALUE, 8, "Nine", CardValue.NINE_CARD_CACTUS_VALUE), //
	TEN(CardValue.TEN_CARD_VALUE, 9, "Ten", CardValue.TEN_CARD_CACTUS_VALUE), //
	JACK(CardValue.JACK_CARD_VALUE, 10, "Jack", CardValue.JACK_CARD_CACTUS_VALUE), //
	QUEEN(CardValue.QUEEN_CARD_VALUE, 11, "Queen", CardValue.QUEEN_CARD_CACTUS_VALUE), //
	KING(CardValue.KING_CARD_VALUE, 12, "King", CardValue.KING_CARD_CACTUS_VALUE), //
	ACE(CardValue.ACE_CARD_VALUE, 13, "Ace", CardValue.ACE_CARD_CACTUS_VALUE);

	public static final String UNKNOWN_CARD_VALUE = "?";
	public static final String TWO_CARD_VALUE = "2";
	public static final String THREE_CARD_VALUE = "3";
	public static final String FOUR_CARD_VALUE = "4";
	public static final String FIVE_CARD_VALUE = "5";
	public static final String SIX_CARD_VALUE = "6";
	public static final String SEVEN_CARD_VALUE = "7";
	public static final String EIGHT_CARD_VALUE = "8";
	public static final String NINE_CARD_VALUE = "9";
	public static final String TEN_CARD_VALUE = "T";
	public static final String JACK_CARD_VALUE = "J";
	public static final String QUEEN_CARD_VALUE = "Q";
	public static final String KING_CARD_VALUE = "K";
	public static final String ACE_CARD_VALUE = "A";

	public static final int UNKNOWN_CARD_CACTUS_VALUE = 0;
	public static final int TWO_CARDCACTUS_VALUE = 65538;
	public static final int THREE_CARD_CACTUS_VALUE = 131331;
	public static final int FOUR_CARD_CACTUS_VALUE = 262661;
	public static final int FIVE_CARD_CACTUS_VALUE = 525063;
	public static final int SIX_CARD_CACTUS_VALUE = 1049611;
	public static final int SEVEN_CARD_CACTUS_VALUE = 2098445;
	public static final int EIGHT_CARD_CACTUS_VALUE = 4195857;
	public static final int NINE_CARD_CACTUS_VALUE = 8390419;
	public static final int TEN_CARD_CACTUS_VALUE = 16779287;
	public static final int JACK_CARD_CACTUS_VALUE = 33556765;
	public static final int QUEEN_CARD_CACTUS_VALUE = 67111455;
	public static final int KING_CARD_CACTUS_VALUE = 134220581;
	public static final int ACE_CARD_CACTUS_VALUE = 268438569;

	private String code;
	private int cardValueId;
	private String cardName;
	private int cactusCode;

	CardValue(String code, int cardValueId, String cardName, int cactusCode) {
		this.code = code;
		this.cardValueId = cardValueId;
		this.cardName = cardName;
		this.cactusCode = cactusCode;
	}

	public static CardValue decodeByCode(String code) {
		for (CardValue cardValue : CardValue.values()) {
			if (cardValue.getCode().equalsIgnoreCase(code)) {
				return cardValue;
			}
		}
		return CardValue.UNKNOWN;
	}

	public static CardValue decodeByCactusCode(int cactusCode) {
		for (CardValue cardValue : CardValue.values()) {
			if (cardValue.getCactusCode() == cactusCode) {
				return cardValue;
			}
		}
		return CardValue.UNKNOWN;
	}

	public static CardValue decodeByCardValueId(int cardValueId) {
		for (CardValue cardValue : CardValue.values()) {
			if (cardValue.getCardValueId() == cardValueId) {
				return cardValue;
			}
		}
		return CardValue.UNKNOWN;
	}

	public static CardValue getValueFromCardId(int cardId) {
		int count = (cardId -1) / 13;
		
		return decodeByCardValueId(cardId - (count * 13));
	}

}
