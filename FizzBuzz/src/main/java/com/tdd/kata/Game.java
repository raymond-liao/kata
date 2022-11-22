package com.tdd.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Game {
    private final ArrayList<FBNumber> fbNumbers;

    public Game(int number) {
        fbNumbers = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            fbNumbers.add(new FBNumber(i));
        }
    }

    public int size() {
        return fbNumbers.size();
    }

    public List<String> list() {
        return fbNumbers.stream().map(FBNumber::toString).collect(Collectors.toList());
    }
}
