package com.tdd.kata;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_has_size_50_when_given_50() {
        Game game = new Game(50);
        assertEquals(50, game.size());
    }

    @Test
    public void should_has_game_number_list_to_be_spoken() {
        Game game = new Game(200);
        List<String> list = game.list();
        assertEquals(200, list.size());
        assertEquals("1", list.get(0));
        assertEquals("Fizz", list.get(2));
        assertEquals("Buzz", list.get(4));
        assertEquals("FizzBuzz", list.get(14));
    }
}
