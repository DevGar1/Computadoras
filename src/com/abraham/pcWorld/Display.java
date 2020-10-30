package com.abraham.pcWorld;

public class Display {
    private final int displayId;
    private String mark;
    private double size;
    private static int displayCount;

    Display() {
        this.displayId = ++Display.displayCount;
    }

    public Display(String mark, double size) {
        this();
        this.mark = mark;
        this.size = size;
    }

    public int getDisplayId() {
        return displayId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getDisplayCount() {
        return displayCount;
    }

    @Override
    public String toString() {
        return "Display{" +
                "\ndisplayId=" + displayId +
                "\nmark='" + mark + '\'' +
                "\nsize=" + size +
                "\n}";
    }
}
