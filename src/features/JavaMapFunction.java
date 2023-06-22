package features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class JavaMapFunction {
    public static void main(String args[]) {
        List<String> cities = Arrays.asList("London", "HongKong", "Paris", "NewYork");
        System.out.println("Original list : " + cities);
        System.out.println("list transformed using Java 8 :" + transform(cities));
        System.out.println("list transformed using loop before Java 8 : " + beforeJava8(cities));
        // You can even on the fly tranform Collection in Java using // Map function // let's transform a List of integers to square each element
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> squares = numbers.stream() .map( i -> i*i) .collect(toList());
        System.out.println("original list of numbers : " + numbers);
        System.out.println("transformed list of integers using Map in Java 8 : " + squares);

       // String str = "Mahesh";
      //  int y = Integer.parseInt(str);
//        System.out.println(y+" is the string");
//        System.out.println("is the string" + y);
//        System.out.println(y+" is the string" + y);

       /* String myString = "1234";
        int y = Integer.parseInt(myString);
        try {
            y = Integer.parseInt(str);
            System.out.println(y+" is the string");
            System.out.println("is the string" + y);
            System.out.println(y+" is the string" + y);
        }
        catch (NumberFormatException e) {
            y = 0;
            System.out.println("is the string" + y);
           *//* System.out.println(y+" is the string");
            System.out.println("is the string" + y);
            System.out.println(y+" is the string" + y);*//*
        }*/

        String myString = "1234";
     //   int y = Integer.parseInt(myString);

        try {
           // y = Integer.parseInt(myString);
            Integer y = Integer.valueOf(myString);
// or
         //   int y = Integer.parseInt(myString);
            System.out.println("is the string" + y);
        }
        catch (NumberFormatException e) {
            Integer y = Integer.valueOf(myString);
            y = 0;
            System.out.println("is the string" + "***************");
            System.out.println("is the string" + y);
        }
    }

    public static List<String> beforeJava8(List<String> listOfString) {
        List<String> coll = new ArrayList<>();
        for (String str : listOfString) {
            coll.add(str.toUpperCase());
        }
        return coll;
    }

    public static List<String> transform(List<String> listOfString) {
        return listOfString.stream() // Convert list to Stream
         .map(String::toUpperCase) // Convert each element to upper case
         .collect(toList()); // Collect results into a new list
         }
}