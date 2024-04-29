package com.Basics.Java;

import java.util.Arrays;

public class SingleNumber {
    public static  int singleNumber(int[] nums) {
        if(nums.length==1) return nums[0];
        Arrays.sort(nums);
        int oldVal = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length-1;i++){
            if((oldVal != nums[i] ) && (nums[i]!= nums[i+1])){
                    return nums[i];
            }
            else
            {
                oldVal = nums[i];
            }
            if(i == nums.length-2)
                return nums[nums.length-1];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums =  {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
