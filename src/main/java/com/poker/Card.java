package com.poker;

public class Card {

    private String suite;
    private CardValues value;

    public Card(String suite, CardValues value) {
        this.suite = suite;
        this.value = value;
    }

    public Integer getValue() {
        return value.getValue();
    }
}
