package hu.pli.poker.custom.board;

import hu.pli.poker.custom.card.Card;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Turn {
	private Card card;
	
	@Override
	public String toString() {
		return card.toString();
	}
}
