package hu.pli.poker.custom.player;

import hu.pli.poker.custom.board.CoveredCards;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PlayerCard {
    private int playerId;
    CoveredCards coverredCards;
}
