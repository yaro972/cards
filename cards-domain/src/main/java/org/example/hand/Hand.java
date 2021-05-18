package org.example.hand;

import org.example.exceptions.TooLessCardsNbException;
import org.example.models.cards.Card;

import java.util.Collection;

public interface Hand {
    Collection<Card> getCards(int nb_Card) throws TooLessCardsNbException;
}
