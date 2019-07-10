package hu.pli.poker.custom.equitycalculate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EquityCalculateResultItem {
    int playerId;
    double percent;
}
