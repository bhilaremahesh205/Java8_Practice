package java11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringEnhancement {
    public static void main(String[] args) {
        String a ="asdas\n"+ "dasa \n" + "dds \n";
        String str = "  Mahesh ";
        String str2= "MAHESH";
        String str3 = " mahesh ";
        String str4 = "MAHESH";
        a.lines().forEach(System.out::println);
        Stream<String> st = a.lines();
        List<String> list = st.collect(Collectors.toList());
        System.out.println(list);

        System.out.println(str.stripTrailing());
        System.out.println(str.strip());
        System.out.println(str.toUpperCase());
        System.out.println(str.getBytes());
        System.out.println(str.toLowerCase());

        System.out.println(str3.repeat(5));

        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        String multilineString = "Baeldung helps \n \n developers \n explore Java.";
        List<String> lines = multilineString.lines()
                .filter(line -> !line.isBlank())
                .map(String::strip)
                .collect(Collectors.toList());
      //  assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");
    }
}
