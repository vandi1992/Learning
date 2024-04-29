package com.Basics.Java;

import java.util.ArrayList;

public class CountPrimes {
    public static int countPrimes(int n) {
        int counter = 0;
        if(n<=2) return 0;
        if(n<=3) return 1;
        ArrayList<Integer> newA =  new ArrayList<>();
        newA.add(2);
        newA.add(3);
        for(int i = 5;i<n;i=i+2) {
            for (int j = 1; j < Math.sqrt(newA.size()); j++) {
                if ((i % newA.get(j) == 0)
                        || (i%newA.get(j+1)==0)
                        || (i% (newA.get(j)*newA.get(j+1)) == 0)){
                    counter++;
                    break;
                }
            }
            if (counter < 1) {
                newA.add(i);
            }
            counter = 0;
        }
        return newA.size();
    }

    public static void main(String[] args){
        System.out.println(countPrimes(200));
    }

}
