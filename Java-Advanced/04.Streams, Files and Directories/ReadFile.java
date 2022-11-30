package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "C:\\Users\\35987\\Desktop\\Streams, Files And Directories\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (InputStream inputStream = new FileInputStream(path)) {
            int nextByte = inputStream.read();
            while (nextByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(nextByte));

                nextByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
