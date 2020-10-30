package com.abraham.pcWorld;

import java.util.Arrays;

public class Order{
    private final int orderId;
    private final Computer[] computers;
    private static int orderCount;
    private int computersCount;
    private static final int MAX_COMPUTERS = 5;

    public Order() {
        this.orderId = ++Order.orderCount;
        this.computers = new Computer[MAX_COMPUTERS];
        this.computersCount = 0;
    }

    public void addComputer(Computer computer) {
        boolean is = false;
        int i;
        for (i = 0; i < this.computers.length; i++) {
            if (this.computers[i] == null) {
                is = true;
                break;
            }
        }
        if (is) {
            this.computers[i] = computer;
        }
    }

    public void showOrder() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "--Order: \n" +
                "orderId=" + orderId +
                "\ncomputers=" + Arrays.toString(computers);
    }
}
