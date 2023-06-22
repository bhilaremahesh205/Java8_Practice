package java8.BasicOperaions;

import java.util.Arrays;
import java.util.List;

public class startAndSameEndString {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("ab","aba","xyx","mno","xyz","pop");
        str.stream().filter(x->x.length() > 0 && x.endsWith(String.valueOf(x.charAt(0)))).forEach(System.out::println);
    }
}
