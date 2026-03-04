package org.example.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String word =" the man is good ";
        String len="Hello java";
        System.out.println(reverse(word));
       reverseAString("sampele");
        System.out.println(lengthOfString(len));
        String s="loveleetcode";
        System.out.println(firstNonReapatingChar(s));

    }
    public static String reverse(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");

        }
        return sb.toString().trim();

    }
    public static void reverseAString(String str){
//        char [] ch =str.toCharArray();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println("rev :"+rev);
        if(rev.equals(str)){
            System.out.println("plaindrome ");
        }


    }
   public static int lengthOfString(String str){
        String s=str.trim();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        return count;
   }
   public static int firstNonReapatingChar(String str){
        int [] freq =new int[26];
        char [] ch =str.toCharArray();
        for(char chars:ch){
            freq[chars-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a']==1){
                return i;
            }
        }
        return -1;
   }
    public static int firstNonReapatingCharMethod2(String str) {
        Map<Character,Integer> mp = new LinkedHashMap<>();
      return 0;
    }

}
