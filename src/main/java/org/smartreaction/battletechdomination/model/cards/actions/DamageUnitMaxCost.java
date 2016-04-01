package org.smartreaction.battletechdomination.model.cards.actions;

public class DamageUnitMaxCost extends Action {
    private int maxCost;

    public DamageUnitMaxCost(int maxCost, String text) {
        this.maxCost = maxCost;
        this.text = text;
    }

    public int getMaxCost() {
        return maxCost;
    }
}
