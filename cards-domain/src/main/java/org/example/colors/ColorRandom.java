package org.example.colors;

import org.example.colors.mapper.ColorCardMapper;
import org.example.models.cards.Card;

public class ColorRandom extends ColorAbstract {
    public Card getRandomColor(Card card) {
        int colorIndex = (int) Math.floor(Math.random() * getColorList().size());
        ColorCardMapper colorCardMapper = new ColorCardMapper();

        String colorName = colorCardMapper.mapColor(colorIndex);

        card.setColor(colorName);
        return card;
    }

}
