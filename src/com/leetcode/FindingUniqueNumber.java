package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class FindingUniqueNumber {
    public static void main(String[] args) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        int[] testArray = {1,1,2,2,3,3,3,49,90};
        for(int i: testArray){
            if (uniqueSet.contains(i)){
                continue;
            } else{
                uniqueSet.add(i);
            }

        }
        uniqueSet.stream().forEach(System.out::println);
//        for(int i: uniqueSet){
//            System.out.println(i);
//        }


    }
}
