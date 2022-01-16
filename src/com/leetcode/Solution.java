package com.leetcode;


import java.util.HashMap;
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

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i < nums.length; i++){
            int current = nums[i];
            if (map.containsKey(current) && i- map.get(current) <= k ){
                return true;
            }
            else{
                map.put(current,i);
            }
        }
        return false;
    }
}