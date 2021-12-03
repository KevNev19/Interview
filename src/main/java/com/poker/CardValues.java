package com.poker;

public enum CardValues {

    ACE(1),
    KING(13),
    QUEEN(12),
    JACK(11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    Integer value;

    private CardValues(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
