package com.feb;

//https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

public class Feb13 {
    public static void main(String[] args) {

    }

    static int countOdds(int low, int high) {
        if (low % 2 == 0)
            low++;
        if (high % 2 == 0)
            high--;
        return (high - low) / 2 + 1;
    }
}
