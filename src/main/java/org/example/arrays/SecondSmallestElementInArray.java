package org.example.arrays;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int [] s={2,4,1,5,6};
        System.out.println(secMin(s));
    }
    public static int secMin(int [] k ){
        int minValue=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;
        for(int i=0;i<k.length;i++){
            if(k[i]<minValue){
                secMin=minValue;
                minValue=k[i];
            }else if(k[i]<secMin && k[i]>minValue){
                secMin=k[i];
            }
        }
        return secMin;
    }
}
