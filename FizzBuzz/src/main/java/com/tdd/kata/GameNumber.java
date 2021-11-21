package com.tdd.kata;

public class GameNumber {
    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        String result = "";
        if (isRelatedBy(3)) result += "Fizz";
        if (isRelatedBy(5)) result += "Buzz";
        if (result.isEmpty()) result += String.valueOf(rawNumber);
        return result;
    }

    private boolean isRelatedBy(int i) {
        return rawNumber % i == 0 || String.valueOf(rawNumber).contains(String.valueOf(i));
    }
}
