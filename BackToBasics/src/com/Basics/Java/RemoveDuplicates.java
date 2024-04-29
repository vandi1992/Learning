package com.Basics.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
     // int counter = (int) Arrays.stream(nums).distinct().count();
      //  Stream<Integer> stream = (Stream<Integer>) Stream.of(nums);

       // Collections.copy(nums, Arrays.stream(nums).distinct().toArray());


     /*   nums = Arrays.stream(nums)
                .map(x -> x * 2)
                .boxed()
                .toArray(int[]::new);
      /*  for(int i  =0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                counter++;
                nums[counter] = nums[i+1];

            }
        }


        return counter;
    }
    
      */

    public static void main(String [] args){
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(a));

    }

}
