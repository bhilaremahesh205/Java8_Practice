package java8.BasicOperaions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayAdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Integer sum = list.stream().reduce(0,Integer::sum);
        List<Integer> integerList = list.stream().map(x-> x + sum).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
