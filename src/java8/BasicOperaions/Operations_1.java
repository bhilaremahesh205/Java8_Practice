package java8.BasicOperaions;

import java.util.Comparator;
import java.util.stream.Stream;

public class Operations_1 {
    public static void main(String[] args) {
       // System.out.println(test());


        String str = "abcde";
        System.out.println(str.substring(1, 3));
        System.out.println(str.substring(0, 4));


        Integer highest = Stream.of(1, 2, 3, 77, 6, 5).max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(highest + " "+"highest number");

        Integer lowest = Stream.of(1, 2, 3, 77, 6, 5).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println(lowest + " " +"lowest number");
    }

   /* private static int test() {
        try {
            return 10;
        } catch(Exception e) {
            return 20;
        }
        return 30;
    }

    private static int test() {
        try {
            return 10;
        } catch(Exception e) {
            return 20;
        } finally {
            return 30;
        }
    }*/

}
