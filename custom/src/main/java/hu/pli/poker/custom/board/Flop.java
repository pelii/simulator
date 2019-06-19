package hu.pli.poker.custom.board;

import hu.pli.poker.custom.card.Card;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Flop {
	private Card card1;
	private Card card2;
	private Card card3;
	
	@Override
	public String toString() {
		return card1 + "," + card2 + "," + card3;
	}
}
