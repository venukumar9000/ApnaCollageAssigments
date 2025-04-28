package org.example.arrays;

public class FindCommonElementsIntwoStringArrays {
    public static void main(String[] args) {
        String []s = {"ap","br","ca"};
        String []s1 = {"ap","r","ca"};

        for(int i=0;i< s.length;i++){
            for(int j=0;j<s1.length;j++){
             if(s[i].equals(s1[j])){
                 System.out.println(s[i]);
             }
            }
        }
    }

}
