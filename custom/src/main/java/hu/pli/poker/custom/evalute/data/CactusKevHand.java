package hu.pli.poker.custom.evalute.data;

import hu.pli.poker.custom.card.CardValue;
import hu.pli.poker.custom.evalute.HandStrength;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CactusKevHand {
	private int rank;
	private CardValue[] sample;
	private HandStrength handStrength;
}
