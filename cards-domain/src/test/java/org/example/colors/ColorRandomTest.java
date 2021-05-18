package org.example.colors;

import org.example.models.cards.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ColorRandomTest {

    @Test
    public void shouldGetRandomColors() {
        Card card1 = new Card();
        Card card2 = new Card();
        ColorRandom colorRandom = new ColorRandom();

        Card colorCard1 = colorRandom.getRandomColor(card1);
        Card colorCard2 = colorRandom.getRandomColor(card2);

        System.out.println(card1.getColor());
        System.out.println(card2.getColor());

        assertFalse(card1.equals(card2));
    }
}
