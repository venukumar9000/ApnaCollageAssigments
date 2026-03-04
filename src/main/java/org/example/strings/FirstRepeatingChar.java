package org.example.strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingChar {
    public static void main(String[] args) {
       String s ="aabbss";
        System.out.println(firstReapate(s));
    }
    public static char  firstReapate(String str){
        Map<Character,Integer>mp = new LinkedHashMap<>();
        char ch=' ';
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
              ch=str.charAt(i);
             return ch;

            }else {
                mp.put(str.charAt(i),1);
            }
        }

        return ch;
    }


}
