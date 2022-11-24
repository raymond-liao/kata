package com.tdd.kata;

public class Unit {
    public final static Unit Inch = new Unit(1, "Inch");
    public final static Unit Foot = new Unit(12, "Foot");
    public final static Unit Yard = new Unit(3 * 12, "Yard");
    private final int transferRateToInch;
    public final String text;

    public Unit(int transferRateToInch, String text) {
        this.transferRateToInch = transferRateToInch;
        this.text = text;
    }

    int getAmountInInch(int amount) {
        return amount * transferRateToInch;
    }

    String toString(int amount) {
        return String.format("%d (%s)", amount, text);
    }
}
