package hu.pli.poker.custom.evalute.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import hu.pli.poker.custom.card.CardValue;
import hu.pli.poker.custom.evalute.HandStrength;
import lombok.Getter;

@Getter
public class CactusKevHands {
	private List<CactusKevHand> hands = new ArrayList<CactusKevHand>() {
		private static final long serialVersionUID = -8817005877464893981L;

		{
			add(new CactusKevHand(6945,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6946,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6947,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6948, new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6949,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6950, new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6951,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6952,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.EIGHT, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6953,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6954,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6955,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6956,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6957,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6958, new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6959,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6960, new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6961,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6962,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6963,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6964,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6965,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6966,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6967,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6968,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6969,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6970,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6971,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6972,
					new CardValue[] { CardValue.KING, CardValue.NINE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6973,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6974,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6975, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6976,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6977, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6978, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6979,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6980, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6981,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6982, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6983,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6984,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6985,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6986,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6987,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6988,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6989, new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(6990,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6991,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6992,
					new CardValue[] { CardValue.KING, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6993,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6994,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6995,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6996,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6997,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6998,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(6999, new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7000,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7001,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7002,
					new CardValue[] { CardValue.KING, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7003,
					new CardValue[] { CardValue.KING, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7004,
					new CardValue[] { CardValue.KING, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7005,
					new CardValue[] { CardValue.KING, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7006,
					new CardValue[] { CardValue.KING, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7007,
					new CardValue[] { CardValue.KING, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7008,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7009,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7010,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7011,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7012,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7013,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7014, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN,
					CardValue.EIGHT, CardValue.SEVEN }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7015,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7016,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7017,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7018, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN,
					CardValue.EIGHT, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7019,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7020,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7021,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7022,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7023, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7024,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7025,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7026,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7027,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7028,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7029,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7030,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7031,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7032,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7033,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7034,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.TEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7035, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.EIGHT, CardValue.SEVEN }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7036,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7037, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.EIGHT, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7038, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.EIGHT, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7039, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.EIGHT, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7040,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7041,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7042, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.SEVEN, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7043, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.SEVEN, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7044, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7045,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7046,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7047,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7048,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7049,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7050,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7051, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7052,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7053, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7054,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7055,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.NINE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7056, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.SIX }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7057, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7058, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7059, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7060, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7061,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7062,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7063, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7064,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7065, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7066, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7067,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7068, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7069,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7070, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.EIGHT,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7071,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7072,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7073, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7074,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7075, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7076, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7077,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7078, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7079,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7080, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7081,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7082,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7083,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7084,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7085,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7086,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7087, new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7088,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7089,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7090,
					new CardValue[] { CardValue.QUEEN, CardValue.JACK, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7091, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE,
					CardValue.EIGHT, CardValue.SEVEN }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7092,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7093,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7094,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7095, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE,
					CardValue.EIGHT, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7096,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7097,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7098,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7099,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7100, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7101,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7102,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7103,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7104,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7105,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7106,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7107,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7108,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7109,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7110,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7111,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.NINE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7112,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7113, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7114, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7115, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7116,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7117,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7118,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7119,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7120,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7121,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7122, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7123,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7124, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7125,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7126,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.EIGHT, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7127,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7128,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7129,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7130,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7131,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7132, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7133,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7134, new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7135,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7136,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7137,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7138,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7139,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7140,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7141,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7142,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7143,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7144,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7145,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7146,
					new CardValue[] { CardValue.QUEEN, CardValue.TEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7147, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.SIX }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7148, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7149, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7150, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7151, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7152,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7153,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7154, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7155,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7156, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7157, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7158,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7159, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7160,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7161, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7162,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7163,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7164, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7165,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7166, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7167, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7168,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7169, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7170,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7171, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7172,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7173,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7174,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7175,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7176,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7177,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7178, new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7179,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7180,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7181,
					new CardValue[] { CardValue.QUEEN, CardValue.NINE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7182, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7183, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7184, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7185,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7186, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7187, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7188, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7189, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7190, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7191, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7192,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7193, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7194,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7195, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7196,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7197,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7198, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7199,
					new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7200, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.FIVE,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7201, new CardValue[] { CardValue.QUEEN, CardValue.EIGHT, CardValue.FOUR,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7202,
					new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7203, new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7204,
					new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7205, new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7206,
					new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7207,
					new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7208, new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7209,
					new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7210, new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.FIVE,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7211, new CardValue[] { CardValue.QUEEN, CardValue.SEVEN, CardValue.FOUR,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7212,
					new CardValue[] { CardValue.QUEEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7213,
					new CardValue[] { CardValue.QUEEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7214,
					new CardValue[] { CardValue.QUEEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7215,
					new CardValue[] { CardValue.QUEEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7216,
					new CardValue[] { CardValue.QUEEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7217,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7218,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7219,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7220,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7221,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7222,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7223,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7224,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7225,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7226,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7227,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7228,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7229,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7230,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7231,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7232,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7233,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7234,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7235,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7236,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.NINE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7237,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7238,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7239,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7240, new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7241,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7242,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7243,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7244,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7245,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7246,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7247,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7248,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7249,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7250,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7251,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.EIGHT, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7252,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7253,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7254,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7255,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7256,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7257,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7258,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7259,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7260,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7261,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7262,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7263,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7264,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7265,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7266,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7267,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7268,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7269,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7270,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7271,
					new CardValue[] { CardValue.JACK, CardValue.TEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7272,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7273, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FIVE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7274, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7275, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7276,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7277,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7278,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7279,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7280,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7281,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7282, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7283,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7284, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7285,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7286,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.EIGHT, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7287,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7288,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7289,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7290,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7291,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7292, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7293,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7294, new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7295,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7296,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7297,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7298,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7299,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7300,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7301,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7302,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7303,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7304,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7305,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7306,
					new CardValue[] { CardValue.JACK, CardValue.NINE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7307,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7308,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7309, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7310,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7311, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7312, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7313,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7314, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7315,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7316, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7317,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7318,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7319,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7320,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7321,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7322,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7323, new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7324,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7325,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7326,
					new CardValue[] { CardValue.JACK, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7327,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7328,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7329,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7330,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7331,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7332,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7333, new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7334,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7335,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7336,
					new CardValue[] { CardValue.JACK, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7337,
					new CardValue[] { CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7338,
					new CardValue[] { CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7339,
					new CardValue[] { CardValue.JACK, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7340,
					new CardValue[] { CardValue.JACK, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7341,
					new CardValue[] { CardValue.JACK, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7342,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7343,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7344, new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT,
					CardValue.SEVEN, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7345,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7346,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7347,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7348,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7349,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7350,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7351,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7352,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7353,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7354,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7355,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.EIGHT, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7356,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7357,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7358,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7359,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7360,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7361,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7362,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7363,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7364,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7365,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7366,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7367,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7368,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7369,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7370,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7371,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7372,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7373,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7374,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7375,
					new CardValue[] { CardValue.TEN, CardValue.NINE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7376,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7377,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7378,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7379,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7380,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7381, new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7382,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7383, new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7384,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7385,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SEVEN, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7386,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7387,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7388,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7389,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7390,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7391,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7392,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7393,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7394,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7395,
					new CardValue[] { CardValue.TEN, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7396,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7397,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7398,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7399,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7400,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7401,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7402,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7403,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7404,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7405,
					new CardValue[] { CardValue.TEN, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7406,
					new CardValue[] { CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7407,
					new CardValue[] { CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7408,
					new CardValue[] { CardValue.TEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7409,
					new CardValue[] { CardValue.TEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7410,
					new CardValue[] { CardValue.TEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7411,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7412, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.SIX, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7413,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7414, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.FOUR }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7415, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7416,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7417, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7418,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7419, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SEVEN,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7420,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7421,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7422,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7423,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7424,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7425,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7426, new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7427,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7428,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7429,
					new CardValue[] { CardValue.NINE, CardValue.EIGHT, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7430,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7431,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7432,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7433,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7434,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7435,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7436, new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7437,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7438,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7439,
					new CardValue[] { CardValue.NINE, CardValue.SEVEN, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7440,
					new CardValue[] { CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7441,
					new CardValue[] { CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7442,
					new CardValue[] { CardValue.NINE, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7443,
					new CardValue[] { CardValue.NINE, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7444,
					new CardValue[] { CardValue.NINE, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7445, new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX,
					CardValue.FIVE, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7446,
					new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7447, new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7448,
					new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7449,
					new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.SIX, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7450, new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE,
					CardValue.FOUR, CardValue.THREE }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7451,
					new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7452, new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.FIVE,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7453, new CardValue[] { CardValue.EIGHT, CardValue.SEVEN, CardValue.FOUR,
					CardValue.THREE, CardValue.TWO }, HandStrength.HIGH_CARD));
			add(new CactusKevHand(7454,
					new CardValue[] { CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.THREE },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7455,
					new CardValue[] { CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7456,
					new CardValue[] { CardValue.EIGHT, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7457,
					new CardValue[] { CardValue.EIGHT, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7458,
					new CardValue[] { CardValue.EIGHT, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7459,
					new CardValue[] { CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.FOUR, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7460,
					new CardValue[] { CardValue.SEVEN, CardValue.SIX, CardValue.FIVE, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7461,
					new CardValue[] { CardValue.SEVEN, CardValue.SIX, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
			add(new CactusKevHand(7462,
					new CardValue[] { CardValue.SEVEN, CardValue.FIVE, CardValue.FOUR, CardValue.THREE, CardValue.TWO },
					HandStrength.HIGH_CARD));
		}
	};

	public static void main(String[] args) {
		// System.out.println("Hi");

		String fileName = "c:\\tmp\\99\\custom\\src\\main\\resources\\hands.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

			String line;
			while ((line = br.readLine()) != null) {
				// System.out.println(line.substring(0, 5) + " " + line.substring(41, 51) + " "
				// + line.substring(53, 55));

				CardValue i1 = CardValue.decodeByCode(line.substring(41, 42));
				CardValue i2 = CardValue.decodeByCode(line.substring(43, 44));
				CardValue i3 = CardValue.decodeByCode(line.substring(45, 46));
				CardValue i4 = CardValue.decodeByCode(line.substring(47, 48));
				CardValue i5 = CardValue.decodeByCode(line.substring(49, 50));

				System.out.println("add(new CactusKevHand(" + line.substring(0, 5).trim()
						+ ", new CardValue[] { CardValue." + i1 + ", CardValue." + i2 + ", CardValue." + i3
						+ ", CardValue." + i4 + ", CardValue." + i5 + "}, HandStrength."
						+ HandStrength.decodeByCactusCode(line.substring(53, 55)) + "));");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
