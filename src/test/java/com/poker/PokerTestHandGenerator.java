package com.poker;

import com.poker.*;
import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PokerTestHandGenerator {

    public static Stream<Arguments> generateHighCard() {
        List<Card> cards = new ArrayList<>();

        buildHand(cards,
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.KING),
                new Spades(CardValues.FOUR),
                new Hearts(CardValues.EIGHT),
                new Diamonds(CardValues.TWO)
        );

        return Stream.of(Arguments.arguments(cards, "High Card"));
    }

    public static Stream<Arguments> generate1Pair() {
        List<Card> cards = new ArrayList<>();

        buildHand(cards,
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.ACE),
                new Spades(CardValues.FOUR),
                new Hearts(CardValues.SIX),
                new Diamonds(CardValues.TWO)
        );

        return Stream.of(Arguments.arguments(cards, "1 Pair"));
    }

    public static Stream<Arguments> generate2Pair() {
        List<Card> cards = new ArrayList<>();

        buildHand(cards,
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.ACE),
                new Spades(CardValues.FOUR),
                new Hearts(CardValues.FOUR),
                new Diamonds(CardValues.TWO)
        );

        return Stream.of(Arguments.arguments(cards, "2 Pair"));
    }

    public static Stream<Arguments> generate3OfAKind() {
        List<Card> cards = new ArrayList<>();

        buildHand(cards,
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.ACE),
                new Spades(CardValues.ACE),
                new Hearts(CardValues.EIGHT),
                new Diamonds(CardValues.TWO)
        );

        return Stream.of(Arguments.arguments(cards, "3 of a Kind"));
    }

    public static Stream<Arguments> generate4OfAKind() {
        List<Card> cards = new ArrayList<>();

        buildHand(cards,
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.ACE),
                new Spades(CardValues.ACE),
                new Hearts(CardValues.ACE),
                new Diamonds(CardValues.TWO)
        );

        return Stream.of(Arguments.arguments(cards, "4 of a Kind"));
    }

    private static void buildHand(List<Card> cards, Card card1, Card card2, Card card3, Card card4, Card card5) {
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
    }
}
