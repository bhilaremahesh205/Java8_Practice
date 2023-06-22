package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> evenList = list.stream().filter(x -> x%2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        System.out.println("*************************************************************************************");

        List<String> lists = List.of("A", "B" ,"C" ,"D");
        lists.forEach(ref -> System.out.println(ref));

        System.out.println("******************************************************************************************");

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date is: " + currentDate);
        // Get the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time is : " + currentTime);
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date & Time is : " + currentDateTime);

        System.out.println("***********************************************************************************");

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("Current Zone is : " + currentZone);

    }
}
