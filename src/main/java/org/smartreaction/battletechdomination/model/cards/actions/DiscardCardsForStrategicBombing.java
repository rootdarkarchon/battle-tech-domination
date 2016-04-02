package org.smartreaction.battletechdomination.model.cards.actions;

import org.smartreaction.battletechdomination.model.cards.Card;

import java.util.List;

public class DiscardCardsForStrategicBombing extends Action {
    private List<Card> revealedCards;

    private List<Card> discardedCards;

    public DiscardCardsForStrategicBombing(List<Card> revealedCards, String text) {
        this.revealedCards = revealedCards;
        this.text = text;
    }

    public List<Card> getRevealedCards() {
        return revealedCards;
    }

    public List<Card> getDiscardedCards() {
        return discardedCards;
    }

    public void setDiscardedCards(List<Card> discardedCards) {
        this.discardedCards = discardedCards;
    }
}