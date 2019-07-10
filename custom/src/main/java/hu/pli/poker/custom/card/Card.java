package hu.pli.poker.custom.card;

import java.util.Collections;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Card {
    public static final int UNKNOWN_CARD = -12;
    public static final int HEART_TWO = 1;
    public static final int HEART_THREE = 2;
    public static final int HEART_FOUR = 3;
    public static final int HEART_FIVE = 4;
    public static final int HEART_SIX = 5;
    public static final int HEART_SEVEN = 6;
    public static final int HEART_EIGHT = 7;
    public static final int HEART_NINE = 8;
    public static final int HEART_TEN = 9;
    public static final int HEART_JACK = 10;
    public static final int HEART_QUEEN = 11;
    public static final int HEART_KING = 12;
    public static final int HEART_ACE = 13;
    public static final int SPADE_TWO = 14;
    public static final int SPADE_THREE = 15;
    public static final int SPADE_FOUR = 16;
    public static final int SPADE_FIVE = 17;
    public static final int SPADE_SIX = 18;
    public static final int SPADE_SEVEN = 19;
    public static final int SPADE_EIGHT = 20;
    public static final int SPADE_NINE = 21;
    public static final int SPADE_TEN = 22;
    public static final int SPADE_JACK = 23;
    public static final int SPADE_QUEEN = 24;
    public static final int SPADE_KING = 25;
    public static final int SPADE_ACE = 26;
    public static final int DIAMOND_TWO = 27;
    public static final int DIAMOND_THREE = 28;
    public static final int DIAMOND_FOUR = 29;
    public static final int DIAMOND_FIVE = 30;
    public static final int DIAMOND_SIX = 31;
    public static final int DIAMOND_SEVEN = 32;
    public static final int DIAMOND_EIGHT = 33;
    public static final int DIAMOND_NINE = 34;
    public static final int DIAMOND_TEN = 35;
    public static final int DIAMOND_JACK = 36;
    public static final int DIAMOND_QUEEN = 37;
    public static final int DIAMOND_KING = 38;
    public static final int DIAMOND_ACE = 39;
    public static final int CLUB_TWO = 40;
    public static final int CLUB_THREE = 41;
    public static final int CLUB_FOUR = 42;
    public static final int CLUB_FIVE = 43;
    public static final int CLUB_SIX = 44;
    public static final int CLUB_SEVEN = 45;
    public static final int CLUB_EIGHT = 46;
    public static final int CLUB_NINE = 47;
    public static final int CLUB_TEN = 48;
    public static final int CLUB_JACK = 49;
    public static final int CLUB_QUEEN = 50;
    public static final int CLUB_KING = 51;
    public static final int CLUB_ACE = 52;

    private CardColor cardColor;
    private CardValue cardValue;

    public static Card of(String card) {
	if (card != null && card.length() == 2) {
	    return Card.builder().cardValue(CardValue.decodeByCode(Character.toString(card.charAt(0)))).cardColor(CardColor.decodeByCode(Character.toString(card.charAt(1))))
		    .build();
	}

	return getUnknownCard();
    }

    public static Card of(int cardId) {
	return Card.builder().cardColor(CardColor.getColorFromCardId(cardId)).cardValue(CardValue.getValueFromCardId(cardId)).build();
    }

    public static Card ofCactusCode(int cactusCode) {
	return Card.builder()//
		.cardColor(CardColor.decodeByCactusCode(cactusCode))//
		.cardValue(CardValue.decodeByCactusCode(cactusCode))//
		.build();
    }

    public static Card getUnknownCard() {
	return Card.builder().cardColor(CardColor.UNKNOWN).cardValue(CardValue.UNKNOWN).build();
    }

    public int cactusValue() {
	return getCardColor().getCactusCode() + getCardValue().getCactusCode();
    }

    public int getCardId() {
	return cardColor.getColorId() * 13 + cardValue.getCardValueId();

    }

    @Override
    public String toString() {
	return cardValue.getCode().toUpperCase() + cardColor.getCode().toLowerCase();
    }

    public String getInfo() {
	StringBuilder sb = new StringBuilder();

	String binaryValue = Integer.toBinaryString(cactusValue());

	sb.append(String.join("", Collections.nCopies(32 - binaryValue.length(), "0")));
	sb.append(binaryValue);
	sb.append(" ");
	sb.append(toString());

	return sb.toString();
    }

    public static Card[] allCards() {
	Card[] cards = new Card[52];

	for (int i = 1; i <= 52; i++) {
	    cards[i - 1] = Card.of(i);
	}
	return cards;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((cardColor == null) ? 0 : cardColor.hashCode());
	result = prime * result + ((cardValue == null) ? 0 : cardValue.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Card other = (Card) obj;
	if (cardColor != other.cardColor)
	    return false;
	if (cardValue != other.cardValue)
	    return false;
	return true;
    }
}
