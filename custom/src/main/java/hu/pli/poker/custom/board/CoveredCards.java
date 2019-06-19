package hu.pli.poker.custom.board;

import hu.pli.poker.custom.card.Card;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CoveredCards {
	private Card card1;
	private Card card2;

	@Override
	public String toString() {
		return card1 + "," + card2;
	}
}
