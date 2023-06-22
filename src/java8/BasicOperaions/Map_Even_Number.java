package java8.BasicOperaions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Map_Even_Number {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(11, 22, 122, 24, 33, 44, 43, 444, 56, 77, 7, 1);
        System.out.println("------- even ----------");
        number.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
        System.out.println("------- Starts with 1 ----------");
        number.stream().map(S -> S + "").filter(S -> S.startsWith("1")).forEach(System.out::println);
        System.out.println("----- first element------");

        number.stream().findFirst().ifPresent(System.out::println);
        System.out.println("----- count element------");
        long count = number.stream().count();
        System.out.println(count + "");

        System.out.println("---------max number---------");
        int max = number.stream().max((x, y) -> x - y).get();
        System.out.println("max is" + " " + max);

        System.out.println("---------  min number -----------");
        int min = number.stream().min((x, y) -> x - y).get();
        System.out.println("min" + " " + min);

        System.out.println("--------------- Sort  ---------------------");

        number.stream().sorted().forEach(System.out::println);


        System.out.println("----------------count duplicates--------------");
        List<String> names = Arrays.asList("AA", "BB", "AA", "BB", "CC", "SS", "CC");
        Map<String, Long> namesCount = names
                .stream()
                .filter(x -> Collections.frequency(names, x) > 1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);


        System.out.println("--------------  Count each element/word   -----------------");
        List<String> namess = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> namesCounts = namess
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity()
                                , Collectors.counting()
                        ));
        System.out.println(namesCounts);

        System.out.println("------------------ map example   ---------------");
        Map<String, String> map = new HashMap<>();
        map.put("key 1", "value 1");
        map.put("key 2", "value 2");
        map.put("key 3", "value 3");
        // map.put("key 4", "value 4");
        // map.put("key 5", "value 5");
        System.out.println("1--->");
        System.out.println(map.put("key 3", "value 3.1"));
        System.out.println("2---->");
        System.out.println(map.put("key 4", "value 4"));
        System.out.println("3----->");
        System.out.println(map.put(null, "value 5"));
        // System.out.println(map.put("key 5", "value 5"));

        System.out.println("--------find output------");
        Set<String> set = new HashSet<>();
        set.add("Welcome");
        set.add("To");
        set.add("Avizva");
        System.out.println(set.add("Avizva"));
        System.out.println("HashSet: " + set);


       /*
       //comments for generating exception
        //System.out.println("---------- find out of exception generating demo --------");
     //  comments for generating exception

        System.out.println("--------find output------");
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        for (Integer integer : integerList) {
            integerList.remove(1);
            System.out.println("Integer " + integer);
        }
        */
//o/p->
        /*
        Integer 1
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1043)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:997)
	at java8.BasicOperaions.Map_Even_Number.main(Map_Even_Number.java:84)
	*/
        System.out.println("-------List------- ");
        List<String> name = Arrays.asList("Aman", "Ajay", "Vivek", "Hari", "Mohan", "Vijay", "Ashish", "Mohit", "Zeeshan", "Ravi");
        List<String> lst1 = name.stream().collect(Collectors.toList());
        System.out.println(lst1);

    }
}
