package hu.pli.poker.custom.board;

import java.util.ArrayList;
import java.util.List;

import hu.pli.poker.custom.card.Card;
import hu.pli.poker.custom.utils.CardUtils;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CoveredCards {
    private int card1;
    private int card2;

    public List<Card> getCards() {
	List<Card> cards = new ArrayList<>();
	cards.add(Card.of(card1));
	cards.add(Card.of(card2));

	return cards;
    }

    public int[] getCardIds() {
	int[] result = new int[2];

	result[0] = card1;
	result[1] = card2;

	return result;
    }

    public CoveredCards(String cardString) {
	int[] cards = CardUtils.convertStringToIntArray(cardString);

	if (cards.length == 2) {
	    card1 = cards[0];
	    card2 = cards[1];
	} else {
	    card1 = Card.UNKNOWN_CARD;
	    card2 = Card.UNKNOWN_CARD;
	}
    }

}
