package com.feb;
import java.util.TreeSet;

//https://leetcode.com/problems/minimize-deviation-in-array/
public class Feb24 {
    public static void main(String[] args) {

    }

    static int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int num : nums) {
            if (num % 2 == 1)
                set.add(num * 2);
            else
                set.add(num);
        }
        int minDeviation = set.last() - set.first();
        while (minDeviation > 0 && set.last() % 2 == 0) {
            int max = set.last();
            set.remove(max);
            set.add(max / 2);
            minDeviation = Math.min(minDeviation, set.last() - set.first());
        }
        return minDeviation;
    }
}
