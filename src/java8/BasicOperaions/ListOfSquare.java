package java8.BasicOperaions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ListOfSquare {
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(4,5,20,7,10,9);
        List<Integer> list = Arrays.asList(4,5,6,7,8,9);
       // list.stream().mapToInt(n -> n * n).forEach(System.out::println);
       // list.stream().mapToInt(n -> n * n).filter(n -> n >= 100).forEach(System.out::println);
        OptionalDouble avg = list.stream().mapToInt(n -> n * n).filter(n -> n >= 100).average();
        if (avg.isPresent()) {
            System.out.println(avg);
        }
        else {
            System.out.println("No qualifying element");
        }
    }
}
