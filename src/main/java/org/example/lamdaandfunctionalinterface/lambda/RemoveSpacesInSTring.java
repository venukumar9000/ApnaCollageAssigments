package org.example.lamdaandfunctionalinterface.lambda;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveSpacesInSTring {
    public static void main(String[] args) {
        String s =" H el lo Ja va ";
        System.out.println(removeSpace(s));
        System.out.println(countWords(s));
    }
    public static String removeSpace(String s){
        Function<String,String> remove=str->str.replaceAll(" ","");
       return remove.apply(s);
    }
    public static long countWords(String s){
       return IntStream.range(0,s.length())
                .filter(i->s.charAt(i)!=' ')
                .count();
    }
}
