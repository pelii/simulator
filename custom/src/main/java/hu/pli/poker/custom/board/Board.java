package hu.pli.poker.custom.board;

import java.util.ArrayList;
import java.util.List;

import hu.pli.poker.custom.card.Card;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder
public class Board {
	private Flop flop;
	private Turn turn;
	private River river;

	@Tolerate
	public Board(List<Card> cards) {
		flop = Flop.builder().card1(cards.get(0)).card2(cards.get(1)).card3(cards.get(2)).build();
		turn = Turn.builder().card(cards.get(3)).build();
		river = River.builder().card(cards.get(4)).build();
	}

	public List<Card> getCards() {
		List<Card> cards = new ArrayList<>();
		cards.add(getFlop().getCard1());
		cards.add(getFlop().getCard2());
		cards.add(getFlop().getCard3());

		cards.add(getTurn().getCard());
		cards.add(getRiver().getCard());

		return cards;
	}

	@Override
	public String toString() {
		return flop.toString() + "," + turn.toString() + "," + river.toString();
	}
}
