package org.smartreaction.battletechdomination.model.cards;

import org.smartreaction.battletechdomination.model.players.Player;

import java.util.Objects;
import java.util.UUID;

public abstract class Card {
    protected String id;
    protected String name;
    protected String subName;
    protected String cardText;
    protected CardType cardType;
    protected int industryCost;
    protected int losTechCost;
    protected CardLocation cardLocation;

    protected Card() {
        id = UUID.randomUUID().toString();
    }

    public abstract void cardPlayed(Player player);

    public void choiceMade(int choice, Player player) {

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }

        final Card other = (Card) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public int getIndustryCost() {
        return industryCost;
    }

    public void setIndustryCost(int industryCost) {
        this.industryCost = industryCost;
    }

    public int getLosTechCost() {
        return losTechCost;
    }

    public void setLosTechCost(int losTechCost) {
        this.losTechCost = losTechCost;
    }

    public CardLocation getCardLocation() {
        return cardLocation;
    }

    public void setCardLocation(CardLocation cardLocation) {
        this.cardLocation = cardLocation;
    }

    public boolean isUnit() {
        return this instanceof Unit;
    }

    public boolean isResource() {
        return this instanceof Resource;
    }

    public String getId() {
        return id;
    }
}
