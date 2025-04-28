package org.example.strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        System.out.println(isAnagrams(s1, s2));

    }

    public static boolean isAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] charArray = s1.toCharArray();
        char[] charArray1 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray);

        return Arrays.equals(charArray1, charArray);
    }
}
