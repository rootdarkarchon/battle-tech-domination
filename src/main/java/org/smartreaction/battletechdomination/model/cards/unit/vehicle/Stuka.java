package org.smartreaction.battletechdomination.model.cards.unit.vehicle;

import org.smartreaction.battletechdomination.model.cards.VehicleUnit;
import org.smartreaction.battletechdomination.model.cards.abilities.unit.Aerospace;

public class Stuka extends VehicleUnit {
    public Stuka() {
        name = "Stuka";
        subName = "STU-K5";
        cardText = "AEROSPACE: Damage this unit if you are Overrun or if you Overrun your opponent.";
        attack = 4;
        defense = 0;
        industryCost = 4;
        imageFile = "Stuka.png";

        addAbility(new Aerospace(this));
    }
}
