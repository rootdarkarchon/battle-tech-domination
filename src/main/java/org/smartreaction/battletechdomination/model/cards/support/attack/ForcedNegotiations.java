package org.smartreaction.battletechdomination.model.cards.support.attack;

import org.smartreaction.battletechdomination.model.Player;
import org.smartreaction.battletechdomination.model.cards.SupportAttack;
import org.smartreaction.battletechdomination.model.cards.actions.UnitFromHandToTopOfDeck;

public class ForcedNegotiations extends SupportAttack {
    public ForcedNegotiations() {
        name = "Forced Negotiations";
        cardText = "Discard a card. Gain a Munitions Factory. Your opponent must place a Unit card from his hand on top of his draw deck or reveal a hand with no Unit cards.";
        industryCost = 5;
    }

    @Override
    public void cardPlayed(Player player) {
        player.discardCardFromHand();
        player.gainMunitionsFactory();
        player.addOpponentAction(new UnitFromHandToTopOfDeck());
    }
}
