package org.smartreaction.battletechdomination.model.cards.unit.vehicle;

import org.smartreaction.battletechdomination.model.cards.VehicleUnit;
import org.smartreaction.battletechdomination.model.cards.abilities.unit.Aerospace;
import org.smartreaction.battletechdomination.model.cards.abilities.unit.StrafingRun;

public class Slayer extends VehicleUnit {
    public Slayer() {
        name = "Slayer";
        subName = "SL-15";
        cardText = "STRAFING RUN: You may damage this unit at the start of your Combat phase. If you do, your opponent must damage a Mech. AEROSPACE: Damage this unit if you are Overrun or if you Overrun your opponent.";
        attack = 1;
        defense = 0;
        industryCost = 3;
        imageFile = "Slayer.png";

        addAbility(new StrafingRun(this));
        addAbility(new Aerospace(this));
    }
}
