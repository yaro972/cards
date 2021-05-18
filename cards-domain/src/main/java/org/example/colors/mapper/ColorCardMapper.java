package org.example.colors.mapper;

import org.example.constants.Constants;

public class ColorCardMapper {
    public String mapColor(int colorIndex) {
        if (colorIndex > Constants.CARD_COLORS.length) {
            return "";
        }
        return Constants.CARD_COLORS[colorIndex];
    }
}
