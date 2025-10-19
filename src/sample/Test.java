package src.sample;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
         test();
      //   getSecondHighestSal(getEmplist());
        // checksum(52);
        //literator(2, 6);
        //printst(emplist);
        //getTer();
        //sumOfLeastNumbersInList(4);
        //secondHighest();
        //treeImp();
        //test17();
        //distinct();
       // min();
        //switchcse();
      //  checkChar();
        //addChecker();
        //rotate(2);
        int[] nums = {1,2,3,4};
        //aryTest(nums);
       // checkChar();
        System.out.println(happyNumber(11));
    }

    private static List<EmployeeTest> getEmplist(){
        EmployeeTest employeeTest = new EmployeeTest();
        employeeTest.setDept("IT");
        employeeTest.setEmpName("Kiran");
        employeeTest.setSalary(10000.0);
        EmployeeTest employeeTest2 = new EmployeeTest();
        employeeTest2.setDept("Tech");
        employeeTest2.setEmpName("Surya");
        employeeTest2.setSalary(8000.0);
        EmployeeTest employeeTest3 = new EmployeeTest();
        employeeTest3.setDept("IT");
        employeeTest3.setEmpName("Teja");
        employeeTest3.setSalary(5000.0);
        EmployeeTest employeeTest4 = new EmployeeTest();
        employeeTest4.setDept("Tech");
        employeeTest4.setEmpName("Vamshi");
        employeeTest4.setSalary(12000.0);

        List<EmployeeTest> emplist= new ArrayList<>();
        emplist.add(employeeTest);
        emplist.add(employeeTest2);
        emplist.add(employeeTest3);
        emplist.add(employeeTest4);
        return emplist;
    }
    private static void test(){
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a==b);
        System.out.println(c==d);
    }
    private static void getSecondHighestSal(List<EmployeeTest> emplist ){
        emplist.
                stream().
                collect(Collectors.groupingBy(
                        EmployeeTest::getDept,Collectors.collectingAndThen(
                                Collectors.toList(),list -> list.stream().max(Comparator.comparingDouble(EmployeeTest::getSalary)
                                )))).forEach((key,val) ->
                        val.ifPresent(e -> System.out.println(e.getDept() + " - " + e.getSalary() + " - " + e.getEmpName() + " " + key)));
        emplist.
                stream().
                collect(Collectors.groupingBy(
                        EmployeeTest::getDept,Collectors.averagingDouble(EmployeeTest :: getSalary)))
                        .forEach((key,val) -> System.out.println( key + " " + val)
                );
    }
    private static void secondHighest(){
        int[] array = {1, 50, 100, 90, 2, 40};
        /*int i = 1;
        int s = 0;
        for(int k = 0; k<array.length; k++){
            if(i<=array[k]){
                s = i;
                i = array[k];
            }else if(s<array[k]){
                s = array[k];
            }
        }
        System.out.println(s);*/
        List<Integer> ls = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        Optional<Integer> t = ls.stream().sorted((a,b) -> b-a).skip(1).findFirst();
        System.out.println(t.get());
    }
    private static void checksum(int sum){
        int[] array = {1, 50, 100, 90, 2, 40};
        List<Integer> ls = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        int sub = 0;
        for(int i : array){
            sub = sum-array[i];
            if(ls.contains(sub)){
                System.out.println(ls.indexOf(sub) + " " + i);
                break;
            }
        }
    }
    private static void literator(int l,int r){
        int[] al  = {1, 50, 100, 90, 2, 40, 10, 45, 65};
        List<Integer> lst = Arrays.stream(al).boxed().collect(Collectors.toList());

        while(l<r){
            int temp=lst.get(l);
            lst.set(l,lst.get(r));
            lst.set(r,temp);
            l++;
            r--;
        }
        lst.forEach(i -> System.out.println(i));
    }
    private static void printst(List<EmployeeTest> emplist){
        System.out.println(emplist.stream().map(EmployeeTest::getEmpName).collect(Collectors.joining(",")));
    }
    private static void getTer(){
        String[] ars = {"Tester","Break","Letter","Streak","Trats","Teachter"};

        List<String> ls = new ArrayList<>();
        ls = Arrays.asList(ars);
        String sb = "ter";
        //ls.stream().filter( e -> e.contains(sb)).forEach(e-> System.out.println(e));
        List<String> ts = ls.stream().filter( e -> e.contains("ter")).collect(Collectors.toList());
        ts.forEach(e-> System.out.println(e));
    }
    private static void sumOfLeastNumbersInList(Integer k){
        int[] al  = {10, 20, 7};// {1, 50, 100, 90, 2, 40, 10, 45, 65};
        List<Integer> nums = Arrays.stream(al).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> pl = new PriorityQueue<>(Collections.reverseOrder());
        pl.addAll(nums);
        while(k>0){
            int i = pl.poll();
            int l = (int) Math.ceil(i/2.0);
            pl.offer(l);
            k--;
        }
        int sum=0;
        for(int n : pl){
            sum+=n;
        }
        System.out.println(sum);
    }

    private static void getRegularExp(String s, String pattern){

        boolean check = false;

    }
    //abdedecadfb length of longest substring with non repeating characters in an input string:
    private static void getSubString(String s){

        char[] ary = s.toCharArray();
        int leng = 0;
        Map<String,StringBuffer> hs = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        /*for(int i=0;i<s.length();i++){
            if(!hs.containsKey(ary[i])){
               sb.append(ary[i]);
               hs.put(String.valueOf(ary[i]));
            }
        }*/
        for(int i=0;i<s.length();i++){

        }
    }

    private static void treeImp() {

        //str.chars().map( x -> x -"0").reduce((a,b)-> a*b);

        int[] arr = {12, 34, 56, 78, 98, 45, 23};

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static void test17(){
        // Using a Text Block
        String value = """
            Multi-line
            Text
            """;
        System.out.println(value);
    }

    private static void distinct(){
        int[] al  = {10, 20, 7, 10, 5, 20, 7, 10,10,20,7,6,8};// {1, 50, 100, 90, 2, 40, 10, 45, 65};
        List<Integer> nums = Arrays.stream(al).boxed().collect(Collectors.toList());
        List<Integer> numslist = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(numslist);
    }

    private static void min(){
        int[] al  = {10, 20, 7, 10, 2, 20, 7, 10,10,20,7,6,8};// {1, 50, 100, 90, 2, 40, 10, 45, 65};
        List<Integer> nums = Arrays.stream(al).boxed().collect(Collectors.toList());
        Optional<Integer> minNum = nums.stream().sorted((a,b) -> a - b).findFirst();
        System.out.println(minNum);
        List<Integer> numslist = nums.stream().sorted((a,b) -> a - b).collect(Collectors.toList());
        System.out.println(numslist);
    }

    private static void switchcse(){
        /*for (int n = 0; n < 3; n++) {
            switch (n) {
                case 2 -> System.out.println(" 2 ");
                case 1-> System.out.println(" 1 ");
                case 0 -> System.out.println(" 3 ");
            }
        }*/

        for (int n = 0; n < 3; n++) {
            switch (n) {
                case 2: System.out.println(" 2 ");
                case 1: System.out.println(" 1 ");
                case 0: System.out.println(" 3 ");
            }
        }

    }
    
    //We have a input array as
    //String arr[] = { “abcd", “java", “dcba", “ajav", “xyz", “epam", “pame", “aepm" };
    //Kindly write a java program for following output
    //Output:
    //[epam, pame, aepm] contains same character
    //[java, ajav] contains same character
    //[abcd, dcba] contains same character
    
    private static void checkChar(){
        String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };

        Map<String, List<String>> map = new HashMap<>();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }

        // Print groups with more than one word
        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                System.out.println(group + " contains same character");
            }
        }
    }
    private static void addChecker(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(b>a && d>c);
        System.out.println(a>b && d>c);
        System.out.println(b>a && c>d);
        System.out.println(a>b && c>d);
    }

    //Write a program to find the longest string in a list of strings using Java Stream API.
    //List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
    private static void longst(){
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        Optional<String> st = strings.stream().max(Comparator.comparingInt(String::length));
        if(st.isPresent()){
            System.out.println();
        }
    }

    //Given a list of integers, write a program to find and print the second largest number using Java Stream API.
    //List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);

    private static void secLong(){
        List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
        numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        list1.stream().filter(list2::contains).collect(Collectors.toList());

    }

    //Write a program to find the intersection of two lists of strings using Java Stream API.
    //List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
    //               List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");


    //Input = 1 -> 2 -> 3 -> 4 -> 5
    //Target = 2
    //Output = 4 -> 5 -> 1 -> 2 -> 3
    private static void rotate(int s){
        List<Integer> ls = new LinkedList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        int l = ls.size();
        int k = 0;
        for(int i = l-s;i<l;i++){
            ls.set(k,ls.get(i));
            k++;
           // System.out.println(ls.get(i));
        }
        for(int i = 0;i<=s;i++){
            ls.set(k,ls.get(i));
            k++;
            //System.out.println(ls.get(i));
        }
        System.out.println(ls);

    }

   /* class Node {
        int num;
        Node next;
        Node (int num, Node next);
    }
    class LinkList {
        Node start;

    }
    class Test1 {
        main(String []s){
            Node temp4 = new Node(4, null);
            Node temp3 = new Node(3, temp4);
            Node temp2 = new Node(2, temp3);
            Node temp1 = new Node(1, temp2);
            Node start = new Node(0, temp1);
            LinkList list = new LinkList();
            list.start = start;

        }
    }*/

    /*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n) time and without using the division operation.



    Example 1:

    Input: nums = [1,2,3,4]
    Output: [24,12,8,6]
    Example 2:

    Input: nums = [-1,1,0,-3,3]
    Output: [0,0,9,0,0]*/

    public static void aryTest(int[] nums){
        int s = nums.length;
        int[] ary = new int[s];
        int index =1;
        for(int i=0;i<s;i++){  //Input: nums = [1,2,3,4]
            ary[i]=index;
            index *= nums[i];
        }
        for(int i: ary){
            System.out.println(i);
        }
        int rev = 1;
        for(int i=s-1;i>=0;i--){
            ary[i] *= rev;
            rev *= nums[i];
        }
        for(int i: ary){
            System.out.println(i);
        }

    }

//    Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in
//    t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
// ex: //Input: s = "ADOBECODEBANC", t = "ABC" //Output: "BANC"

    /*public static void smallestString(String s, String c){
        char[] ary = s.toCharArray();
        char[] check = c.toCharArray();
        StringBuffer st = new StringBuffer();
        for(char ct: ary){
//            int i = c.charAt(ct);
            c.contains(ct);


        }
    }*/

    //19 -> (1*1) +(9*9) -> 82 -> (8*8) + (2*2) -> 68 -> (6*6) + (8*8) -> 36 + 64 -> 100 -> 1

    public static String happyNumber(int n){
        int sum =0;
        Set<Integer> hs = new HashSet<>();
        while(n !=1 && !hs.contains(n)){
            hs.add(n);
            while(n!=1){
                int digit = n%10;
                sum +=digit*digit;
                n/=10;
            }
        }
        System.out.println(n);
        return "HappyNumber";
    }
}




