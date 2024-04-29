package com.Basics.Java;

public class ImplementStrStr {
    public static int  strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
       // if(needle.length() == haystack.length() && )
       // int startNeedle = (haystack.indexOf(needle.charAt(0)))>0?haystack.indexOf(needle.charAt(0)) : 0;
        int startNeedle = Math.max((haystack.indexOf(needle.charAt(0))), 0);
        int newI;

        for(int i =startNeedle;i<haystack.length() && i >=0;i = newI){
            if(haystack.regionMatches(i,needle,0,needle.length())) {
                return i;
            }
            else
            {
                newI = Math.max((haystack.substring(i + 1).indexOf(needle.charAt(0))), 0) +i+1 ;
            }
        }
        return -1;


    }

        public static void main(String[] args){
       System.out.println(strStr("mississippi","issip"));
      // System.out.println(strStr("a","a"));
        // System.out.println(strStr("hello","ll"));
        //"mississippi"
            //"issipi"
    }
}
