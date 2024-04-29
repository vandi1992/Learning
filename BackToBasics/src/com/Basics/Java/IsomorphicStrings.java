package com.Basics.Java;

import java.util.Collections;
import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> newA =  new HashMap<>();
        HashMap<Character,Integer> newB = new HashMap<>();
        for(int i =0;i<s.length();i++){
            if(newA.containsKey(s.charAt(i))){
                newA.put(s.charAt(i),newA.get(s.charAt(i)+1));
            }
            else
            {
                newA.put(s.charAt(i),1);
            }
        }
            
        for(int i =0;i<t.length();i++){
            if(newB.containsKey(t.charAt(i))){
                newB.put(t.charAt(i),newB.get(t.charAt(i)+1));
            }
            else
            {
                newB.put(t.charAt(i),1);
            }
        }

        return true;//(Collections.sort(newA.values().equals(newB.values());
    }

    public static void main(String [] args) {
        System.out.println(isIsomorphic("paper","title"));
    }

}
