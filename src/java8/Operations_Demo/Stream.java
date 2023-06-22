package java8.Operations_Demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,0,2,3,4,5,6);
        //list.stream().map( x-> x * 2).forEach(System.out::println);
        list.stream().filter(x -> x >4).forEach(System.out::println);

        List<Integer> integerList= list.stream().sorted().collect(Collectors.toList());
        System.out.println(integerList);

        int max = list.stream().max((x,y)-> x - y).get();
        System.out.println(max);

        int minx = list.stream().min((x,y)-> x - y).get();
        System.out.println(minx);

        Long listData = list.stream().count();
        System.out.println(listData);

        //

        List<String> lst = Arrays.asList("addfdf,bfd,sdbb,efefeff,gajs,wfd,gfdf,dgdfg,qrg,yergr,ureer");
        List<String> list1 = lst.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list1);







    }

}
