package com.example.render;

import java.util.HashMap;

public class TextStyleFactory {
    private HashMap<String, TextStyle> styles = new HashMap<>();

    public TextStyle getStyle(String font, int size, boolean isBold) {
        String key = font + "|" + size + "|" + isBold;
        if (!styles.containsKey(key)) {
            styles.put(key, new TextStyle(font, size, isBold));
        }
        return styles.get(key);
    }
}
