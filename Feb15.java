package com.feb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Feb15 {
    public static void main(String[] args) {

    }


    static List<Integer> addToArrayForm(int[] num, int k) {

        int n = num.length;
        int i = n -1;

        List <Integer> res = new ArrayList<>();
        while(i>=0 || k>0){
            if(i>=0){
                res.add((num[i]+k)%10);
                k = (num[i]+ k)/10;
                i--;
            }
            else{
                res.add(k%10);
                k = k/10;
            }
        }

        Collections.reverse(res);
        return res;

    }
}
