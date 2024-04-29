package com.Basics.Java;

import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> sta =  new Stack<>();
       // if()
        return true;
    }

    public static void main(String[] args){
        System.out.println(isValid("[][][]["));
    }
}
