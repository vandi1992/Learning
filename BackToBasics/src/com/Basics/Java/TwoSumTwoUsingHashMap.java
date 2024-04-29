package com.Basics.Java;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTwoUsingHashMap {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            if(hashMap.containsKey((Integer)(target-numbers[i])))
            {
               return new int[] {hashMap.get(target-numbers[i])+1,i+1};
            }
            hashMap.put(numbers[i],i);
        }
        return null;
    }

        public static void main(String[] args){
            int[] A = {5,25,75};
            System.out.println(Arrays.toString(twoSum(A,100)));
        }
}
