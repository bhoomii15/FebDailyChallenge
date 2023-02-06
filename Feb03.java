package com.feb;

//https://leetcode.com/problems/zigzag-conversion/
public class Feb03 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;

        System.out.println(convert(s, numRows));
    }

    static String convert(String s, int numRows) {

        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i =0; i < numRows; i++){
            sb[i] = new StringBuilder();
        }

        char[] c = s.toCharArray();
        int index = 0;
        int n =  c.length;

        while(index < n){
            for(int j = 0; j < numRows && index < n; j++){
                sb[j].append(c[index++]);
            }

            for(int j = numRows -2; j > 0 && index < n; j--){
                sb[j].append(c[index++]);
            }
        }

        StringBuilder ans = sb[0];
        for(int i = 1; i < numRows; i++){
            ans.append(sb[i].toString());
        }
        return ans.toString();
    }
}
