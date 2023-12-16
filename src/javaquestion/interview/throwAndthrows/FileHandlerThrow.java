package javaquestion.interview.throwAndthrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerThrow {
    public static void writeToFile() {
        BufferedWriter bufferedWriter;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufferedWriter.write("Hi I am Hien");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void sillyMethod() {
        System.out.println("Hi");
        throw new RuntimeException("Just thow it");
    }

    public static void main(String[] args) {
        //writeToFile();
        sillyMethod();
    }
}
