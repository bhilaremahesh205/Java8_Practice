package java11;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Operations {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);

        System.out.println("****----******------");

        List<String> list = Arrays.asList("a", "b", "c");
        String result = list.stream()
                .map((var x) -> x.toUpperCase())
                .collect(Collectors.joining(","));
        System.out.println(result);

        System.out.println("*************************");

        var numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> numbersGreaterThanSix = numbers.stream()
                .filter(number -> number > 6)
                .findFirst();

        if (numbersGreaterThanSix.isPresent()) {
            System.out.println("The number: " + numbersGreaterThanSix.get());
        } else {
            System.out.println("Number is not available!");
        }

        System.out.println("***********************");
        if (numbersGreaterThanSix.isEmpty()) {
            System.out.println("Number is not available!");
        } else {
            System.out.println("The number: " + numbersGreaterThanSix.get());
        }

    }
}
