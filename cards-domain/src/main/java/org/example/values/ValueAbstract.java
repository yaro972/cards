package org.example.values;

import org.example.constants.Constants;

public class ValueAbstract {
    private final String[] valueList = Constants.CARD_VALUES;

    public String[] getValueList() {
        return valueList;
    }
}
