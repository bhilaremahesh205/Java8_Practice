package java8.CodeSnippet;

import java.util.Optional;

public class Opional {
    public static void main(String[] args) {
        String str = "";
        Optional<String> opt = Optional.ofNullable(str);
        if (opt.isPresent()) {
            System.out.println(opt+"optional present");
        }
        else {
            System.out.println("opt No qualifying element");
        }

    }
}
