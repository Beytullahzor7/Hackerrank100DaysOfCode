package com.library.repository;

import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int maxUnit = 0;

        Collections.sort(candles);
        maxUnit = candles.get(candles.size()-1);

        for (Integer i : candles) {
            if (maxUnit == i) {
                count++;
            }
        }
        return count;
    }
}
