package hu.pli.poker.custom.board;

import hu.pli.poker.custom.card.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class River {
    private Card card;

    @Override
    public String toString() {
	return card.toString();
    }

    public boolean isExists() {
	return card != null;
    }

}
