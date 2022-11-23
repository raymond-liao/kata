package com.tdd.kata;

public class Unit {

    public static Unit Inch = new Unit("Inch", 1);
    public static Unit Foot = new Unit("Foot", 12);
    public static Unit Yard = new Unit("Yard", 3 * 12);
    private final String text;
    private final int transferRateToInch;

    public Unit(String text, int transferRateToInch) {
        this.text = text;
        this.transferRateToInch = transferRateToInch;
    }

    public String toString(int amount) {
        return String.format("%d (%s)", amount, text);
    }


    public int getAmountInInch(int amount) {
        return amount * transferRateToInch;
    }
}
