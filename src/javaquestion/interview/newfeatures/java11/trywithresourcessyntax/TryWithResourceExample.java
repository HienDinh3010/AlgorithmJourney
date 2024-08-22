package javaquestion.interview.newfeatures.java11.trywithresourcessyntax;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        try (br) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // This will throw an IOException because the resource is closed.
            br.readLine();
        } catch (IOException e) {
            System.out.println("Resource is already closed: " + e.getMessage());
        }
        System.out.println("Resource after try-with-resources block: " + br);
    }
}
