package java11;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileDemo {
    public static void main(String[] args) {
        //var uri = "C:\\Users\\Mahesh Bhilare\\Desktop\\java11\\java11.txt";
        var uri = "src/java11.txt";
        try {
            Files.writeString(Path.of(uri), " mahesh  ", StandardOpenOption.APPEND);
            String data = Files.readString(Path.of(uri));
            System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
