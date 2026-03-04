package org.example.strings;

public class CountCharsInString {
    public static void main(String[] args) {
        String s="hello java";
        System.out.println(charsCount(s));
    }

    private static int charsCount(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }

}
