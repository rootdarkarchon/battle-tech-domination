package org.smartreaction.battletechdomination.model.cards.unit.mech;

import org.smartreaction.battletechdomination.model.cards.MechUnit;
import org.smartreaction.battletechdomination.model.cards.abilities.HeavyFireSupport;

public class Catapult extends MechUnit implements HeavyFireSupport {
    public Catapult() {
        name = "Catapult";
        subName = "CPLT-C1";
        cardText = "HEAVY FIRE SUPPORT: Once per turn during your Action phase, you may discard a Unit card from your hand. If you do, your opponent must damage a unit.";
        attack = 0;
        defense = 2;
        industryCost = 5;
    }
}
