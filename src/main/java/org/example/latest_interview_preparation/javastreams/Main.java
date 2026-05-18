package org.example.latest_interview_preparation.javastreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    //Find First Non-Repeating Character  "swiss"    op:-w

    public static char firstNonRepeatingChar(String str){
       return str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse('\0');
    }
    public static char lastNonRepeatingChar(String str){
       List<Character> li =str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(i->i.getValue()==1)
                .map(Map.Entry::getKey)
                 .toList();

         return  li.stream()
                 .skip(li.size()-1)
                 .findFirst()
                 .orElse('\0');

    }
    //Group Anagrams Using Streams      ["eat", "tea", "tan", "ate", "nat", "bat"]
    // OP:-[
    // [eat, tea, ate],
    // [tan, nat],
    // [bat]
    //]
    public static List<List<String>> groupAnagrams(List<String> str){
         List<List<String>> listOfAnagrams = str.stream()
                .collect(Collectors.groupingBy(c -> {
                    char[] ch = c.toCharArray();
                    Arrays.sort(ch);
                    return new String(ch);

                })).values().stream().toList();

         return listOfAnagrams;
    }

    // Flatten Nested List     [[1,2,3], [4,5], [6]]     OP [1,2,3,4,5,6]
    public static List<Integer> flaternList(List<List<Integer>> li){
         List<Integer> flatList = li.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

         return flatList;
    }
    // find duplicates in the list  1,2,3,4,3,2,5 OP:2,3
    public static List<Integer> findDuplicates(List<Integer> li){
       List<Integer> list= li.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i->i.getValue() >1)
                .map(Map.Entry::getKey)
                .toList();

       return list;
    }



    public static List<Employee>  addEmployee(){
        List<Employee> employess=
                Arrays.asList(
                        new Employee(1L,"John",5000.0,25L,"JAVA"),
                        new Employee(2L,"Alice",7000.0,27L,"IT"),
                        new Employee(3L,"Bob",5000.0,25L,"JAVA"),
                        new Employee(1L,"Marcy",10000.0,30L,"PYTHON")

                );
        return employess;
    }

    //Sort Employees by Multiple Fields
    //  Sort employees by salary (desc), then name (asc).
    // IP:-[(John,5000), (Alice,7000), (Bob,5000)]     OP:-[(Alice,7000), (Bob,5000), (John,5000)]

    public static List<Employee> sortEmployeeBySalAndName(List<Employee> emp){
         List<Employee> listOfEmps = emp.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName)).toList();
         return listOfEmps;

    }

    //divide list into 2 parts even and odd list   [1,2,3,4,5]
    // OP;-{
    // even: [2,4],
    // odd: [1,3,5]
    //}

    public static  Map<String,List<Integer>> divideEvenOrOddList(List<Integer> li){

         Map<Boolean, List<Integer>> result = li.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        Map<String,List<Integer>> map = new HashMap<>();
        map.put("even",result.get(true));
        map.put("odd",result.get(false));

        return map;
    }
//Top K Frequent Elements   Find top 2 frequent elements.
//   [1,1,1,2,2,3]  k = 2    OP;-[1,2]
    public static List<Integer> topKFrequentEle(List<Integer> list, int k){
         Map<Integer, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

         List<Integer> list1 = collect.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
        return list1;
    }
    public static int [] topKfrequencyInCoreJava(int[]nums,int k){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for(Map.Entry<Integer,Integer> entry :map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int []newArray = new int[k];
        int j=0;
        while(!pq.isEmpty()){
            for(int i=0;i<newArray.length;i++) {
                newArray[j++]=pq.poll().getKey();
            }
        }
        return newArray;
    }
    //Longest String in List  ["java", "stream", "lambda"]   OP:-"lambda"

    public static String longestString(List<String>list){
        String s = list.stream()
                .max(Comparator.comparing(String::length)).orElse(null);
        return s;

    }
    public static String secondLastLongest(List<String > list){
       int maxLength=
                list.stream()
                        .mapToInt(String::length)
                        .max()
                        .orElse(0);

         List<String> longest = list.stream()
                .filter(i -> i.length() == maxLength)
                .toList();
         String s = longest.size() >= 2 ? longest.get(longest.size() - 2)
                : null;

         return s;

    }
    //["I", "love", "Java"]    OP:-"I love Java"
    public static String concatenateStrings(List<String>list){
        StringBuilder stringBuilder = new StringBuilder();
        list.forEach(i->stringBuilder.append(i).append(" "));

         stringBuilder.toString().trim();

        return  list.stream().collect(Collectors.joining(" "));

    }
    //Find Second Highest Number   [10, 20, 30, 40]   OP:-30

    public static Integer secondHighest(List<Integer> li){
//       Integer list=li.stream()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst()
//                .orElse(0);
//       return list;
         Integer i = li.stream()
                .max(Integer::compareTo)
                .orElse(0);

         Integer secLar= li.stream()
                 .filter(j->!j.equals(i))
                 .max(Integer::compareTo)
                 .orElse(0);
         return secLar;
    }
    public static Map<Character ,Long> frequencyInString(String str){
      return   str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(i->i,Collectors.counting()));
    }

    //[0,2,4,6,8,10,12,14,16,18]   Generate first 10 even numbers.
    public static List<Integer> generateEven(List<Integer>li){
       return IntStream.range(0,li.size())
                .filter(i->i%2==0)
                .boxed()
                .toList();
    }

    //Merge maps and sum values for duplicate keys.
  /*  {a=1, b=2}
    {b=3, c=4} */      // OP:-{a=1,b=5,c=4}

    public static Map<Character,Integer> mergeTwoMaps(Map<Character,Integer>map1,
                                                      Map<Character,Integer>map2){

      return   Stream.of(map1,map2)
                .flatMap(map->map.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum
                ));
    }
    public static Boolean isPlaindrome(String str){
        return IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i) ==str.charAt(str.length()-1-i));
    }

    //Problem: Remove duplicates based on field (e.g., id).
    // Twist: Streams don’t support this directly.
    // Expected: Use ConcurrentHashMap or custom predicat

    public static List<Employee> removeDuplicateKeys(List<Employee> emp){
         List<Employee> list = emp.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Function.identity(),
                        (existing, first) -> existing
                )).values().stream().toList();

         Map<Long,String> map =
                 list.stream().
                         collect(Collectors.toMap(
                                 Employee::getId,
                                 Employee::getName
                         ));
        System.out.println(map);

         return list;
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] newArray=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<nums.length;j++){
                if(j!=i){
                    prod*=nums[j];
                }
            }
            newArray[i]=prod;
        }
        return newArray;
    }
    public static String interChange(String str){
      String [] s=  str.split(" ");
      String temp =s[2];
      s[2]=s[s.length-1];
      s[s.length-1]=temp;
         String ss = String.join(" ", s);

        return ss;
    }

    // [1,2,3]   123 +1 =1234  OP:-[1,2,3,4];

    public static void plusOne(List<Integer> list){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        System.out.println(sb.toString());
         int i = Integer.parseInt(sb.toString());
         int k =i+1;
         String s = String.valueOf(k);
         String[] split = s.split("");
         int[] array = Arrays.stream(split)
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        String str ="swissa";
        System.out.println(firstNonRepeatingChar(str));
        System.out.println(lastNonRepeatingChar(str));
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        System.out.println(groupAnagrams(list));
        List<List<Integer>> li =Arrays.asList(
                List.of(1,2,3),
                List.of(4,5),
                List.of(6)
        );
        System.out.println(flaternList(li));

        List<Integer> duplicats=Arrays.asList(1,2,3,4,5,2,6,3);
        System.out.println(findDuplicates(duplicats));
        addEmployee();
        System.out.println(addEmployee());
         List<Employee> sortedEmployeeBySalAndName = sortEmployeeBySalAndName(addEmployee());
        System.out.println(sortedEmployeeBySalAndName);

        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        System.out.println(divideEvenOrOddList(list1));
        List<Integer> list2=Arrays.asList(1,1,2,2,2,2,3,3,3);
        int k=2;
        System.out.println(topKFrequentEle(list2,k));
         int[] array = list2.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(topKfrequencyInCoreJava(array, k))+"   sffsg");
        List<String> list3=Arrays.asList("java", "stream", "lambda");
        System.out.println(longestString(list3));
        System.out.println(secondLastLongest(list3));
        List<String> list4= Arrays.asList("I", "love", "Java");
        System.out.println(concatenateStrings(list4));
        List<Integer>list5=Arrays.asList(10, 20, 30, 40);
        System.out.println(secondHighest(list5));
        String st="banana";
        System.out.println(frequencyInString(st));
        List<Integer> list6=Arrays.asList(0,2,4,6,8,10,12,14,16,18);
        System.out.println(generateEven(list6));

        Map<Character,Integer >map = Map.of('A' ,1 ,'B',4);
        Map<Character,Integer >map1 = Map.of('c' ,1 ,'B',4);

        System.out.println(mergeTwoMaps(map,map1));
        String s="madam";
        System.out.println(isPlaindrome(s));
        System.out.println(removeDuplicateKeys(addEmployee()));
       int [] nn= {1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(nn)));
        String ss="Java is good python is better";
        System.out.println(interChange(ss));

        List<Integer> list7= Arrays.asList(1,2,3);
        plusOne(list7);



    }

}
