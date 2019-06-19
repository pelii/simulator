package hu.pli.poker.custom.evalute;

import lombok.Getter;

@Getter
public enum HandStrength {
	UNKNOWN("?"), //
	STRAIGHT_FLUSH("SF"), //
	POKER("4K"), //
	FULL("FH"), //
	FLUSH("F"), //
	STRAIGHT("S"), //
	SET("3K"), //
	TWO_PAR("2P"), //
	ONE_PAIR("1P"), //
	HIGH_CARD("HC");

	private String cactusCode;

	HandStrength(String cactusCode) {
		this.cactusCode = cactusCode;
	}

	public static HandStrength decodeByCactusCode(String cactusCode) {
		for (HandStrength handStrength : HandStrength.values()) {
			if (handStrength.getCactusCode().equals(cactusCode)) {
				return handStrength;
			}
		}
		return HandStrength.UNKNOWN;
	}
}
