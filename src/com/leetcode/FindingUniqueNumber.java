package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class FindingUniqueNumber {
    public static void main(String[] args) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] testArray = {1,1,2,2,3,3,3,49,90};
        for(int i: testArray){
            if (uniqueSet.contains(i)){
                continue;
            } else{
                uniqueSet.add(i);
            }

        }
        for(int i: testArray) {
        	if(treeSet.contains(i)) {
        		continue;
        	}else {
        		treeSet.add(i);
        	}
        }
        uniqueSet.stream().forEach(System.out::println);
//        for(int i: uniqueSet){
//            System.out.println(i);
//        }
        System.out.println("sorted order");
        treeSet.stream().forEach(System.out::println);
        /**
         * The difference with Hashset and Treeset can be seen in how the elements are ordered.
         * Hashset is a random order while Treeset is ordered numerically from least to greatest element.
         */


    }
}
