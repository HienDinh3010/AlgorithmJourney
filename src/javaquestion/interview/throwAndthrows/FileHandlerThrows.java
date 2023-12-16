package javaquestion.interview.throwAndthrows;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlerThrows {
    public static void writeToFile() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hien.txt"));
        bufferedWriter.write("I may not become a great programmer but I can be a better programmer today");
        bufferedWriter.close();
    }

    public static void main(String[] args) {
        try {
            writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
