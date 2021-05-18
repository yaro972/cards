package org.example.colors.mapper;

public class ColorCardMapper {
    public String mapColor(int colorIndex) {
        switch (colorIndex) {
            case 0:
                return "carreaux";
            case 1:
                return "coeur";
            case 2:
                return "pique";
            case 3:
                return "trefle";
            default:
                return "";
        }
    }
}
