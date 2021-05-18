package org.example.values;

import org.example.models.cards.Card;
import org.example.values.impl.ValueRandomImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueRandomImplTest {

    @Test
    public void shouldGetRandomValue() {
        Card card1 = new Card();
        Card card2 = new Card();

        ValueRandom valueRandomImpl = new ValueRandomImpl();

        card1.setValeur(valueRandomImpl.getRandomValue());
        card2.setValeur(valueRandomImpl.getRandomValue());

        System.out.println(card1.getValeur());
        System.out.println(card2.getValeur());

        Assertions.assertNotEquals(card1.getValeur(), card2.getValeur());
    }

}
