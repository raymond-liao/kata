package com.tdd.kata;

public class GameNumber {

    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isDivisibleBy(3) && isDivisibleBy(5)) {
            return "FizzBuzz";
        }

        if (isDivisibleBy(3)) {
            return "Fizz";
        }

        if (isDivisibleBy(5)) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);

    }

    private boolean isDivisibleBy(int denominator) {
        return rawNumber % denominator == 0;
    }
}
