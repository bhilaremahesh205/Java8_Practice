package java8;

import java.util.*;

public class Operations {
    public static void main(String[] args) {
       /* Map<String, String> map = new HashMap<>();
        map.put("key 1", "value 1");
        map.put("key 2", "value 2");
        map.put("key 3", "value 3");
        System.out.println(map.put("key 3", "value 3.1"));
        System.out.println(map.put("key 4", "value 4"));
        System.out.println(map.put(null, "value 5"));*/

       /* Set<String> set = new HashSet<>();
        set.add("Welcome");
        set.add("To");
        set.add("Avizva");
        System.out.println(set.add("Avizva"));
        System.out.println("HashSet: " + set);*/

      /*  List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(2);
        for (Integer integer : integerList) {
            integerList.remove(1);
            System.out.println("Integer " + integer);
            //System.out.println("Integer " + integerList);
        }*/

//        List<String> name =  Arrays.asList("Aman", "Ajay", "Vivek", "Hari", "Mohan", "Vijay", "Ashish", "Mohit", "Zeeshan", "Ravi");
//        char[] chars = name.toCharArray();



        Map<String, String> map = (Map<String, String>) new HashMap<String, String>();
        map.put("key 1", "value 1");
        map.put("key 2", "value 2");
        map.put("key 3", "value 3");
        System.out.println(map.put("key 3", "value 3.1"));
        System.out.println(map.put("key 4", "value 4"));
        System.out.println(map.put(null, "value 5"));
        System.out.println(map.put("key 1", null));
        someMethod();
    }
    public static void someMethod(String... info){
        //info = "nnen,ee,bb";
        // method body
        System.out.println("info" + info);
    }
}
