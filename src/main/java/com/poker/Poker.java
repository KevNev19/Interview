package com.poker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Poker {

    List<Card> hand;

    public Poker(List<Card> hand) {
        this.hand = hand;
    }

    //Check for multiples (values)
    //Check for sequences
    //Check for groupings (suites)

    public String getHand() {

        Map<Integer, Integer> collection = new HashMap<>();
        AtomicInteger countPair = new AtomicInteger(0);
        AtomicInteger countTriple = new AtomicInteger(0);
        AtomicInteger countQuadruple = new AtomicInteger(0);
        boolean notPair = false;
        String result = "High Card";

        //Sort cards by value

        for (Card card : hand) {
            collection.merge(card.getValue(),1, Integer::sum);
        }

        collection.forEach((value, aInteger) -> {
            if(aInteger > 1) {
                countPair.getAndIncrement();
            }
            if (aInteger > 2) {
                countTriple.getAndIncrement();
            }
            if (aInteger > 3) {
                countQuadruple.getAndIncrement();
            }
        });

        if(countPair.get() > 0 && countTriple.get() == 0 && countQuadruple.get() == 0) {
            result = countPair + " Pair";
        }

        if (countTriple.get() > 0 && countQuadruple.get() == 0) {
            result = "3 of a Kind";
        }

        if(countQuadruple.get() > 0) {
            result = "4 of a Kind";
        }

        return result;
    }

    // 3,4,5,6,7
}
