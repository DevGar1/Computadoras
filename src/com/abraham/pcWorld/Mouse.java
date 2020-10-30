package com.abraham.pcWorld;

public class Mouse extends InputDevice{
    private final int mouseId;
    private static int mouseCount;

    public Mouse(String inputType, String mark) {
        super(inputType, mark);
        this.mouseId = ++Mouse.mouseCount;
    }

    public int getMouseId() {
        return mouseId;
    }

    public static int getMouseCount() {
        return mouseCount;
    }

    public static void setMouseCount(int mouseCount) {
        Mouse.mouseCount = mouseCount;
    }

    @Override
    public String toString() {
        return "id: " + this.mouseId +
                "*Mouse" +
                "\ntypeInput: " + this.getInputType() +
                "\n mark: " + this.getMark();
    }
}
