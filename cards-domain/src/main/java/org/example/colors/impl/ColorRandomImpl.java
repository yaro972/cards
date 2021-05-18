package org.example.colors.impl;

import org.example.colors.ColorAbstract;
import org.example.colors.ColorRandom;
import org.example.colors.mapper.ColorCardMapper;

public class ColorRandomImpl extends ColorAbstract implements ColorRandom {
    public String getRandomColor() {
        int colorIndex = (int) Math.floor(Math.random() * getColorList().length);
        ColorCardMapper colorCardMapper = new ColorCardMapper();


        return colorCardMapper.mapColor(colorIndex);
    }

}
