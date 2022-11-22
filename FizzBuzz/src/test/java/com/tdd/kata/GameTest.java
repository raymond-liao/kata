package com.tdd.kata;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void should_has_size_100_when_given_100() {
        Game game = new Game(100);
        assertEquals(100, game.size());
    }
    
    @Test
    public void should_has_game_number_list_to_be_spoken() {
        Game game = new Game(100);
        List<String> list = game.list();
        assertEquals(100, list.size());
        assertEquals("1", list.get(0));
        assertEquals("Fizz", list.get(2));
    }

}
