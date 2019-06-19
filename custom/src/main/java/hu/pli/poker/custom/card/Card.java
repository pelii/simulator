package hu.pli.poker.custom.card;

import java.util.Collections;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Card {
	private CardColor cardColor;
	private CardValue cardValue;

	public static Card of(String card) {
		if (card != null && card.length() == 2) {
			return Card.builder().cardValue(CardValue.decodeByCode(Character.toString(card.charAt(0))))
					.cardColor(CardColor.decodeByCode(Character.toString(card.charAt(1)))).build();
		}

		return getEmptyCard();
	}

	public static Card of(int cardId) {
		return Card.builder().cardColor(CardColor.getColorFromCardId(cardId))
				.cardValue(CardValue.getValueFromCardId(cardId)).build();
	}

	public static Card getEmptyCard() {
		return Card.builder().cardColor(CardColor.UNKNOWN).cardValue(CardValue.UNKNOWN).build();
	}

	public int cactusValue() {
		return getCardColor().getCactusCode() + getCardValue().getCactusCode();
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

	public static void main(String... args) {
		for (int i = 1; i <= 52; i++) {
			Card card = Card.of(i);

			Integer primeNumberOfRank = card.getCardValue().getCactusCode();
			Integer cdhs = card.getCardColor().getCactusCode();
			
			Integer value = primeNumberOfRank + cdhs;

			System.out.println(card + " " + value + " " + Integer.toBinaryString(value));

		}
		
		Card card1 = Card.of("As");
		Card card2 = Card.of("Ts");
		Card card3 = Card.of("6d");
		Card card4 = Card.of("4s");
		Card card5 = Card.of("2s");
		System.out.println(card1.getInfo());
		System.out.println(card2.getInfo());
		System.out.println(card3.getInfo());
		System.out.println(card4.getInfo());
		System.out.println(card5.getInfo());
		
		
		System.out.println(card1.cactusValue() & card2.cactusValue() & card3.cactusValue() & card4.cactusValue() & card5.cactusValue() & 0xF000);
	}
}
