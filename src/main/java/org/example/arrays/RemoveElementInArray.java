package org.example.arrays;

public class RemoveElementInArray {
    public static void main(String[] args) {
        int [] k ={1,2,3,4,5};
        int ele =3;
        removeElement(k,ele);
        String[] s ={"banana","apple","cow"};
        String elem ="apple";
        removeElementInStringArray(s,elem);
    }
    public static void removeElement(int [] aa,int ele){
        int [] arr = new int[aa.length-1];
        int index=0;

        for(int i=0;i<aa.length;i++){
            if(aa[i]!=ele){
               arr[index]=aa[i];
               index++;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void removeElementInStringArray(String [] s, String ele){
        String []newArr = new String[s.length-1];
        int index=0;

        for(int i=0;i<s.length;i++){
            if(!s[i].equals(ele)){
                newArr[index]=s[i];
                index++;
            }
        }
        for(String str :newArr){
            System.out.println(str);
        }
    }
}
