package com.feb;

import java.util.Arrays;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
public class Feb22 {
    public static void main(String[] args) {

    }

    static int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int r = Arrays.stream(weights).sum();

        while (l < r) {
            final int m = (l + r) / 2;
            if (shipDays(weights, m) <= days)
                r = m;
            else
                l = m + 1;
        }

        return l;
    }
    static int shipDays(int[] weights, int shipCapacity) {
        int days = 1;
        int capacity = 0;
        for (final int weight : weights) {
            if (capacity + weight > shipCapacity) {
                ++days;
                capacity = weight;
            } else
                capacity += weight;
        }
        return days;
    }
}
