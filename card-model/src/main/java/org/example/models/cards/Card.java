package org.example.models.cards;

import java.util.Objects;

public class Card {
    private String color;
    private String valeur;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(color, card.color) && Objects.equals(valeur, card.valeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, valeur);
    }
}
