package org.example.colors.mapper;

import org.example.constants.Constants;

public class ValueCardMapper {
    public String mapValue(int index) {

        if (index > Constants.CARD_VALUES.length) {
            return null;
        }

        return Constants.CARD_VALUES[index];
    }
}
