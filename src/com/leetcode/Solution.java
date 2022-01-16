package com.leetcode;


import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4};
        Solution sol = new Solution();
        System.out.println(sol.containsDuplicate(intArray));

    }


    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            else{
                set.add(i);

            }
        }
        return false;
    }
}