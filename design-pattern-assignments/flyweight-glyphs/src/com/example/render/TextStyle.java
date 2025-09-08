package com.example.render;

public class TextStyle {
    private final String font;
    private final int size;
    private final boolean isBold;

    public TextStyle(String font, int size, boolean isBold) {
        this.font = font;
        this.size = size;
        this.isBold = isBold;
    }

    public String getFont() { 
        return font; 
    }
    public int getSize() { 
        return size; 
    }
    public boolean isBold() {
        return isBold;
    }
}
