package com.tnsif.day5.multilevelheritance.texteditor;

public class Wordpad extends Notepad {
    private boolean isBold;

    public Wordpad() {
        super();
        this.isBold = false;
    }

    public void formatText(boolean bold) {
        if (bold) {
            content = "<a>" + content + "</b>";
        }
        isBold = bold;
    }

    public boolean isBold() {
        return isBold;
    }
}