package hu.pli.poker.custom.board;

import java.util.List;

import hu.pli.poker.custom.card.Card;
import hu.pli.poker.custom.utils.CardUtils;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder
public class Flop {
    private Card card1;
    private Card card2;
    private Card card3;

    @Tolerate
    public Flop(String cardStr) {
	List<Card> cards = CardUtils.convertStringToCardList(cardStr);
	if (cards.size() == 3) {
	    card1 = cards.get(0);
	    card2 = cards.get(1);
	    card3 = cards.get(2);
	} else {
	    card1 = card2 = card3 = Card.getUnknownCard();
	}
    }

    @Override
    public String toString() {
	return card1 + "," + card2 + "," + card3;
    }

    public boolean isExists() {
	return card1 != null && card2 != null && card3 != null;
    }
}
