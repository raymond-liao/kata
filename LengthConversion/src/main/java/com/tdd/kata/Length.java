package com.tdd.kata;

import static java.lang.String.format;

public class Length {

    private final int amountInInch;
    private final String unit;
    private final int amount;

    public Length(int amount, String unit) {
        this.amount = amount;

        if (unit.equals("Foot")) {
            amountInInch = 12 * amount;
        } else if (unit.equals("Yard")) {
            amountInInch = 3 * 12 * amount;
        } else {
            amountInInch = amount;
        }

        this.unit = unit;
    }

    @Override
    public String toString() {
        return format("%d (%s)", amount, unit);
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;
        return amountInInch == ((Length) obj).amountInInch;
    }
}
