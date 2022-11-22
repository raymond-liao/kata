package com.tdd.kata;

import static java.lang.String.valueOf;

public class GameNumber {

    private final int rawNumber;

    public GameNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedTo(3) && isRelatedTo(5)) {
            return "FizzBuzz";
        }

        if (isRelatedTo(3)) {
            return "Fizz";
        }

        if (isRelatedTo(5)) {
            return "Buzz";
        }
        return valueOf(rawNumber);

    }

    private boolean isRelatedTo(int number) {
        return rawNumber % number == 0 || valueOf(rawNumber).contains(valueOf(number)) ;
    }
}
