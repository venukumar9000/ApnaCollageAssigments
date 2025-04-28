package org.example.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurnaces {
    public static void main(String[] args) {
        String s="aaabbcc";
        charOccur(s);
    }
    public static void charOccur(String str) {

        HashMap<Character,Integer > hs = new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(hs.containsKey(str.charAt(i))){
                hs.put(str.charAt(i),hs.get(str.charAt(i))+1);
            }else {
                hs.put(str.charAt(i),1);
            }
        }
       for( Map.Entry<Character,Integer> hss : hs.entrySet()) {
           System.out.println("chaar occuer :" + hss.getKey() + " = " + hss.getValue());

       }
    }
}
