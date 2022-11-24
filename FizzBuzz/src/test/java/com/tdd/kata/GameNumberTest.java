package com.tdd.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameNumberTest {
    @Test
    public void should_say_1_when_raw_number_is_1() {
        GameNumber gameNumber = new GameNumber(1);
        assertEquals("1", gameNumber.toString());
    }

    @Test
    public void should_say_fizz_when_raw_number_is_3() {
        GameNumber gameNumber = new GameNumber(3);
        assertEquals("Fizz", gameNumber.toString());
    }

    @Test
    public void should_say_buzz_when_raw_number_is_5() {
        GameNumber gameNumber = new GameNumber(5);
        assertEquals("Buzz", gameNumber.toString());
    }

    @Test
    public void should_say_fizzbuzz_when_raw_number_is_15() {
        GameNumber gameNumber = new GameNumber(15);
        assertEquals("FizzBuzz", gameNumber.toString());
    }

}
