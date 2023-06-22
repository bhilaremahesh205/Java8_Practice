package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class AllOperations {
    public static void main(String[] args) throws IOException {
        Set<String> strings = Set.of("mahesh","srujan","sunny","rohit");
        strings.forEach(e-> System.out.println(e));
        System.out.println("*****************************");

        Map<Integer,String> map = Map.of(1,"mahesh",2,"srujan",3,"sunny",4,"rohit");
        strings.forEach(e-> System.out.println(e));
        System.out.println("*****************************");

        Path path = Files.writeString(Files.createTempFile("sample", ".txt"), "Look ma! I'm a writer!");
        //Reading contents from sample.txt
        System.out.println(Files.readString(path));
        System.out.println("*****************************");

        String message = "Hello\nI\nam\nhappy\nto\nmeet\nyou";
        //Java 11 - lines method on String
        message.lines().forEach(line -> System.out.println(line));
        System.out.println("*****************************");
        Optional<String> supervisorName = Optional.of("mahesh");
        if (!supervisorName.isEmpty())System.out.println("no");
        if (supervisorName.isEmpty())System.out.println("yes");

        System.out.println("*****************************");
        var country = "";
        var role = "Developer";

        //Java 11
        if (country.isBlank()) System.out.println("Java 11 says the value is blank!");
        if (!role.isBlank()) System.out.println("Java 11 says we have a value."); //NOTE: compared to StringUtils, no isNotBlank

    }
}
