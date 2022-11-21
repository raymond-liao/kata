package com.tdd.kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_create_game_object_with_given_size() {
        Game game = new Game(100);
        assertEquals(100, game.size());
    }

    @Test
    public void should_provide_words_to_be_spoken() {
        Game game = new Game(100);
        List<String> wordsToBeSpoken = game.words();
        assertEquals(100, wordsToBeSpoken.size());
        assertEquals("1", wordsToBeSpoken.get(0));
        assertEquals("Fizz", wordsToBeSpoken.get(2));
        assertEquals("Buzz", wordsToBeSpoken.get(4));
        assertEquals("FizzBuzz", wordsToBeSpoken.get(14));
        System.out.printf(wordsToBeSpoken.toString());
    }
}
