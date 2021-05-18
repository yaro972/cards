package org.example.hand;

import org.example.exceptions.TooLessCardsNbException;
import org.example.hand.impl.HandImpl;
import org.example.models.cards.Card;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HandTest {

    @Test
    public void shouldGet10Cards() throws TooLessCardsNbException {
        final int nb_Card = 10;
        Hand hand = new HandImpl();


        Collection<Card> handList = hand.getCards(nb_Card);

        assertEquals(10, handList.size());
    }

}
