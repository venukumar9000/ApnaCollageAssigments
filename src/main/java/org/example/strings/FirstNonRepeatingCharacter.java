package org.example.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s= "swiss";
        firstNonRepeatChar(s);

    }
    public static void firstNonRepeatChar(String str){
        Map<Character ,Integer> ls = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            if(ls.containsKey(str.charAt(i))){
                ls.put(str.charAt(i),ls.get(str.charAt(i))+1);
            }else {
                ls.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character,Integer> entry: ls.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+" non reapeat");
               return;
            }
        }
    }
}
