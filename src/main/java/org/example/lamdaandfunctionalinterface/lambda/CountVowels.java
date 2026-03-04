package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.IntStream;

public class CountVowels {
    public static void main(String[] args) {
     String s ="aeroplane";
        System.out.println(vowelCount(s));
        System.out.println(vowelCountLambda(s));
    }
    static int vowelCount(String s){
    char[]ch =s.toCharArray();
    int count=0;
    for(int i=0;i<ch.length;i++){
        if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
          count++;

        }
    }
    return count;
    }
    static int vowelCountLambda(String str){
      return (int)  IntStream.range(0,str.length())
                .mapToObj(str::charAt)
                .filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }

}
