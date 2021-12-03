package com.poker;

import com.poker.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {

    //High com.poker.Card
    @ParameterizedTest
    @MethodSource({
            "com.poker.PokerTestHandGenerator#generateHighCard",
            "com.poker.PokerTestHandGenerator#generate1Pair",
            "com.poker.PokerTestHandGenerator#generate2Pair",
            "com.poker.PokerTestHandGenerator#generate3OfAKind",
            "com.poker.PokerTestHandGenerator#generate4OfAKind"
    })
    public void test_handReturnsHighCard(List<Card> cards, String expected) {
        Poker hand = new Poker(cards);
        assertEquals(hand.getHand(), expected);
    }
}