package com.feb;


//https://leetcode.com/problems/single-element-in-a-sorted-array/description/
public class Feb21 {
    public static void main(String[] args) {

    }

static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(nums[mid] == nums[mid + 1]) mid = mid - 1; //to have all duplicate elements on one side

            if((mid - start + 1) % 2 != 0){
                end = mid;
            } else{
                start = mid + 1;
            }
        }

        return nums[end];
    }

}
