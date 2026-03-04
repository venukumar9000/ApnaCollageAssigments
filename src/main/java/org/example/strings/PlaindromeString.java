package org.example.strings;

public class PlaindromeString {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
        palindrome(s);
    }

    public static void palindrome(String str){
        StringBuilder rev= new StringBuilder("");
        char []ch = str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev.append(str.charAt(i));
        }
        if(str.equals(rev.toString())){
            System.out.println("its plaindrome ");
        }else{
            System.out.println("not");
        }

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
