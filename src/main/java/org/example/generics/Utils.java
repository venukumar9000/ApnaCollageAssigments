package org.example.generics;

import java.util.ArrayList;

public class Utils {

    public static<T> void anyList(ArrayList<T> anylist){
        for(T i:anylist){
            System.out.println(i);
        }
    }

}
