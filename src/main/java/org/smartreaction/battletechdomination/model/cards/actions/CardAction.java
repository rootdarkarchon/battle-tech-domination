package org.smartreaction.battletechdomination.model.cards.actions;

import org.smartreaction.battletechdomination.model.cards.Card;

import java.util.List;

public class CardAction implements Action {
    private Card card;

    private List<Card> selectedCards;

    public CardAction(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public List<Card> getSelectedCards() {
        return selectedCards;
    }

    public void setSelectedCards(List<Card> selectedCards) {
        this.selectedCards = selectedCards;
    }
}
