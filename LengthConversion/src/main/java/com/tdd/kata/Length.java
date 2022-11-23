package com.tdd.kata;

public class Length {
    private final int amount;
    private final Unit unit;

    public Length(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return unit.getString(amount);
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass()) return false;
        Length another = (Length) obj;
        return getAmountInInch() == another.getAmountInInch();
    }

    private int getAmountInInch() {
        return unit.getAmountInInch(amount);
    }
}
