package org.example.strings;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(reverseVowel("hello"));
    }
    public static String reverseVowel(String str){
        char [] ch =str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
           if(!isVowel(ch[start])){
               start++;
           }else if(!isVowel(ch[end])){
               end--;
           }else{
               char temp =ch[start];
               ch[start]=ch[end];
               ch[end]=temp;
               start++;
               end--;
           }
        }
       return String.valueOf(ch);
    }

    private static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
