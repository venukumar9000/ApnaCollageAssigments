package org.example.praticess;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PraticMain {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        rotate(a);
        reverese(a);
//        palindromeArray(a);

        String s="abc";
        String s1="bca";
        anagrams(s,s1);
        int[] myArr={1,5,6,4,1,4,1,8};
         int[] ints = removeDuplicates(myArr);

         for (int i=0;i<ints.length;i++){
             System.out.print(ints[i]+" ");
         }
         revereseword(s);

         String w="I love india";
         wordfre(w);

    }
    public static void reverese(int[] arr){
//        int []k=new int[arr.length];
         int left=0;
         int right=arr.length-1;
        while (left<right){;
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static int[] removeDuplicates(int []arr){

        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
           int value=mp.getOrDefault(arr[i],0);
           mp.put(arr[i],value+1);
        }
        int[] tem=new int[mp.size()];
        int i=0;
       for (Map.Entry<Integer,Integer> nums:mp.entrySet()){

           tem[i]=nums.getKey();

       }

       return tem;
    }

    public  static  void anagrams (String str, String str1){
        if(str.length() !=str1.length()){
            System.out.println("it not a anagram");
        }
        char[]ch= str.toCharArray();
        char[]ch1 =str1.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        if(Arrays.equals(ch, ch1)){
            System.out.println("anagram");
        }else {
            System.out.println("not an anagram");
        }

    }
    public static  void rotate(int []arr){
        int temp;
        temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr)+"roatte");
    }

    public static void revereseword(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
             rev+= str.charAt(i);
        }
        System.out.println(rev);

    }
    public static void wordfre(String  str){
        HashMap<String,Integer>mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
             String[] split = str.split("");
            Integer orDefault = mp.getOrDefault(split[i], 0);
            mp.put(split[i],orDefault+1);

        }
        System.out.println(mp);
    }
    public  static  void charoccur(String str){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }

        for (int i=0;i<str.length();i++){

        }
    }


}
