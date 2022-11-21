package com.tdd.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> words() {
        return gameNumbers.stream().map(GameNumber::toString).collect(Collectors.toList());
    }
}
