import java.io.PrintStream;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;

public class InterviewQuestions {

    public static void main(String[] args) {
        test();
        int[] var10000 = new int[]{1, 2, 3, 4};
        System.out.println(happyNumber(11));
    }

       /* private static List<EmployeeTest> getEmplist() {
            EmployeeTest employeeTest = new EmployeeTest();
            employeeTest.setDept("IT");
            employeeTest.setEmpName("Kiran");
            employeeTest.setSalary((double)10000.0F);
            EmployeeTest employeeTest2 = new EmployeeTest();
            employeeTest2.setDept("Tech");
            employeeTest2.setEmpName("Surya");
            employeeTest2.setSalary((double)8000.0F);
            EmployeeTest employeeTest3 = new EmployeeTest();
            employeeTest3.setDept("IT");
            employeeTest3.setEmpName("Teja");
            employeeTest3.setSalary((double)5000.0F);
            EmployeeTest employeeTest4 = new EmployeeTest();
            employeeTest4.setDept("Tech");
            employeeTest4.setEmpName("Vamshi");
            employeeTest4.setSalary((double)12000.0F);
            List<EmployeeTest> emplist = new ArrayList();
            emplist.add(employeeTest);
            emplist.add(employeeTest2);
            emplist.add(employeeTest3);
            emplist.add(employeeTest4);
            return emplist;
        }*/

    private static void test() {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    /*  private static void getSecondHighestSal(List<EmployeeTest> emplist) {
          ((Map)emplist.stream().collect(Collectors.groupingBy(EmployeeTest::getDept, Collectors.collectingAndThen(Collectors.toList(), (list) -> list.stream().max(Comparator.comparingDouble(EmployeeTest::getSalary)))))).forEach((key, val) -> val.ifPresent((e) -> {
              PrintStream var10000 = System.out;
              String var10001 = e.getDept();
              var10000.println(var10001 + " - " + e.getSalary() + " - " + e.getEmpName() + " " + key);
          }));
          ((Map)emplist.stream().collect(Collectors.groupingBy(EmployeeTest::getDept, Collectors.averagingDouble(EmployeeTest::getSalary)))).forEach((key, val) -> System.out.println(key + " " + val));
      }
*/
    private static void secondHighest() {
        int[] array = new int[]{1, 50, 100, 90, 2, 40};
        List<Integer> ls = (List) Arrays.stream(array).boxed().collect(Collectors.toList());
        Optional<Integer> t = ls.stream().sorted((a, b) -> b - a).skip(1L).findFirst();
        System.out.println(t.get());
    }

    private static void checksum(int sum) {
        int[] array = new int[]{1, 50, 100, 90, 2, 40};
        List<Integer> ls = (List) Arrays.stream(array).boxed().collect(Collectors.toList());
        int sub = 0;

        for (int i : array) {
            sub = sum - array[i];
            if (ls.contains(sub)) {
                PrintStream var10000 = System.out;
                int var10001 = ls.indexOf(sub);
                var10000.println(var10001 + " " + i);
                break;
            }
        }

    }

    private static void literator(int l, int r) {
        int[] al = new int[]{1, 50, 100, 90, 2, 40, 10, 45, 65};

        List<Integer> lst;
        for (lst = (List) Arrays.stream(al).boxed().collect(Collectors.toList()); l < r; --r) {
            int temp = (Integer) lst.get(l);
            lst.set(l, (Integer) lst.get(r));
            lst.set(r, temp);
            ++l;
        }

        lst.forEach((i) -> System.out.println(i));
    }

      /*  private static void printst(List<EmployeeTest> emplist) {
            System.out.println((String)emplist.stream().map(EmployeeTest::getEmpName).collect(Collectors.joining(",")));
        }*/

    private static void getTer() {
        String[] ars = new String[]{"Tester", "Break", "Letter", "Streak", "Trats", "Teachter"};
        new ArrayList();
        List<String> ls = Arrays.asList(ars);
        String sb = "ter";
        List<String> ts = (List) ls.stream().filter((e) -> e.contains("ter")).collect(Collectors.toList());
        ts.forEach((e) -> System.out.println(e));
    }

    private static void sumOfLeastNumbersInList(Integer k) {
        int[] al = new int[]{10, 20, 7};
        List<Integer> nums = (List) Arrays.stream(al).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> pl = new PriorityQueue(Collections.reverseOrder());
        pl.addAll(nums);

        while (k > 0) {
            int i = (Integer) pl.poll();
            int l = (int) Math.ceil((double) i / (double) 2.0F);
            pl.offer(l);
            k = k - 1;
        }

        int sum = 0;

        for (int n : pl) {
            sum += n;
        }

        System.out.println(sum);
    }

    private static void getRegularExp(String s, String pattern) {
        boolean check = false;
    }

    private static void getSubString(String s) {
        char[] ary = s.toCharArray();
        int leng = 0;
        new HashMap();
        new StringBuffer();

        for (int i = 0; i < s.length(); ++i) {
        }

    }

    private static void treeImp() {
        int[] arr = new int[]{12, 34, 56, 78, 98, 45, 23};

        for (int i = 0; i < arr.length - 1; ++i) {
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

    private static void test17() {
        String value = "Multi-line\nText\n";
        System.out.println(value);
    }

    private static void distinct() {
        int[] al = new int[]{10, 20, 7, 10, 5, 20, 7, 10, 10, 20, 7, 6, 8};
        List<Integer> nums = (List) Arrays.stream(al).boxed().collect(Collectors.toList());
        List<Integer> numslist = (List) nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(numslist);
    }

    private static void min() {
        int[] al = new int[]{10, 20, 7, 10, 2, 20, 7, 10, 10, 20, 7, 6, 8};
        List<Integer> nums = (List) Arrays.stream(al).boxed().collect(Collectors.toList());
        Optional<Integer> minNum = nums.stream().sorted((a, b) -> a - b).findFirst();
        System.out.println(minNum);
        List<Integer> numslist = (List) nums.stream().sorted((a, b) -> a - b).collect(Collectors.toList());
        System.out.println(numslist);
    }

    private static void switchcse() {
        // $FF: Couldn't be decompiled
    }

    private static void checkChar() {
        String[] arr = new String[]{"abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm"};
        Map<String, List<String>> map = new HashMap();

        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            ((List) map.computeIfAbsent(key, (k) -> new ArrayList())).add(word);
        }

        for (List<String> group : map.values()) {
            if (group.size() > 1) {
                System.out.println(String.valueOf(group) + " contains same character");
            }
        }

    }

    private static void addChecker() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(b > a && d > c);
        System.out.println(a > b && d > c);
        System.out.println(b > a && c > d);
        System.out.println(a > b && c > d);
    }

    private static void longst() {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        Optional<String> st = strings.stream().max(Comparator.comparingInt(String::length));
        if (st.isPresent()) {
            System.out.println();
        }

    }

    private static void secLong() {
        List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
        numbers.stream().sorted(Comparator.reverseOrder()).skip(1L).findFirst();
        List<String> list1 = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        List<String> list2 = Arrays.asList("banana", "orange", "grape", "watermelon");
        Stream var10000 = list1.stream();
        Objects.requireNonNull(list2);
        var10000.filter(list2::contains).collect(Collectors.toList());
    }

    private static void rotate(int s) {
        List<Integer> ls = new LinkedList();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        int l = ls.size();
        int k = 0;

        for (int i = l - s; i < l; ++i) {
            ls.set(k, (Integer) ls.get(i));
            ++k;
        }

        for (int i = 0; i <= s; ++i) {
            ls.set(k, (Integer) ls.get(i));
            ++k;
        }

        System.out.println(ls);
    }

    public static void aryTest(int[] nums) {
        int s = nums.length;
        int[] ary = new int[s];
        int index = 1;

        for (int i = 0; i < s; ++i) {
            ary[i] = index;
            index *= nums[i];
        }

        for (int i : ary) {
            System.out.println(i);
        }

        int rev = 1;

        for (int i = s - 1; i >= 0; --i) {
            ary[i] *= rev;
            rev *= nums[i];
        }

        for (int i : ary) {
            System.out.println(i);
        }

    }

    public static String happyNumber(int n) {
        int sum = 0;
        Set<Integer> hs = new HashSet();

        while (n != 1 && !hs.contains(n)) {
            hs.add(n);

            while (n != 1) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
        }

        System.out.println(n);
        return "HappyNumber";
    }
}