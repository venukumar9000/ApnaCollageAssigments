package org.example.strings;

public class SentenceEaxhWordToUpperCase {
    public static void main(String[] args) {
        String s ="hello world";
        System.out.println(toUppercases(s));


    }
    public static String toUppercases(String str ){
        Character.toUpperCase(str.charAt(0));
          StringBuilder sb = new StringBuilder();
        for(int i=1;i<str.length();i++) {
            if(str.charAt(i)==' '){
               sb.append(Character.toUpperCase(str.charAt(i+1)));
            }
        }
        return str;
    }
}
