package org.smartreaction.battletechdomination.model.cards.unit.mech;

import org.smartreaction.battletechdomination.model.cards.MechUnit;
import org.smartreaction.battletechdomination.model.cards.abilities.GreatDeath;

public class Daishi extends MechUnit implements GreatDeath {
    public Daishi() {
        name = "Daishi";
        subName = "DIRE WOLF";
        cardText = "\"GREAT DEATH\": When you overrun your opponent, he must damage an additional unit at the end of your Combat phase.";
        attack = 5;
        defense = 4;
        industryCost = 9;
        losTechCost = 1;
    }
}
