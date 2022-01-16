package com.leetcode;

public class Main {

    public static void main(String[] args) {

        int[] testArray1 = {2,1,2,3};
        int[] testArray2 = {1,2,3,4,5,6,7,8,9,1};
        int[] testArray3 = {1,2,5};
        int[] testArray4 = {1};

        Solution solution = new Solution();
        System.out.println(solution.containsDuplicate(testArray1));
        System.out.println(solution.containsDuplicate(testArray2));
        System.out.println(solution.containsDuplicate(testArray3));
        System.out.println(solution.containsDuplicate(testArray4));
    }
}
