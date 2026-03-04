package org.example.arraycreation;




    public class ArrayCreation {
        public static void main(String[] args) throws NoSuchFieldException {
            Array num = new Array(3);
            num.insert(1);
            num.insert(3);
            num.insert(4);
            num.insert(2);
            num.indexOf(0);

            num.print();


            System.out.println(febonoaci(25)+" fibonacci");


        }
        public static int febonoaci(int n){
            if(n==0 || n==1){
                return n;
            }

            int fn = (febonoaci(n-1)+febonoaci(n-2));
            return fn;
        }


    }

