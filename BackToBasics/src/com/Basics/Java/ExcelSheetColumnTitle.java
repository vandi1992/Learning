package com.Basics.Java;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {

        String colValue = new String();
        while(columnNumber>0){
            int i = (columnNumber-1)%26;
            colValue = ((char)(i+'A'))+colValue;
            columnNumber=(columnNumber-1)/26;
        }
        return colValue;
    }

    public static void main(String[] args){
        System.out.println(convertToTitle(52));
    }
}
