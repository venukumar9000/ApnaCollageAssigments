package org.example.interviewpreparationlatest.interfacejava8.CustomException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CustomException extends Exception{

    public CustomException(String message){
        super(message);
    }
}
class Main{

    public void test(int age) throws CustomException {
        if(age <8 ){
            throw new CustomException("you are not eligible "+age);
        }else{
            //do some logic
        }
    }
    public static void main(String[] args) throws CustomException {
       Main main = new Main();
       main.test(17);

       String [] str ={"alice,100", "bob,200", "alice,300", "bob,100"};

        HashMap<String,Integer> map = new HashMap<>();
       for( int i=0;i<str.length;i++){
            String[] s = str[i].split(",");
            if(map.containsKey(s[0])){
                int value = map.get(s[0]);

            }
       }

        List<Integer> li =Arrays.asList(1,2,3,4,5);

         int i1 = li.stream().mapToInt(i -> i).min().orElse(Integer.MAX_VALUE);

        System.out.println(i1);
    }
}
