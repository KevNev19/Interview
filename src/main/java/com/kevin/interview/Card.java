package com.kevin.interview;

public class Card {

    private String suite;
    private String value;

    public Card(String suite, String value) {
        this.suite = suite;
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
