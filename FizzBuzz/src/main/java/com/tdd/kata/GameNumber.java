package com.tdd.kata;

public class GameNumber {

    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (rawNumber % 3 ==0 && rawNumber % 5 ==0) {
            return "FizzBuzz";
        }

        if (rawNumber % 3 ==0) {
            return "Fizz";
        }
        if (rawNumber % 5 ==0) {
            return "Buzz";
        }
        return String.valueOf(rawNumber);
    }
}
