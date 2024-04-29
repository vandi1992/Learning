package com.Basics.Java;

import java.util.Arrays;
import java.util.Collections;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int elemCount = 0;
        for(int i = 0;i<nums.length;i++){
            if((nums[i] != val)){
                nums[elemCount] = nums[i];
                elemCount++;
            }
        }
        return (elemCount);
    }

    public static void main(String [] args){
        int[] a = {0,1,2,2,3,0,4,2};
        System.out.println("Elem count = "+removeElement(a,2));

    }
}



/*
int i =0;
        for (int j = 0; j < nums.length-1; j++) {
            if ((nums[j] == val)) {
                nums[j] = nums[j+1];
                j--;
            }
        }

        for (int  elem: nums
             ) { System.out.println(elem);

        }
 */

/*
 public static int removeElement(int[] nums, int val) {
        int elemCount = 0;
        if (nums.length == 0) return 0;

        for(int i = 0;i<nums.length;i++){
            if((nums[i] == val)){
                nums[i] = Integer.MAX_VALUE;
                elemCount++;
            }
        }
        Arrays.sort(nums);
        return (nums.length - elemCount);
    }
 */