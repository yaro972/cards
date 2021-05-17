package org.example.models.cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    @Test
    public void cardDoHavePropertyNamedCouleur() {
        final Card card = new Card();

        card.setColor("carreau");

        assertEquals("carreau", card.getColor());
    }

    @Test
    public void cardDoHavePropertyNamedValeur() {
        final Card card = new Card();

        card.setValeur("As");

        assertEquals("As", card.getValeur());
    }
}
