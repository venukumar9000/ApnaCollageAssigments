package org.example.latest_interview_preparation.string_interview_preparation;

import java.util.*;

public class Main {

    //Count vowels and consonants      "hello"       Vowels = 2, Consonants = 3
    public static Map<String,Integer> vowelsAndConsonents(String str){
        int vowels=0;
        int consonants=0;
        Map <String,Integer> mp= new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);

            if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
                vowels++;
            }
            else {
                consonants++;
            }
        }

       mp.put("Vowels",vowels);
        mp.put("Consonants",consonants);
       return mp;
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    //Check palindrome      "madam"        op:-Palindrome

    public static String palindrome(String str ){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        if(sb.toString().equals(str)){
            return "Palindrome";
        }
        return "Not palindrome";
    }
    public static String toLowercase(String str){
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
        }
        return new String(ch);

    }
    public static String toUppercase(String str){
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        return new String(ch);

    }

    //Count frequency of each character      "swiss"

    public static Map<Character, Integer> frequency(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch :str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
       return map;
    }
    //First non-repeating character  swiss
    public static char nonRepeatingChar(String str){
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char ch :str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry :map.entrySet()){
            if(entry.getValue() ==1){
                return entry.getKey();
            }
        }
       return '\0';
    }

    //"hello world"   remove all spaces
    public static String removeAllSpaces(String str){
     str=   str.replaceAll(" ","");
        return str;
    }

    //Count words in a string
    public static int countWords(String str){
        str=str.replaceAll(" ","");
       return str.length();
    }
    //Check if two strings are anagrams    "listen", "silent"

    public static String anagrams(String str1,String str2){
        if(str1.length() !=str2.length()){
            return "Not anagram";
        }
        char [] ch1= str1.toCharArray();
        char [] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

         boolean equals = Arrays.equals(ch1, ch2);
         if(equals){
             return "Anagram";
         }
         return "not Anagram";
    }

    //"programming"  Remove duplicate characters  "progamin"

    public static String removeDuplicates(String str){
        String result ="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    //Find all substrings
    public static List<String> subStrings(String str){
        List<String> li = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                li.add(str.substring(i,j));
            }
        }
        return  li ;
    }

    //Longest word in a sentence      "I love programming"     "I love programming"

    public static String longestWord(String str){
        String [] s=str.split(" ");
        int maxLength=0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>maxLength){
                maxLength=s[i].length();
            }
        }
        for(int i=0;i<s.length;i++){
            if(maxLength == s[i].length()){
                return s[i];
            }
        }
        return "";
    }

    //"hello world"     op:-"hello%20world"

    public static String addChars(String str){
       str= str.replace(" ","%20");
        return str;
    }

    //    Count digits, letters, special chars     "abc128783@#"    OP:-Letters=3, Digits=3, Special=2
    public static int countAll(String str){
        int  letter=0;
        int number=0;
        int special=0;
        char[] ch =str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                letter++;
            }else if(ch[i]>='0' && ch[i]<='9'){
                number++;
            }else{
                special++;
            }
        }
        return number;
    }

    //Longest substring without repeating characters   OP:-3   (abc)   , Input :-"abcabcbb"

    public static int longestSubString(String str){
        int max = Integer.MIN_VALUE;
       for(int i=0;i<str.length();i++){
           Set<Character> set = new HashSet<>();
           for(int j=i;j<str.length();j++){
               char ch = str.charAt(j);
               if(set.contains(ch)){
                   break;
               }else{
                   set.add(ch);
               }
               max=Math.max(max,j-i+1);
           }
       }
       return max;
    }
    public static int longestSubStringwithoutRepeatBetter(String str){
        int max = Integer.MIN_VALUE;
        int left =0;
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int right =0;right<str.length();right++){
          char ch = str.charAt(right);
          map.put(ch,map.getOrDefault(ch,0)+1);

          while (map.get(ch)> 1){
              char cleft = str.charAt(left);
              map.put(cleft,map.get(cleft)-1);
              left++;
          }
          max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static int longestSubStringwithoutRepeatoptimal(String str){
        int max =Integer.MIN_VALUE;
        int left =0;
        Map<Character,Integer> map = new HashMap<>();

        for(int right =0;right<str.length();right++){
            char ch= str.charAt(right);
          if(map.containsKey(ch)){
               left= Math.max(left,map.get(ch)+1);
          }
          map.put(ch,right);
          max=Math.max(max,right-left+1);
        }
        return max;
    }
    //Longest palindromic substring
    public static String longestPalindromicSubString(String str){

        String result ="";
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(isPlaindrome(str, i, j)){
                    if(j-i+1 > result.length()){
                        result=str.substring(i,j+1);

                    }
                }
            }
        }
        return result;
    }
    public static boolean isPlaindrome (String s , int left,int right){

        while(left < right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str ="hello";
        vowelsAndConsonents(str);
        String s="MAdAm";
        String ss="swiss";
        String s1=" he l lo wo rld ";

        String ss1="ate";
        String ss2="eat";

        System.out.println(vowelsAndConsonents(str));
        System.out.println(reverse(str));
        System.out.println(palindrome(s));
        System.out.println(toLowercase(s));
        System.out.println(toUppercase(s));
        System.out.println(frequency(ss));
        System.out.println(nonRepeatingChar(ss));
        System.out.println(removeAllSpaces(s1));
        System.out.println(countWords(s1));
        System.out.println(anagrams(ss1,ss2));
        String s11= "programming";
        System.out.println(removeDuplicates(s11));
        String sub ="abc";
        System.out.println(subStrings(sub));

        String st="I love programming";
        System.out.println(longestWord(st));

        System.out.println(addChars(st));
        String d="abc12893@#";
        System.out.println(countAll(d));

        String ls="abcabcbb";
        System.out.println(longestSubString(ls));
        String longestsub="pwwekte";
        System.out.println(longestSubStringwithoutRepeatBetter(longestsub));

        System.out.println(longestSubStringwithoutRepeatoptimal(longestsub));
        String palindromic="babad";
        System.out.println(longestPalindromicSubString(palindromic));
    }
}
