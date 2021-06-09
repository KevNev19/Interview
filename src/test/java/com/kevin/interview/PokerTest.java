package com.kevin.interview;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * 52 cards in a deck - 4 suits - clubs hearts diamonds spades
 */
class PokerTest {

    @Test
    public void test_handReturnsHighCard(){
        List<Card> cards = new ArrayList<>();
        Card card1 = new Diamods("A");
        Card card2 = new Clubs("2");
        Card card3 = new Spades("K");
        Card card4 = new Heats("J");
        Card card5 = new Heats("A");

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        Poker hand = new Poker(cards);
        assertEquals(hand.getHand(), "High Card");
    }

    @Test
    public void test_handReturnsOnePair(){
        List<Card> cards = new ArrayList<>();
        Card card1 = new Card("Spades", "A");
        Card card2 = new Card("Clubs", "5");
        Card card3 = new Card("Hearts", "K");
        Card card4 = new Card("Diamonds", "K");
        Card card5 = new Card("Diamonds", "7");

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        Poker hand = new Poker(cards);
        assertEquals(hand.getHand(), "1 Pair");
    }

    @Test
    public void test_handReturnsTwoPair(){
        List<Card> cards = new ArrayList<>();
        Card card1 = new Card("Spades", "A");
        Card card2 = new Card("Clubs", "5");
        Card card3 = new Card("Hearts", "K");
        Card card4 = new Card("Diamonds", "K");
        Card card5 = new Card("Diamonds", "K");

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        Poker hand = new Poker(cards);
        assertEquals(hand.getHand(), "2 Pair");
    }

}