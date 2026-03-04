package org.example.strings;

import java.util.HashMap;

public class IsomerticCharsInString {
    public static void main(String[] args) {
        String  s="egg";
        String s1 ="abb";
        System.out.println(isIsomertic(s,s1));
    }
    public static boolean isIsomertic(String s,String s1){
        HashMap<Character,Character>hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                if(!hm.get(s.charAt(i)).equals(s1.charAt(i))){
                    return false;
                }else if(hm.containsKey(s1.charAt(i))){
                    return false;
                }else{
                    hm.put(s.charAt(i),s1.charAt(i));
                }
            }
        }
        return true;
    }
}
