package com.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FBNumberTest {
    @Test
    public void should_say_1_when_raw_number_is_1() {
        FBNumber fbNumber = new FBNumber(1);
        assertEquals("1", fbNumber.toString());
    }

    @Test
    public void should_say_fizz_when_raw_number_is_3() {
        FBNumber fbNumber = new FBNumber(3);
        assertEquals("Fizz", fbNumber.toString());
    }

    @Test
    public void should_say_buzz_when_raw_number_is_5() {
        FBNumber fbNumber = new FBNumber(5);
        assertEquals("Buzz", fbNumber.toString());
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() {
        FBNumber fbNumber = new FBNumber(15);
        assertEquals("FizzBuzz", fbNumber.toString());
    }

    @Test
    public void should_say_fizz_when_raw_number_is_13() {
        FBNumber fbNumber = new FBNumber(13);
        assertEquals("Fizz", fbNumber.toString());
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_51() {
        FBNumber fbNumber = new FBNumber(51);
        assertEquals("FizzBuzz", fbNumber.toString());
    }
}
