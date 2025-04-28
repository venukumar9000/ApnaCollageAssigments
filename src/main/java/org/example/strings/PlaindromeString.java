package org.example.strings;

public class PlaindromeString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

}
