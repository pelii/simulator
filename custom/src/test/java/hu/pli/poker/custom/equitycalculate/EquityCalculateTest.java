package hu.pli.poker.custom.equitycalculate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import hu.pli.poker.custom.board.Board;
import hu.pli.poker.custom.board.CoveredCards;
import hu.pli.poker.custom.player.PlayerCard;

public class EquityCalculateTest {

    @Test
    public void test() {
	Board board = new Board("Ts,3h,8d,2d");
	List<PlayerCard> playerCard = new ArrayList<>();
	playerCard.add(PlayerCard.builder().coverredCards(new CoveredCards("Ad,5d")).playerId(1).build());
	playerCard.add(PlayerCard.builder().coverredCards(new CoveredCards("9s,Tc")).playerId(2).build());

	EquityCalculate testObj = new EquityCalculate(board, playerCard);

    }

}
