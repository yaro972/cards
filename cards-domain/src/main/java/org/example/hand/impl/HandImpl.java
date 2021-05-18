package org.example.hand.impl;

import org.example.colors.ColorRandom;
import org.example.colors.impl.ColorRandomImpl;
import org.example.exceptions.TooLessCardsNbException;
import org.example.hand.Hand;
import org.example.models.cards.Card;
import org.example.values.ValueRandom;
import org.example.values.impl.ValueRandomImpl;

import java.util.Collection;
import java.util.HashSet;

public class HandImpl implements Hand {
    @Override
    public Collection<Card> getCards(int nb_Card) throws TooLessCardsNbException {
        Collection<Card> cardList = new HashSet<>();

        if (nb_Card == 0) {
            throw new TooLessCardsNbException("pas assez de cartes à choisir");
        }

        for (int nb = 0; nb <= nb_Card; nb++) {
            Card card = new Card();
            ColorRandom colorRandom = new ColorRandomImpl();
            ValueRandom valueRandom = new ValueRandomImpl();

            card.setColor(colorRandom.getRandomColor());
            card.setValeur(valueRandom.getRandomValue());

            cardList.add(card);
        }

        return cardList;
    }
}
