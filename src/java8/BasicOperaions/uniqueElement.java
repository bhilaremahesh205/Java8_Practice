package java8.BasicOperaions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class uniqueElement {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        Stream<Integer> fullList = Stream.concat(list1.stream(), list2.stream());

        List<Integer> allElements = fullList.collect(Collectors.toList());
        System.out.println(allElements);

        Set<Integer> uniqueElements = allElements.stream().collect(Collectors.toSet());
        System.out.println("Unique elements");
        System.out.println(uniqueElements);

        Integer max = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
        System.out.println(max);
    }
}
