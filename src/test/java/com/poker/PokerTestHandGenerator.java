package com.poker;

import org.junit.jupiter.params.provider.Arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PokerTestHandGenerator {

    public static Stream<Arguments> generateHighCard() {
        return Stream.of(Arguments.arguments(buildHand(
                new Hearts(CardValues.ACE),
                new Clubs(CardValues.KING),
                new Spades(CardValues.FOUR),
                new Hearts(CardValues.EIGHT),
                new Diamonds(CardValues.TWO))
                , "High Card"));
    }

    public static Stream<Arguments> generate1Pair() {
        return Stream.of(Arguments.arguments(buildHand(
                        new Hearts(CardValues.KING),
                        new Clubs(CardValues.KING),
                        new Spades(CardValues.FOUR),
                        new Hearts(CardValues.EIGHT),
                        new Diamonds(CardValues.TWO))
                , "1 Pair"));
    }

    public static Stream<Arguments> generate2Pair() {
        return Stream.of(Arguments.arguments(buildHand(
                        new Hearts(CardValues.KING),
                        new Clubs(CardValues.KING),
                        new Spades(CardValues.FOUR),
                        new Hearts(CardValues.FOUR),
                        new Diamonds(CardValues.TWO))
                , "2 Pair"));
    }

    public static Stream<Arguments> generate3OfAKind() {
        return Stream.of(Arguments.arguments(buildHand(
                        new Hearts(CardValues.KING),
                        new Clubs(CardValues.KING),
                        new Spades(CardValues.KING),
                        new Hearts(CardValues.EIGHT),
                        new Diamonds(CardValues.TWO))
                , "3 of a Kind"));
    }

    public static Stream<Arguments> generate4OfAKind() {
        return Stream.of(Arguments.arguments(buildHand(
                        new Hearts(CardValues.KING),
                        new Clubs(CardValues.KING),
                        new Spades(CardValues.KING),
                        new Hearts(CardValues.KING),
                        new Diamonds(CardValues.TWO))
                , "4 of a Kind"));
    }

    private static List<Card> buildHand(Card card1, Card card2, Card card3, Card card4, Card card5) {
        List<Card> cards = new ArrayList<>();

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        return cards;
    }
}
