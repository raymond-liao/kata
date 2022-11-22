package com.tdd.kata;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final ArrayList<GameNumber> gameNumbers;

    public Game(int number) {
        gameNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            gameNumbers.add(new GameNumber(i));
        }
    }

    public int size() {
        return gameNumbers.size();
    }

    public List<String> list() {
        return gameNumbers.stream().map(GameNumber::toString).toList();
    }
}
