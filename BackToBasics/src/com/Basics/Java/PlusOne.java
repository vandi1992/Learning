package com.Basics.Java;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int carryBit = 0;
        int digLen = digits.length-1;

        if (digits[digLen] + 1 > 9) {
            carryBit++;
        }
        digits[digLen] = (digits[digLen] + 1) % 10;

        for(int i =(digLen-1);i>=0;i--){
            if(carryBit==1) {
                if (digits[i] + carryBit > 9) {
                    digits[i] = (digits[i] + carryBit) % 10;
                }
                else {
                    if (digits[i] + 1 <= 9) {
                        digits[i] = (digits[i] + carryBit);
                        carryBit = 0;
                        break;
                    }
                }
            }
        }
        if(carryBit==1){
            int [] newA = new int[digLen+2];
            for (int i = 1; i < digLen+1; i++)
                newA[i] = digits[i];
            newA[0] = 1;
            return newA;
        }
        return digits;
    }

    public static void main(String[] args)
    {
        int[] a =  {8,9,9,9};
        System.out.println(Arrays.toString(plusOne(a)));

    }
}
