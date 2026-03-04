package org.example.arraylist;

import java.util.ArrayList;

public class MonotonicArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(3);
        li.add(2);
        System.out.println(decOrIncreArraylist(li));

        int[] arr={10,6,5,8};
        ArrayList<Integer> integers = lonelyNum(arr);

        System.out.println(integers);



    }

    public static boolean decOrIncreArraylist(ArrayList<Integer> list) {
        boolean dec =true;
        boolean inc=true;
        for (int i = 0; i < list.size()-1; i++) {
          if(list.get(i)<list.get(i+1)){
              dec=false;
          }
          if(list.get(i)>list.get(i+1)){
              inc=false;
          }
        }
        return dec || inc;
    }

    public static ArrayList<Integer> lonelyNum(int[] arr){

        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i<arr.length;i++){
            int value=arr[i];
            int p1=value-1;
            int p2=value+1;

            for (int j=i+1;j< arr.length;j++){
                if(arr[j]==p1 || arr[j]==p2){
                    list.add(arr[i]);
                }

            }
        }

        return list;
    }
}
