package com.tdd.kata;

public class Length {
    private final int amountInInch;
    private final int amount;
    private final String unit;

    public Length(int amount, String unit) {
        this.amount = amount;
        this.unit = unit;
        if (unit.equals("Foot")) {
            this.amountInInch = amount * 12;
        } else if (unit.equals("Yard")) {
            this.amountInInch = amount * 3 * 12;
        } else {
            this.amountInInch = amount;
        }
    }

    @Override
    public String toString() {
        return String.format("%d (%s)", amount, unit);
    }

    @Override
    public boolean equals(Object obj) {
        return amountInInch == ((Length) obj).amountInInch;
    }
}
