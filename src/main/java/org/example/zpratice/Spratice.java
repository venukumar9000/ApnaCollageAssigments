package org.example.zpratice;

public class Spratice {

    static  int charCount(String s){
        int count =0;
        for(int i=0;i<s.length();i++){
            char k = s.charAt(i);
            if(k=='o'){
                count++;
            }
        }
        return count;
    }
    public static String toUpperCase(String s){
        String str ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='a' && c<='z'){
                str=str+(char)(c-32);
            }else {
                str=str+c;
            }
        }
        return str;
    }
    public static String toLowerCase(String s){
        String str ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                str=str+(char)(c+32);
            }else {
                str=str+c;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String s= "How a1e you i o ! good and oo good";
        System.out.println(Spratice.charCount(s));
        System.out.println(Spratice.toUpperCase(s));
        System.out.println(Spratice.toLowerCase(s));
    }
}
