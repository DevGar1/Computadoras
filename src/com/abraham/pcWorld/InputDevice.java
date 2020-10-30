package com.abraham.pcWorld;

public class InputDevice {
    protected String inputType;
    protected String mark;

    public InputDevice(String inputType, String mark) {
        this.inputType = inputType;
        this.mark = mark;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "InputDevice{" +
                "inputType='" + inputType + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}
