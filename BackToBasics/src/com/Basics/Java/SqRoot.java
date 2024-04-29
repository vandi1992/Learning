package com.Basics.Java;

public class SqRoot {
    public static int mySqrt(int x) {
        int sqRoot = 0;
        int lowBnd = 0;
        int highBnd = x;
        if(x==0) return 0;

        if(x==1) return 1;

        for(int i = 1;i<=(lowBnd+highBnd/2);i++){
            if((x/i) == i){
                sqRoot=i;
            }
            if((x/i)<i){
                highBnd = i;
            }
            if((x/i)>i){
                lowBnd = i;
            }
    }


        return  (int) sqRoot;
    }
    public static void main(String[] args){
        System.out.println(mySqrt(3));
    }
}


/*
  if(( (long) (i + 1) *(i+1))>x){
                    break;
                }
 */