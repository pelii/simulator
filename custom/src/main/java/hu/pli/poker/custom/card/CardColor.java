package hu.pli.poker.custom.card;

import lombok.Getter;

@Getter
public enum CardColor {
    UNKNOWN(CardColor.UNKNOWN_CARD_COLOR, -1, CardColor.UNKNOWN_CACTUS_CODE), //
    HEART(CardColor.HEART_CARD_COLOR, 0, CardColor.HEART_CACTUS_CODE), //
    SPADE(CardColor.SPADE_CARD_COLOR, 1, CardColor.SPADE_CACTUS_CODE), //
    DIAMOND(CardColor.DIAMOND_CARD_COLOR, 2, CardColor.DIAMOND_CACTUS_CODE), //
    CLUB(CardColor.CLUB_CARD_COLOR, 3, CardColor.CLUB_CACTUS_CODE);

    public static final String HEART_CARD_COLOR = "h";
    public static final String SPADE_CARD_COLOR = "s";
    public static final String DIAMOND_CARD_COLOR = "d";
    public static final String CLUB_CARD_COLOR = "c";
    public static final String UNKNOWN_CARD_COLOR = "?";

    public static final int HEART_CACTUS_CODE = 8192;
    public static final int SPADE_CACTUS_CODE = 4096;
    public static final int DIAMOND_CACTUS_CODE = 16384;
    public static final int CLUB_CACTUS_CODE = 32768;
    public static final int UNKNOWN_CACTUS_CODE = 16777215;

    private String code;
    private int colorId;
    private int cactusCode;

    CardColor(String code, int div, int cactusCode) {
	this.code = code;
	this.colorId = div;
	this.cactusCode = cactusCode;
    }

    public static CardColor decodeByCode(String code) {
	for (CardColor cardColor : CardColor.values()) {
	    if (cardColor.getCode().equals(code)) {
		return cardColor;
	    }
	}

	return CardColor.UNKNOWN;
    }

    public static CardColor decodeByColorId(int colorId) {
	for (CardColor cardColor : CardColor.values()) {
	    if (cardColor.getColorId() == colorId) {
		return cardColor;
	    }
	}
	return CardColor.UNKNOWN;
    }

    public static CardColor decodeByCactusCode(int cactusCode) {
	for (CardColor cardColor : CardColor.values()) {
	    if ((cardColor.getCactusCode() & cactusCode) == cardColor.getCactusCode()) {
		return cardColor;
	    }
	}
	return CardColor.UNKNOWN;
    }

    public static CardColor getColorFromCardId(int cardId) {
	return decodeByColorId((cardId - 1) / 13);
    }

    public int getCardValue() {
	return (getColorId() - 1) * 13;
    }
}
