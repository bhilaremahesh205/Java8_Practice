package java8.BasicOperaions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class UpparCase {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("Usa","Japan","Franch","Itali","India","Canada");
        System.out.println("before uppercase" + countries);
        String collectUppercase= countries.stream().map(x-> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(collectUppercase);

    }
}
