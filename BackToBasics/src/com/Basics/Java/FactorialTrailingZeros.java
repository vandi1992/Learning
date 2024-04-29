package com.Basics.Java;

import java.math.BigInteger;

public class FactorialTrailingZeros {

    public static int trailingZeroes(int n) {
       // int a[] = {1,1,2,6,24};
        if(n<0) return -1;
        if(n<5) return 0;
        int zeroCounter = 0;
        if(n>=5){
            for(int i = 5;n/i>=1;i=i*5) {
                zeroCounter+=n/i;
            }

        }
        return zeroCounter;
    }

    public static void main(String[] args){
        System.out.println(trailingZeroes(50));
    }
}
