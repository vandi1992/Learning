package com.Basics.Java;

public class ClimbingStairs {

    /*
    Approach 6: Calculate fib Series  : formula :
    Math.pow((1+sqrt5)/2,n+1)-Math.pow((1-sqrt5)/2,n+1);
        return (int)(fibn/sqrt5);
     */
    public static int climbStairs(int n) {
        double sqRoot5=Math.sqrt(5);
        double fibValue=Math.pow((1+sqRoot5)/2,n+1)-Math.pow((1-sqRoot5)/2,n+1);
        return (int)(fibValue/sqRoot5);
    }
    public static void main(String[] args){
        System.out.println(climbStairs(6));
    }
}
