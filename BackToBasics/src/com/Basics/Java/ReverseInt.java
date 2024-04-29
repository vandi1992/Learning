package com.Basics.Java;

public class ReverseInt {
    public static int reverse(int x) {
        long reverseInt = 0;
        while(x!=0){
            reverseInt = reverseInt*10+x%10;
            if(reverseInt>2147483647 || reverseInt<-2147483648)
                return 0;
            x=x/10;

        }
        //if(reverseInt  )
       // return (negVal==1) ? -reverseInt: reverseInt;
        return (int)reverseInt;
    }

    public  static void main(String[] args){
        System.out.println(reverse(1534236469));
    }
}
