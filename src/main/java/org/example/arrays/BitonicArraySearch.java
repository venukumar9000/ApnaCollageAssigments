package org.example.arrays;

public class BitonicArraySearch {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,10,4,3,2,1};
        int bitonicEle=2;
        int bIndex= findBitonic(arr);
        System.out.println(searchBitonicIndex(arr,bitonicEle,bIndex));

    }
    public static int ascendingBinarySearch(int []arr,int key, int range){
        int l=0;
        int h=range;
        while(l<=h){
            int mid = (l+h)/2;
            if(key == arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                h=mid-1;
            }else {
                l=mid+1;
            }
        }
        return -1;
    }
    public static int descendingBinarySearch(int[]arr,int key, int range){
        int l=range;
        int h=arr.length-1;

        while (l<=h){
            int mid =(l+h)/2;
            if(key==arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
                l=mid+1;
            }
            else {
                h=mid-1;
            }
        }
        return -1;
    }
    public static int findBitonic(int []arr){
        int l=0;
        int h=arr.length-1;

        while (l<=h){
            int mid =(l+h)/2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                l=mid;
            }
            else {
                h=mid;
            }
        }
        return -1;

    }
    public static int searchBitonicIndex(int [] arr , int key , int index){
      if(key ==arr[index]){
          return index;
      }if(key > arr[index]){
          return -1;
        }
      int res1= ascendingBinarySearch(arr,key,index);
      if(res1 != -1){
          return res1;
      }
      int res2= descendingBinarySearch(arr,key,index);
      if(res2 !=-1){
          return res2;
      }
      return -1;

    }
}
