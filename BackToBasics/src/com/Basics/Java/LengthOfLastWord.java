package com.Basics.Java;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        StringBuilder sb =  new StringBuilder(s.trim());
     /*   if(sb.length()<1|| ((sb.length()==1)&&sb.equals(" "))) {
            return 0;
        }

        if(sb.length()==1) return 1;

      */
        sb.reverse().append(" ");
        int count =  sb.substring(0,sb.indexOf(" ")).length();
        return count;
    }


    public static void main(String[] args){
        System.out.println(lengthOfLastWord("   "));
    }
}
