package com.tdd.kata;

public class Length {
    private final int amount;
    private final String unit;
    private final int amountInInch;

    public Length(int amount, String unit) {
        if (unit.equals("Foot")) {
            amountInInch = amount * 12;
        } else if (unit.equals("Yard")) {
            amountInInch = amount * 12 * 3;
        } else {
            amountInInch = amount;
        }

        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;
        return amountInInch == ((Length) obj).amountInInch;
    }

    @Override
    public String toString() {
        return String.format("%d (%s)", amount, unit);
    }
}
