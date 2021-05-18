package org.example.values.impl;

import org.example.colors.mapper.ValueCardMapper;
import org.example.values.ValueAbstract;
import org.example.values.ValueRandom;

public class ValueRandomImpl extends ValueAbstract implements ValueRandom {
    public String getRandomValue() {
        int valueIndex = (int) Math.floor(Math.random() * getValueList().length);
        ValueCardMapper valueCardMapper = new ValueCardMapper();


        return valueCardMapper.mapValue(valueIndex);
    }
}
