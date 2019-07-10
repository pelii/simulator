package hu.pli.poker.custom.equitycalculate;

import java.util.ArrayList;
import java.util.List;

public class EquityCalculateResult {
    private List<EquityCalculateResultItem> equityCalculateResultItems;

    public EquityCalculateResult() {
	equityCalculateResultItems = new ArrayList<>();
    }

    public void addNewResult(EquityCalculateResultItem item) {
	equityCalculateResultItems.add(item);
    }

}
