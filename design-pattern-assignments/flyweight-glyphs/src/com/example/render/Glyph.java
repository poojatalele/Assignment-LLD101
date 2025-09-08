package com.example.render;
import org.w3c.dom.Text;

public class Glyph {
    // Smell: style stored per instance → not memory efficient
    private final char ch;
    private final TextStyle ts;

    public Glyph(char ch, TextStyle ts) {
        this.ch = ch;
        this.ts = ts;
    }

    public int drawCost() { 
        return ts.getSize() + (ts.isBold() ? 10 : 0); 
    }
    
    public char getCh() { 
        return ch; 
    }

    public String getFont() { 
        return ts.getFont(); 
    }
    public int getSize() { 
        return ts.getSize(); 
    }
    public boolean isBold() { 
        return ts.isBold(); 
    }
}
