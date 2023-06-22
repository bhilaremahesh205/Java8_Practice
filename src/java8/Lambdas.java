package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambdas {
  public static void main(String[] args) {
       /*   Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));
    }*/

      List<Integer> number = Arrays.asList(2,3,4,5);
      List<Integer> square = number.stream().map(x -> x*x).
              collect(Collectors.toList());
      System.out.println(square);

      // create a list of String
      List<String> names = Arrays.asList("Reflection","Collection","Stream");

      // demonstration of filter method
      List<String> result = names.stream().filter(s->s.startsWith("S")).
              collect(Collectors.toList());
      System.out.println(result);
      // demonstration of sorted method
      List<String> show = names.stream().sorted().collect(Collectors.toList());
      System.out.println(show);
      // create a list of integers
      List<Integer> numbers = Arrays.asList(2,3,4,5,2);
      // collect method returns a set
      Set<Integer> squareSet =
              numbers.stream().map(x->x*x).collect(Collectors.toSet());
      System.out.println(squareSet);
      // demonstration of forEach method
      number.stream().map(x->x*x).forEach(y->System.out.println(y));
      // demonstration of reduce method
      int even =number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
      System.out.println(even);

      System.out.println("******----------***********--------");

      String separator = ",";
      Arrays.asList( "a", "b", "d" ).forEach(
              ( String e ) -> System.out.print( e + separator ) );

  }
}
