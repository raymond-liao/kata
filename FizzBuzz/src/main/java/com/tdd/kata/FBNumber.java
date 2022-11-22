package com.tdd.kata;

import static java.lang.String.valueOf;

public class FBNumber {
    private int rawNumber;

    public FBNumber(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (isRelatedBy(3) && isRelatedBy(5)) {
            return "FizzBuzz";
        }

        if (isRelatedBy(3)) {
            return "Fizz";
        }

        if (isRelatedBy(5)) {
            return "Buzz";
        }

        return valueOf(rawNumber);
    }

    private boolean isRelatedBy(int number) {
        return rawNumber % number == 0 || valueOf(rawNumber).contains(valueOf(number));
    }
}
