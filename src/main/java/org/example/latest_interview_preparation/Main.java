package org.example.latest_interview_preparation;


import java.util.*;

public class Main {

    //Sum of array
//[1, 2, 3, 4, 5]  o/p:15
    public static int sumOfArray(int[] nums){
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
    //Max & Min
    //[3, 7, 1, 9, 2]   Max = 9, Min = 1

    public static int maxAndMin(int[] nums){
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }

        }
        return min;
    }

    //Count even & odd
    //[1, 2, 3, 4, 5]  Even = 2, Odd = 3

    public static  Map<String,Integer> countEvenOrOdd(int [] nums){
        Map<String,Integer> map=new HashMap<>();
        map.put("Even",0);
        map.put("Odd",0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
              map.put("Even", map.get("Even")+1)  ;
            }else {
                map.put("Odd",map.get("Odd")+1);
            }
        }
        return map;
    }

    //Reverse array
    //[1, 2, 3, 4]    [4, 3, 2, 1]

    public static int [] reverserArray(int []nums){
        int start=0;
        int end =nums.length-1;

        while(start<=end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;

    }

    //Second largest

    //[10, 20, 4, 45, 99]      o/p ;-45

    public static int secMax(int [] nums){
        int max = Integer.MIN_VALUE;
        int secMax =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                secMax=max;
                max=nums[i];
            }
            else if(nums[i] > secMax && nums[i]!=max){
                secMax=nums[i];
            }
        }
        return secMax;
    }

    //[1, 2, 3, 4]  sorted or not

    public static boolean sortedOrNot(int [] nums){
        for(int i=1;i<nums.length;i++){
           if(nums[i-1] > nums[i]){
               return false;
           }
        }
        return true;
    }
//Remove duplicates (sorted array)
    //[1, 1, 2, 2, 3]     [1, 2, 3]

    public static Set<Integer> removeDuplicates(int[]nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        return set;
    }

    //Move zeros to end
//[0, 1, 0, 3, 12]   [1, 3, 12, 0, 0]

    public static int[] moveZeros(int [] nums){
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                li.add(nums[i]);
            }
        }
        for(int i=0;i<li.size();i++){
            nums[i]=li.get(i);
        }
        for(int i=li.size();i<nums.length;i++){
            nums[i]=0;
        }
        return nums;
    }

    //Frequency of elements

    //[1, 2, 2, 3, 1]

    // 1 → 2
    //2 → 2
    //3 → 1

    public static Map<Integer,Integer> frequency(int[] nums){

        Map<Integer,Integer> map = new HashMap<>();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        return map;
    }

    //11. Missing number (1 to n)    [1, 2, 4, 5]   op :-3
    public static int missingNumber(int [] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] !=(nums[i]-1)){
                return nums[i]-1;
            }
        }
        return -1;
    }

    //Find duplicate    [1, 3, 4, 2, 2]     op:-2

    public static int duplicateNumber(int[]nums){
        Set<Integer> set = new HashSet<>();

        for(int num:nums){
            if(!set.add(num)){
                return num;
            }
        }
        return -1;
    }


    //First non-repeating    [4, 5, 1, 2, 0, 4]     o/p:-5

    public static int nonRepeating(int [] nums){
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    //Pair with given sum  [2, 7, 11, 15], target = 9    op:-[2, 7]

    public static int[] pairSum(int[] nums,int target){
        int [] newArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};
    }

    //Rotate array by k    [1, 2, 3, 4, 5], k = 2    op:-[3, 4, 5, 1, 2]

    public static int[] rotateArray(int [] nums,int k){
        int [] newArray = new int [k];
        for(int i=0;i<newArray.length;i++){
            newArray[i]=nums[i];
        }
        for(int i=k;i<nums.length;i++){
            nums[i-k]=nums[i];
        }
        int j=0;
        for(int i=nums.length-k;i<nums.length;i++){
            nums[i]=newArray[j];
            j++;
        }
        return nums;
    }

    //[2, 0, 2, 1, 1, 0]   Sort 0s,1s,2s     [0, 0, 1, 1, 2, 2]

    public static int[] sortArray(int[]nums){
      int count0=0;
      int count1=0;
      int count2=0;

      for(int i=0;i<nums.length;i++){
          if(nums[i]==0){
              count0++;
          }else if(nums[i]==1){
              count1++;
          }
          else{
              count2++;
          }
      }
      int index =0;
      for(int i=0;i<count0;i++){
          nums[index++]=0;
      }
        for(int i=0;i<count1;i++){
            nums[index++]=1;
        }
        for(int i=0;i<count2;i++){
            nums[index++]=2;
        }
        return nums;
    }

    //Merge two sorted arrays  [1, 3, 5] and [2, 4, 6]   o/P:- [1, 2, 3, 4, 5, 6]
    public static int[] merge(int[] num1,int []num2){
        int n = num1.length;
        int m = num2.length;
        int [] newArray = new int[n+m];
        for(int i=0;i<num1.length;i++){
            newArray[i]=num1[i];
        }
        int j=0;
        for(int i=num1.length;i<newArray.length;i++){
            newArray[i]=num2[j];
            j++;
        }
        return newArray;
    }

    public static void main(String[] args) {
      int [] nums={1,2,3,4,5};
      int sum =sumOfArray(nums);
        System.out.println(sum);


        int[] maxArray ={3, 7, 1, 9, 2};
        int max = maxAndMin(maxArray);
        int min=maxAndMin(maxArray);
        System.out.println(min);

        Map<String,Integer> map =countEvenOrOdd(nums);
        System.out.println(map);

        int [] arr =reverserArray(nums);
        System.out.println(Arrays.toString(arr));

        int secmax = secMax(maxArray);
        System.out.println(secmax);

        int [] nums1={1,2,3,4,6,5,2};

        System.out.println(sortedOrNot(nums1));
        System.out.println(removeDuplicates(nums1));
        int arr1[] = {1,0,3,0,3,0,5};
        System.out.println(Arrays.toString(moveZeros(arr1)));

        System.out.println(frequency(arr1));
        int [] nu= {1,2,4,5,6};
        System.out.println(missingNumber(nu));
        int [] na ={1,2,3,4,4,5};

        System.out.println(duplicateNumber(na));

        int [] naa={4, 5, 1, 2, 0, 4};
        System.out.println(nonRepeating(naa));

        int [] pairSum ={2, 7, 11, 15}; int target=9;

        System.out.println(Arrays.toString(pairSum(pairSum,target)));

        int [] numsRotate ={1, 2, 3, 4, 5}; int k=2;

        System.out.println(Arrays.toString(rotateArray(numsRotate,k)));

        int numSort[]= {2, 0, 2, 1, 1, 0};
        System.out.println(Arrays.toString(sortArray(numSort)));

        int [] n1={1,2,3}; int [] n2={4,5,6};
        System.out.println(Arrays.toString(merge(n1,n2)));
    }
}
