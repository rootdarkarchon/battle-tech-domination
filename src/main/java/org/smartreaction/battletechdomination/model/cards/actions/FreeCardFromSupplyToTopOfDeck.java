package org.smartreaction.battletechdomination.model.cards.actions;

import org.smartreaction.battletechdomination.model.cards.Card;
import org.smartreaction.battletechdomination.model.players.Player;

public class FreeCardFromSupplyToTopOfDeck extends Action {
    private Integer maxCost;

    public FreeCardFromSupplyToTopOfDeck(Integer maxCost, String text) {
        this.maxCost = maxCost;
        this.text = text;
    }

    public Integer getMaxCost() {
        return maxCost;
    }

    @Override
    public boolean isCardActionable(Card card, String cardLocation, Player player) {
        return cardLocation.equals(Card.CARD_LOCATION_SUPPLY) && (maxCost == null || card.getIndustryCost() <= maxCost);
    }

    @Override
    public boolean processAction(Player player) {
        if (player.getGame().getSupplyGrid().isEmpty()) {
            return false;
        } else {
            player.addGameLog(player.getPlayerName() + " is choosing a free card from the supply to put on top of their deck");
            return true;
        }
    }
}
