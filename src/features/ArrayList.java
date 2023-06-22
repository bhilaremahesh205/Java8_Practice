package features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList<S> {
    public static void main(String args[]){
        List<String> list = Arrays.asList("pune","mumbai","delhi","gujrat","dubai","pune","mumbai");
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
        //System.out.println(list + "list" + list + "list" + list);

       list = list
                .stream()
                //.filter(p -> p.equalsIgnoreCase("mumbai"))
               //.filter(p -> p.count("mumbai"))
             //  .distinct()
               //.count()
                .collect(Collectors.toList()

                );
        System.out.println("count" + list.stream().count());
        System.out.println("list"+list);

    }

}
