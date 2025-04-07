package org.example;

public class Pattern2 {

    public static void patter1() {
        int n = 4, curr = 1;
        for (int i = 0; i < n; i++) {
            boolean b = i % 2 == 0 ? curr == 1 : curr == 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(curr + " ");
                curr = curr == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void patter2() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patter3() {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void patter4() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }


            System.out.println();
        }
    }

    public static void patter5() {
        int n = 5;
        int c;
        for (int i = 1; i <= n; i++) {
            c = 1;
            for (int j = i; j <= n; j++) {
                System.out.print(c + " ");
                c++;

            }


            System.out.println();
        }
    }

    public static void patter6() {
        int n = 5;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }


            System.out.println();
        }
    }

    public static void patter7() {
        int n = 4;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }


            }


            System.out.println();
        }
    }

    public static void Butterflypatter() {
        int n = 4;


        for (int i = 1; i <= n; i++) {
            int spaces = 2 * (n - i);
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            int spaces = 2 * (n - i);

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void solidRhombus() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }

    public static void hollowRhombus() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            System.out.println();
        }
    }

    public static void dimoind() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void pyromid() {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

    public static int averageOf3numbers(int a, int b, int c) {
        int n = 3;
        int average = (a + b + c) / n;

        return average;
    }

    public static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (n != 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        if (rev == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOfdigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;

        }
        return sum;
    }

    public static int linearSearch(int num[], int value) {

        for (int i = 0; i <= num.length; i++) {
            if (num[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchEx2(String[] foods, String val) {

        for (int i = 0; i <= foods.length; i++) {
            if (foods[i].equals(val)) {
                return i;
            }
        }
        return -1;
    }

    public static int largeest(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {

                nums[i] = largest;
                return i;
            }

        }
        return -1;

    }

    public static int binarysearch(int[] n, int k) {
        int start = 0;
        int end = n.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (n[mid] == k) {
                return k;
            } else if (n[mid] < k) {
                     start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void reverseArray(int n[]){
        int first=0;int end =n.length-1;
        while (first < end){
            int temp =n[first];
            n[first]=n[end];
            n[end]=temp;
            first++;
            end--;
        }

    }
    public static  void pairsArray(int []nums){
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+")");

            }
            System.out.println();
        }
    }
    public static  void subArray(int []arr){
        for(int i=0;i<arr.length;i++){
            int start =i;
            System.out.println(start);
        }
    }

    public static void main(String[] args) {
        patter1();
        System.out.println(isPalindrome(120));
        System.out.println(sumOfdigits(285));
        System.out.println(averageOf3numbers(1,2,3));
        patter2();
        patter3();
        patter4();
        System.out.println("++++++++++++++++++++");
        patter5();
        patter6();
        patter7();
        Butterflypatter();
        solidRhombus();
        hollowRhombus();
        dimoind();
        pyromid();
        int numb[]={1,2,3,4,5,6,5};
        int val=6;
        int index=linearSearch(numb,val);
        if(index ==-1){
            System.out.println("Not Found");
        }else{
            System.out.println(index);
        }

        String[] f = {"laddu","pizza","egg","dal"};
        String valu = "egg";
         int food = linearSearchEx2(f, valu);

         if(food==-1){
             System.out.println("not found");
         }else{
             System.out.println(food);
         }

         int nums[]={2,3,5,6,7,10};

        int maxAtIndex=largeest(nums);
        if(maxAtIndex ==-1){
            System.out.println("not found ");
        }else{
            System.out.println(maxAtIndex);
        }
        int z[]={1,2,3,4,5,6,7};
        int v=6;
        int m =binarysearch(z,v);
        if(m==v){
            System.out.println("element found "+m);
        }else {
            System.out.println("element not found");
        }
        int zz[]={1,2,3,4,5};
        reverseArray(zz);
         for (int i =0;i<zz.length;i++){
             System.out.println(zz[i]);
         }
        System.out.println();

         int []zs= {2,4,6,8,10};
         pairsArray(zs);

         int [] ks={1,2}
    }

}
