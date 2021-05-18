package org.example.colors;

import java.util.Arrays;
import java.util.List;

public class ColorAbstract {
    private final List<String> ColorList = Arrays.asList("carreaux", "coeur", "pique", "trefle");

    public List<String> getColorList() {
        return ColorList;
    }
}
