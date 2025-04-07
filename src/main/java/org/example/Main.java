package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("helo");
           int n=5;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();


        }
        /*
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
         */
int k=1;
        for (int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(
                        k+" ");
                k++;
            }

            System.out.println();
            k=1;
        }
int m=1;
        for(int i=0;i<=n;i++){
            for (int j=0;j<=i;j++){
                if(j%2==0){
                    System.out.print(0);
                }
                else {
                    System.out.print(1);
                }

            }
            System.out.println();
        }


    }


}