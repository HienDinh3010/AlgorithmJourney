package javaquestion.interview.newfeatures.java11.writeStringAndReadString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        String file = "java11.txt";
        try {
            Files.writeString(Paths.get(file), "Geekific", StandardOpenOption.CREATE);
            String content = Files.readString(Paths.get(file));
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
