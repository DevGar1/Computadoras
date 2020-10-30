package com.abraham.pcWorld;

public class Computer {
    private final int computerId;
    private String name;
    private Display display;
    private KeyBoard keyBoard;
    private Mouse mouse;
    private static int computerCount;


    public Computer () {
        this.computerId = ++Computer.computerCount;
    }

    public Computer(String name, Display display, KeyBoard keyBoard, Mouse mouse) {
        this();
        this.name = name;
        this.display = display;
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    public int getComputerId() {
        return computerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public KeyBoard getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public static int getComputerCount() {
        return computerCount;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "computerId=" + computerId +
                ", name='" + name + '\'' +
                ", display=" + display +
                ", keyBoard=" + keyBoard +
                ", mouse=" + mouse +
                '}';
    }
}
