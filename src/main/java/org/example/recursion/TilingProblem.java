package org.example.recursion;

public class TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical placing tiles
        int fnm1=tilingProblem(n-1);
        //horizontal placing tiles
        int fmn2=tilingProblem(n-2);

        return fnm1+fmn2;
    }

}

