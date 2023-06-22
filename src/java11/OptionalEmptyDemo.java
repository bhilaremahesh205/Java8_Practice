package java11;

import java.util.Optional;

public class OptionalEmptyDemo {
    public static void main(String[] args) {
        //Optional o = Optional.of(" mahesh ");

        Optional o = Optional.of(" ");
        o = o.empty();
        o.ifPresent(s -> System.out.println(s));
        System.out.println(o.isEmpty());
    }
}
