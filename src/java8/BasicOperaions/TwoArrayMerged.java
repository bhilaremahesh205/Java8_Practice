package java8.BasicOperaions;

import java8.Operations_Demo.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.concat;
import static java8.Operations_Demo.Stream.*;

public class TwoArrayMerged {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

        //Stream fullList = Stream.concat(list1.stream(), list2.stream());
        java.util.stream.Stream fullList= java.util.stream.Stream.concat(list1.stream(),list2.stream());

        List<Integer> allElements = (List<Integer>) fullList.collect(Collectors.toList());
        System.out.println(allElements);

        Set<Integer> uniqueElements = allElements.stream().collect(Collectors.toSet());
        System.out.println("Unique elements");
        System.out.println(uniqueElements);

        Integer max = uniqueElements.stream().max((x1, x2) -> x1 - x2).get();
        System.out.println(max);
        String joinedString = String.join(" | ", "Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println(joinedString);


        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        List<String> joinedString1 = listOfStrings.stream().collect(Collectors.toList());

        System.out.println(joinedString1);

    }
}
