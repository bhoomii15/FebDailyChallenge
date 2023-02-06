package com.feb;


//https://leetcode.com/problems/greatest-common-divisor-of-strings/
public class Feb01 {
    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(gcdOfStrings(str1, str2));

    }

    static String gcdOfStrings(String str1, String str2) {

        if (!((str1 + str2).equals(str2 + str1))) {
            return "";
        } else if (str1.equals(str2)) {
            return str2;
        } else if (str1.length() > str2.length()) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        } else {
            return gcdOfStrings(str2.substring(str1.length()), str1);
        }
    }
}
