package org.smartreaction.battletechdomination.model.cards.unit.mech;

import org.smartreaction.battletechdomination.model.cards.MechUnit;

public class Stormcrow extends MechUnit {
    public Stormcrow() {
        name = "Stormcrow";
        subName = "RYOKEN";
        cardText = "COUNTER ATTACK: When this unit is damaged, your opponent must damage a unit with the highest Industry cost in his deployment zone.";
        attack = 3;
        defense = 1;
        industryCost = 4;
        losTechCost = 1;
    }

    //todo
}
