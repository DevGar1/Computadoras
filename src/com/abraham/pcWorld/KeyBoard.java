package com.abraham.pcWorld;

public class KeyBoard extends InputDevice {
    private final int keyBoardId;
    private static int keyBoardCount;

    public KeyBoard(String inputType, String mark) {
        super(inputType, mark);
        this.keyBoardId = ++KeyBoard.keyBoardCount;
    }

    public int getKeyBoardId() {
        return keyBoardId;
    }




    @Override
    public String toString() {
        return "id: " + this.keyBoardId +
                "*KeyBoard" +
                "\ntypeInput: " + this.getInputType() +
                "\n mark: " + this.getMark();
    }
}
