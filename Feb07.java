package com.feb;


import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/fruit-into-baskets/

public class Feb07 {
    public static void main(String[] args) {

    }

    static int totalFruit(int[] tree) {
        int ans = 0;
        Map<Integer, Integer> count = new HashMap<>();

        for (int l = 0, r = 0; r < tree.length; ++r) {
            count.put(tree[r], count.getOrDefault(tree[r], 0) + 1);
            while (count.size() > 2) {
                count.put(tree[l], count.get(tree[l]) - 1);
                count.remove(tree[l], 0);
                ++l;
            }
            ans = Math.max(ans, r - l + 1);
        }

        return ans;
    }

}
