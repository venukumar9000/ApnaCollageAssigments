package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.IntStream;

public class PalindromeString {
    public static void main(String[] args) {
        String s="madamk";
        System.out.println(palindrome(s));
        String s1 ="racecar";
        System.out.println(palidromeLambda(s1));


    }
    public static String palindrome(String str){
        int n =str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                return "isPlaindrome";
            }
        }
        return "Not palindrome";
    }
    public static String palidromeLambda(String str){
       boolean isPal= IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i)==str.charAt(str.length()-i-1));

        return isPal?"palindrome":"not palindrome";
    }
}
