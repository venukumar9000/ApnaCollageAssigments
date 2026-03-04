package org.example.arraylist;

import java.util.ArrayList;

public class MostWaterInContainerArraylist {

    public static int mostWater(ArrayList<Integer> height){
        int maxWater=Integer.MIN_VALUE;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int minHeight=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int currentVolume =minHeight*width;
                maxWater=Math.max(currentVolume,maxWater);
            }
        }
        return maxWater;
    }
    public static int storeWater(ArrayList<Integer> height){
        int start=0;
        int end =height.size()-1;
        int maxWater =Integer.MIN_VALUE;
        while (start<end){
            int minHeight =Math.min(height.get(start),height.get(end));
            int width =end-start;
            int currentWaterLevel = minHeight*width;
            maxWater=Math.max(currentWaterLevel,maxWater);
            if(height.get(start)<height.get(end)){
                start++;
            }else{
                end--;
            }
        }
       return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(8);
        li.add(6);
        li.add(2);
        li.add(5);
        li.add(4);
        li.add(8);
        li.add(3);
        li.add(7);

        System.out.println(mostWater(li));
        System.out.println("Two pointer approach :"+storeWater(li));

    }
}
