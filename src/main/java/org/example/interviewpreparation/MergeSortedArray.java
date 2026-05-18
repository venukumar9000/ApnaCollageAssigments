package org.example.interviewpreparation;

import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int [] num1 ={1,2,3,0,0,0};
        int[] num2={2,3,4};
        int m =3;
        int n =num2.length;
        merge(num1,m,num2,n);


//        int matrix [][]= new int[3][3];
//        Scanner sc = new Scanner(System.in);
//        for(int i=0;i<matrix.length;i++){
//            for(int j=0;j<matrix[0].length;j++){
//                System.out.println("enter matrix");
//                matrix[i][j]=sc.nextInt();
//            }
//        }


//        System.out.println(maxAndMin(matrix));
        int [] mostOnes={1,2,1,1,2,1,1,1,1,2,3,1,1,1,2};
        int res =mostConsecutive1sArray(mostOnes);
        System.out.println(res);

//       int [] nums1 = removeDuplicates(mostOnes);
//        System.out.println(Arrays.toString(nums1));

        int [] s={1,2,3,4,5,6,7};
        int d=3;
      int []nums3=  shiftElementsByDPlaces(s,d);
        System.out.println(Arrays.toString(nums3)+" Shifteing");

        int []zeros ={1,0,2,0,3,0,4,5,6};
         int[] zeros1 = moveZeros(zeros);
        System.out.println(Arrays.toString(zeros1));

        int [] a1={1,2,3,3,4,5};
        int [] a2={1,2,3,6,7,8};
         int[] ints = unionArrays(a1, a2);
        System.out.println(Arrays.toString(ints)+" union");

        System.out.println(" rev ...."+ test());

        test2();


    }

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int [] k = new int[m+n];
            for(int i=0;i<m;i++){
                k[i]=nums1[i];

            }
            for(int i=0;i<n;i++){
                k[m+i]=nums2[i];

            }
            Arrays.sort(k);
            for(int i=0;i<k.length;i++){
                nums1[i]=k[i];
            }

            System.out.println(Arrays.toString(nums1));
        }
        public static int maxAndMin(int [][] matrix){
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
        }
        return min;
        }
        public static int mostConsecutive1sArray(int []nums){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
             int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1){
                    count++;
                }else{
                    break;
                }
            }
            if(count > max){
                max=count;
            }

        }
            return   max;
        }
        public static int [] removeDuplicates(int [] nums){
        int []num=new int [nums.length];
         for(int i=0;i<nums.length;i++){
             for(int j=i;j<nums.length;j++){
                 if(nums[j]!=nums[j+1]){
                     num[i]=nums[j];
                 }
             }
         }
         return num;
        }
        public static int [] shiftElementsByDPlaces(int [] nums, int d){
        int [] temp =new int[d];

        for(int i=0;i<d;i++){
            temp[i]=nums[i];
        }
        for(int i=d;i<nums.length;i++){
            nums[i-d]=nums[i];
        }
        int j=0;
        for(int i=nums.length-d;i<nums.length;i++){
            nums[i]=temp[j];
            j++;
        }

        return nums;
        }
        public static int [] moveZeros(int [] zero){
            List<Integer> li = new ArrayList<>();
        for(int i=0;i<zero.length;i++){
            if(zero[i]!=0){
                li.add(zero[i]);
            }
        }
        for(int i=0;i<li.size();i++){
            zero[i]=li.get(i);
        }
        int nonZero=li.size();
        for(int i=nonZero;i<zero.length;i++){
            zero[i]=0;
        }
        return zero;
        }
        public static int[] unionArrays(int []n1,int []n2){
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<n1.length;i++){
                set.add(n1[i]);
            }
            for(int i=0;i<n2.length;i++){
                set.add(n2[i]);
            }

            int [] unionArray =new int[set.size()];

            int i=0;

            for (Integer num:set){
                unionArray[i++]=num;
            }
            return unionArray;
        }
        public static String test() {
            String s = "sky is blue in color ";

            String[] str = s.trim().split(" ");
            StringBuilder sb = new StringBuilder();

            for (int i = str.length - 1; i >= 0; i--) {

                if(str[i].length()>2){
                    String rev ="";
                    for(int k=str[i].length()-1;k>=0;k--){
                        rev+=str[i].charAt(k);
                    }
                    sb.append(rev).append(" ");
                }else {
                    sb.append(str[i]).append(" ");
                }


            }

           return sb.toString();

        }
        public static void test2(){
            String[] yu={"avsbs","ax19","qwe-09","assd10"};

            for(int i=0;i<yu.length;i++){
                if(yu[i].contains("^[0-9]")) {
                    System.out.println(yu[i]);
                }
            }

        }

}
