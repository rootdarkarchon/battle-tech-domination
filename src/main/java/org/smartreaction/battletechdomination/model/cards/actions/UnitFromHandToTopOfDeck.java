package org.smartreaction.battletechdomination.model.cards.actions;

import org.smartreaction.battletechdomination.model.cards.Card;
import org.smartreaction.battletechdomination.model.players.Player;

public class UnitFromHandToTopOfDeck extends Action {
    public UnitFromHandToTopOfDeck(String text) {
        this.text = text;
    }

    @Override
    public boolean isCardActionable(Card card, String cardLocation, Player player) {
        return cardLocation.equals(Card.CARD_LOCATION_HAND);
    }

    @Override
    public boolean processAction(Player player) {
        if (player.numUnitsInHand() == 0) {
            return false;
        } else {
            player.addGameLog(player.getPlayerName() + " is moving a Unit from their hand to the top of their deck");
            return true;
        }
    }
}
