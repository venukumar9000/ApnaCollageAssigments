package org.example;

import java.util.*;

public class MapProblems {
    //Count how many times each character appears in a string
    public static void countChars(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
       for(char c:s.toCharArray()){
           if(hm.containsKey(c)){
               hm.put(c,hm.get(c)+1);
           }
           else {
               hm.put(c,1);
           }
       }
        System.out.println(hm);
    }
    //Count how many times each number appears in an array
    public static void countNumbersInArray(int [] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int number:nums){
                map.put(number, map.getOrDefault(number, 0) + 1);
//            }

        }
        System.out.println(map);
    }
    //First non-repeating character
    public static void nonrepeatChar(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
      for(char c: s.toCharArray()){
          hm.put(c,hm.getOrDefault(c,0)+1);
      }
      for(char c:s.toCharArray()){
          if(hm.get(c)==1){
              System.out.println(c);
              break;
          }
      }
    }
    public static void isAnagram(String a , String b){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : a.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for(char c : b.toCharArray())
            map.put(c, map.getOrDefault(c, 0) - 1);

        boolean isAnagram = true;
        for(int val : map.values())
            if(val != 0) isAnagram = false;

        System.out.println(isAnagram);
    }
    //Print all unique characters in a string
    public static void uniqueChars(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c,0)+1);
        }
        for(char c : s.toCharArray()){
            if(hm.get(c)==1){
                System.out.println(c);
            }
        }
    }
    //Count words in a sentence
    public static void countWordsInSenetance(String words){
        HashMap<String,Integer> hm = new HashMap<>();
         String[] s = words.split(" ");
         for (String str :s){
             hm.put(str,hm.getOrDefault(str,0)+1);
         }
        System.out.println(hm);


    }
    //Count chars in a sentence
    public static void countCharsInSenetance(String words){
        HashMap<Character,Integer> hm = new HashMap<>();

        for (char c :words.toCharArray()){
            if(c !=' ') {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
        }
        System.out.println(hm);


    }
    //Find top 2 most frequent characters in a string
    public static void  firstandSecmax(String s){

    }
    //Count frequencies and display the highest occurring number [2, 5, 3, 2, 8, 2, 3, 5] In this example → 2 occurs 3 times
    public static void highestOccur(int [] nums){
        int max= Integer.MIN_VALUE;
        HashMap<Integer ,Integer > hashMap = new HashMap<>();
        for(int num:nums){
            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
        }
        for(int val:hashMap.values()){
            max=Math.max(val,max);
        }
        for(Map.Entry<Integer,Integer > entry:hashMap.entrySet()){
              if(entry.getValue()==max){
                  System.out.println("highest occur :"+entry.getKey()+" "+entry.getValue());
              }
        }
    }
    //Check if two arrays have the same elements (order doesn’t matter)
    public static void sameElements(int []a,int []b){
        if(a.length !=b.length){
            System.out.println("Not same");
        }
        HashMap<Integer,Integer> has= new HashMap<>();
        for(int num:a){
            has.put(num,has.getOrDefault(num,0)+1);
        }
        for(int num:b){
            has.put(num,has.getOrDefault(num,0)-1);
        }
        boolean isAnagram=true;
        for(int val :has.values()){
            if(val !=0){
               isAnagram=false;
               break;
            }
        }
        if (isAnagram){
            System.out.println("Same");
        }else {
            System.out.println("not same");
        }
    }
    //Given string "aabbccdde", compress to "a2b2c2d2e1"
    public static void  compress(String str){
        HashMap<Character,Integer>map = new HashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
        System.out.println();
    }
    //Reverse a map: if map is <name, id> convert to <id, name>
    public static void reverseMap(Map<String,Integer> map){
        HashMap<Integer,String> map1= new HashMap<>();
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           map1.put(entry.getValue(),entry.getKey());
       }
        System.out.println(map1);
    }
    //interSection of two arrays
    public static void intersec(int []a,int []b){
        //without duplicates
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        Set<Integer> set1= new HashSet<>();
        Set<Integer>set2= new HashSet<>();

        for(int num:a){
            set1.add(num);
        }
        for(int num:b){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        System.out.println(set2);

        //with duplicates
//        ArrayList<Integer> li = new ArrayList<>();
//        for(int num:a){
//            hashMap.put(num,hashMap.getOrDefault(num,0)+1);
//        }
//        for(int num:b){
//           if(num)
//        }

    }
    // Given an array, print elements in sorted frequency order higest-low
    public static void  frequencyOrder(int []nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
       List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));

        for(Map.Entry<Integer,Integer> entry:list){
//            int element = entry.getKey();
//            int freq=entry.getValue();
//            for(int i=0;i<freq;i++){
//                System.out.print(element+" ");
//            }
            System.out.print(entry.getKey()+" ");
        }
    }
    //Detect if two sentences are anagrams word-by-word

    public static void twoSentenceAnagrams(String s1 ,String s2){
        String a = s1.replaceAll("\\s+", "");
        String b= s2.replaceAll("\\s+", "");
        if(a.length() !=b.length()){
            System.out.println("not anagrams ");
        }
        HashMap<Character,Integer> map = new HashMap<>();

         for(char c:a.toCharArray()){
             map.put(c,map.getOrDefault(c,0)+1);
         }

         for(char c:b.toCharArray()){
             map.put(c,map.getOrDefault(c,0)-1);
         }
         boolean isAnagram =true;
         for(int val:map.values()){
             if(val !=0){
                 isAnagram=false;
                 break;
             }
         }
         if(isAnagram){
             System.out.println(" they are anagrams");
         }else {
             System.out.println("not anagrams");
         }

    }
  //Find all pairs in array whose sum = K using a map

    public static void pairSumUsingMap(int [] nums, int target){
        HashMap<Integer,Boolean > map =new HashMap<>();
        for(int num:nums){
            int number =target-num;

            if(map.containsKey(number)){
                System.out.println("("+number+" "+num+")");
            }
            map.put(num,true);
        }
    }

    //Count how many times each word appears in a large paragraph
    public static void eachWordCount(String word){
        String[] str= word.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:str){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

    }


    public static void firstLetterSameAnagrams(List<String> li){
        Map<String ,List<String >> map = new HashMap<>();
        for(String str :li){
            String firstLetter= str.substring(0,1);
            map.computeIfAbsent(firstLetter, k -> new ArrayList<>())
                    .add(str);
        }

        System.out.println(map);

    }
    //Group anagrams together (["eat","tea","ate"] → same group)
    public static void groupAnagrams(String [] str){
        Map<String,List<String>> map = new HashMap<>();
        for(String s:str){
           char[] c = s.toCharArray();
           Arrays.sort(c);
            String key = new String(c);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        System.out.println(new ArrayList<>(map.values()));

    }
    //Build a frequency map and sort by values
    public static void sortByValues(String [] str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(String s:str){
            for(char c:s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        List< Map.Entry<Character,Integer>> li = new ArrayList<>(map.entrySet());
        li.sort((a,b)->a.getValue().compareTo(b.getValue()));
        for(Map.Entry<Character,Integer>entry:li){
            System.out.print(entry.getKey());
        }

    }



    public static void main(String[] args) {
      String s="banana";
       countChars(s);
       int []nums = {1,2,3,3,3,4,4,5,5,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();

        countNumbersInArray(nums);
        nonrepeatChar(s);
        String a = "listen";
        String b = "silent";
        isAnagram(a,b);
        uniqueChars(s);
        String str = "hello i am good am hello";
        String str1="hello good am i am hello";
        countWordsInSenetance(str);
        countCharsInSenetance(str);
        firstandSecmax(s);
        highestOccur(nums);
        int []c ={1,2,3};
        int [] d={13,2,1,4};
        sameElements(c,d);
        String s1="aabbccdde";
        compress(s1);
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Aman", 101);
        map1.put("Riya", 102);
        map1.put("Sahil", 103);
        reverseMap(map1);
        int []kk={1,2,3,4,5};
        int []k1={3,4,5,6,7};
        intersec(kk,k1);
        frequencyOrder(nums);
        twoSentenceAnagrams(str,str1);
        eachWordCount(str1);

        List<String> list= Arrays.asList("cat", "cow", "car", "dog", "door");
         String [] st={"cat", "cow", "car", "dog", "door"};
        groupAnagrams(st);
        sortByValues(st);
//      ArrayList<Integer> lis = new ArrayList<>(Arrays.asList(1,2,3,4));
//        ListIterator<Integer >li= lis.listIterator();
//             while (li.hasNext()){
//                 System.out.println(li.next());
//             }
//             while (li.hasPrevious()){
//                 System.out.println(li.previous());
//             }
//
//        Map<Integer,String>map2= new HashMap<>();
//        map2.put(1,"abc");
//        map2.put(3,"kjn");
//        map2.put(7,"ajjbc");
//
//        for(Map.Entry<Integer,String> ha:map2.entrySet()){
//            if(ha.getKey()==1){
//                map2.put(4,"jhjk");
//            }
//        }
//        System.out.println(map2);
    }

}
