package com.Basics.Java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        int charCount = 26;
        int [] charArray  = new int[charCount+1];

        if (s.length()!= t.length()) return Boolean.FALSE;
        s = s.toLowerCase(Locale.ROOT);
        t= t.toLowerCase(Locale.ROOT);
        for(int i = 0;i<s.length();i++){
            charArray[(s.charAt(i) - 'a')]++;
        }
        for(int i = 0;i<t.length();i++){
            if(charArray[(t.charAt(i)-'a')] <=0){
                return Boolean.FALSE;
            }
            else
                charArray[(t.charAt(i)-'a')]--;
        }
        return Boolean.TRUE;
        /*
       // HashMap<Character,Integer> hashMap =  new HashMap<>();
        if(Arrays.equals(s.toCharArray(),t.toCharArray())
        char[] sCharArr = s.toCharArray();
        Arrays.sort(sCharArr);

        char[] tCharArr = t.toCharArray();
        Arrays.sort(tCharArr);

        if(Arrays.equals(sCharArr,tCharArr)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;


        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)   !=t.charAt(i)){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;

         */

     /*   for(int i = 0;i<s.length();i++){
           if(hashMap.containsKey(s.charAt(i)))
           {    hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
           }
           else
           {    hashMap.put(s.charAt(i),0);
           }
        }
        for(int i = 0;i<t.length();i++){
            if(hashMap.containsKey(t.charAt(i)))
            {
                if(hashMap.get(t.charAt(i))>0)
                hashMap.put(t.charAt(i),hashMap.get(t.charAt(i))-1);
                else hashMap.remove(t.charAt(i));
            }
            else
            {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;

      */

    }
    public static void main(String[] args){
        System.out.println(isAnagram("anagram","aagaram"));
    }
}
