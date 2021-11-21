package com.tdd.kata;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<GameNumber> gameNumbers;

    public Game(int size) {
        gameNumbers = new ArrayList<>();
        for (int i = 1; i <= size; i++) {
            gameNumbers.add(new GameNumber(i));
        }
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> list() {
        List<String> results = new ArrayList<>();
        for (GameNumber gameNumber : gameNumbers) {
            results.add(gameNumber.toString());
        }
        return results;
    }
}
