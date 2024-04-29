package com.Basics.Java;

import java.util.Arrays;

public class TwoSumTwo {
    public static int[] twoSum(int[] numbers, int target) {
        int [] index = new int[2];
        for(int i = 0; i<numbers.length; i++){
            int numToFind = target - numbers[i];
            int low = i+1, high = numbers.length,mid = (low + (high - low)/2);
            for(int  j =i+1; j<numbers.length; j++){
                if(numbers[mid] < numToFind){
                    low = mid+1;
                }
                else if(numbers[mid] > numToFind){
                    high = mid-1;
                }
                else{
                    //1-based indexing needed in output.
                    index[0] = i+1;
                    index[1] = mid+1;
                    break;
                }
                mid = (low + (high - low)/2);
                if(low > high || low > numbers.length-1 ) break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int[] A = {5,25,75};
        System.out.println(Arrays.toString(twoSum(A,100)));
    }
}
