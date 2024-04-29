package com.Basics.Java;

public class isPalindrome {
    public static boolean isPalindromeTrue(String s) {
        if(s.length()<=1) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

for(int i = 0;i<s.length()/2;i++){
    if(s.charAt(i) != s.charAt(s.length()-1-i)){
        return false;
    }
}

       /* StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)){
            return true;
        }

        */
        return true;
    }

    public static void main(String[] args){
System.out.println(isPalindromeTrue("A man, a puan, a canal: Panama"));    }
}
