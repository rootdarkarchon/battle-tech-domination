package org.smartreaction.battletechdomination.model.cards.actions;

import org.smartreaction.battletechdomination.model.Choice;
import org.smartreaction.battletechdomination.model.cards.Card;
import org.smartreaction.battletechdomination.model.players.Player;

import java.util.List;

public abstract class Action {
    protected String text;

    public String getText() {
        return text;
    }

    public List<Choice> getChoices() {
        return null;
    }

    public abstract boolean isCardActionable(Card card, String cardLocation, Player player);

    public abstract boolean processAction(Player player);

    public abstract void processActionResult(Player player, ActionResult result);
}
