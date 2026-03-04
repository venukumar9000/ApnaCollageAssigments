package org.example.strings;

public class FindDifferenceStrings {
    public static void main(String[] args) {
        String s1="abca";
        String s2="abcd";
        System.out.println(fibddiff(s1,s2));
        System.out.println(findExtraCharacters(s1,s2));
        int[] count = new int[26];

    }
    public static char fibddiff(String str,String str2){
        int s1=0;
        int s2=0;
        for(char ch:str.toCharArray()){
            s1+=ch;
        }
        for(char ch:str2.toCharArray()){
            s2+=ch;
        }
        return (char)(s2-s1);
    }
    public static String findExtraCharacters(String s, String t) {
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
        }

        for (char c : t.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder extra = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                extra.append((char)(i + 'a'));
                count[i]--;
            }
        }

        return extra.toString();
    }
}
