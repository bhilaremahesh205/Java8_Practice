package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacter {
    public static void main(String[] args) {
/*

        String str = "Mahesh Ananda Bhilare";
        Map<Character, Integer> dupMapKey = new HashMap<>();
        char[] charArr = str.toCharArray();

        for(char keys : charArr){
            if (Character.isAlphabetic(keys)){
                if (dupMapKey.containsKey(keys)){
                    dupMapKey.put(keys, dupMapKey.get(keys)+1);
                }
                else {
                    dupMapKey.put(keys, 1);
                }
            }

        }
        System.out.println(dupMapKey);
        dupMapKey.entrySet().removeIf(i -> i.getValue()==1);
        System.out.println(dupMapKey);
*/



/*
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .filter(x-> Collections.frequency(names, x)>1)
                .collect(Collectors.groupingBy
                        (Function.identity(), Collectors.counting()));
        System.out.println(namesCount);
*/

      /*  List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names
                .stream()
                .collect(
                        Collectors.groupingBy(
                                Function.identity()
                                , Collectors.counting()
                        ));
        System.out.println(namesCount);
*/


       List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8);
       IntSummaryStatistics stats = number.stream()
                                    .mapToInt(x -> x)
                                    .summaryStatistics();

        System.out.println("lower no" + stats.getMin());
        System.out.println("highest no" + stats.getMax());
        System.out.println("average no" + stats.getAverage());
        System.out.println("sum of no"+ stats.getSum());










        /*String str = "mahesh bhilare";
        Map<Character, Integer> dupCharMap = new HashMap<>();
        char[] charArr = str.toCharArray();

        for (char key : charArr) {
            if (Character.isAlphabetic(key)) {
                if (dupCharMap.containsKey(key)) {
                    dupCharMap.put(key, dupCharMap.get(key) + 1);
                } else {
                    dupCharMap.put(key, 1);
                }
            }
        }
        System.out.println(dupCharMap);*/
    }
}
