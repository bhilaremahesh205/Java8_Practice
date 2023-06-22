package java8.BasicOperaions;

import java.util.Arrays;
import java.util.List;

public class numberCount {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,1,0,1,0,1,0,1,1,1,0,0);
        Integer sum = list.stream().reduce(0,Integer::sum);
        System.out.println("No of 1's" + sum);
        System.out.println("No of 0's"+ sum);

    }
}
