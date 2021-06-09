package com.kevin.interview;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Poker {

    private List<Card> hand;

    public Poker(List<Card> cards) {
        this.hand = cards;
    }

    public String getHand() {
        AtomicReference<String> result = new AtomicReference<>("High Card");
        AtomicInteger count = new AtomicInteger(0);
        Map<String, Long> collection = new HashMap<>();

        for (Card card : hand) {
            collection.merge(card.getValue(), 1L, Long::sum);
        }

        collection.forEach((s, aLong) -> {
            if(aLong > 1) {
                count.getAndIncrement();
            }
        });

        if(count.get() > 0) {
            result.set(count + " Pair");
        }

        return result.get();
    }
}
