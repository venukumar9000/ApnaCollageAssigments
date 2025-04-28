package org.example.strings;

public class StringsContainsDigits {
    public static void main(String[] args) {
        String str = "abc12";
        System.out.println( isStringContainsNumbers(str));
    }
    public static boolean isStringContainsNumbers(String s){
        for(char ch :s.toCharArray()){
            if(Character.isDigit(ch)){
               return true;
            }
        }
        return false;
    }
}
