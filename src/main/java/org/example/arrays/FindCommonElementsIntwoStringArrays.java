package org.example.arrays;

public class FindCommonElementsIntwoStringArrays {
    public static void main(String[] args) {
        String []s = {"ap","br","ca"};
        String []s1 = {"ap","r","ca"};

        int [] a= {1,2,3,4};
        int [] b ={3,4,5,6};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i] +"jn");
                }
            }
        }

        for(int i=0;i< s.length;i++){
            for(int j=0;j<s1.length;j++){
             if(s[i].equals(s1[j])){
                 System.out.println(s[i]);
             }
            }
        }
    }

}
