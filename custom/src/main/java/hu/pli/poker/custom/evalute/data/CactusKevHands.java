package hu.pli.poker.custom.evalute.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import hu.pli.poker.custom.card.CardValue;
import hu.pli.poker.custom.evalute.HandStrength;
import lombok.Getter;

@Getter
public class CactusKevHands {

    private static Map<Integer, CactusKevHand> hands = null;

    public static CactusKevHand getByRank(int rank) {
	if (hands == null) {
	    init();
	}

	if (hands.containsKey(rank)) {
	    return hands.get(rank);
	}

	return hands.get(0);
    }

    private static void init() {
	hands = new HashMap<>();
	hands.put(0, new CactusKevHand(0, new CardValue[] { CardValue.UNKNOWN, CardValue.UNKNOWN, CardValue.UNKNOWN, CardValue.UNKNOWN, CardValue.UNKNOWN }, HandStrength.UNKNOWN));

	File file = new File(CactusKevHands.class.getClassLoader().getResource("hands.txt").getFile());
	try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

	    String line;
	    while ((line = br.readLine()) != null) {
		CardValue i1 = CardValue.decodeByCode(line.substring(41, 42));
		CardValue i2 = CardValue.decodeByCode(line.substring(43, 44));
		CardValue i3 = CardValue.decodeByCode(line.substring(45, 46));
		CardValue i4 = CardValue.decodeByCode(line.substring(47, 48));
		CardValue i5 = CardValue.decodeByCode(line.substring(49, 50));

		Integer id = Integer.parseInt(line.substring(0, 5).trim());

		hands.put(id, new CactusKevHand(id, new CardValue[] { i1, i2, i3, i4, i5 }, HandStrength.decodeByCactusCode(line.substring(53, 55).trim())));
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

    public static void main(String[] args) {
	File file = new File(new CactusKevHands().getClass().getClassLoader().getResource("hands.txt").getFile());
	try (BufferedReader br = new BufferedReader(new FileReader(file.getAbsolutePath()))) {

	    String line;
	    while ((line = br.readLine()) != null) {
		CardValue i1 = CardValue.decodeByCode(line.substring(41, 42));
		CardValue i2 = CardValue.decodeByCode(line.substring(43, 44));
		CardValue i3 = CardValue.decodeByCode(line.substring(45, 46));
		CardValue i4 = CardValue.decodeByCode(line.substring(47, 48));
		CardValue i5 = CardValue.decodeByCode(line.substring(49, 50));

		System.out.println("hands.put(" + line.substring(0, 5).trim() + ",new CactusKevHand(" + line.substring(0, 5).trim() + ", new CardValue[] { CardValue." + i1
			+ ", CardValue." + i2 + ", CardValue." + i3 + ", CardValue." + i4 + ", CardValue." + i5 + "}, HandStrength."
			+ HandStrength.decodeByCactusCode(line.substring(53, 55)) + "));");
	    }

	} catch (IOException e) {
	    e.printStackTrace();
	}

    }

}
