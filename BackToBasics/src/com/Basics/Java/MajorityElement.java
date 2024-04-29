package com.Basics.Java;

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int majElem = nums[0];
        int majElemCount = 1;

        for(int i =1;i<nums.length;i++){
            if(majElem == nums[i]){
                majElemCount++;
            }
            else if(majElemCount>1 && majElem!=nums[i])
            {
                majElemCount--;
            }
            else{
                majElem = nums[i+1];
                majElemCount = 0;
            }
        }
       return majElem;
    }

    public static void main(String[] args){
        int[] a =  {1,3,1,1,4,1,1,5,1,1,6,2,2};
        System.out.println(majorityElement(a));
    }
}
