package org.example.colors;

import org.example.colors.impl.ColorRandomImpl;
import org.example.models.cards.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ColorRandomTest {

    @Test
    public void shouldGetRandomColors() {
        Card card1 = new Card();
        Card card2 = new Card();
        ColorRandom colorRandom = new ColorRandomImpl();

        card1.setColor(colorRandom.getRandomColor());
        card2.setColor(colorRandom.getRandomColor());

        assertNotEquals(card1.getColor(), card2.getColor());
    }
}
