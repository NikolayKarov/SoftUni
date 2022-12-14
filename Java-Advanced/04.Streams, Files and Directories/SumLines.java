package StreamsFilesAndDirectories_Exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumLines {
    public static void main(String[] args) {

        Path path = Path.of("C:\\Users\\35987\\Desktop\\SoftUni\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");

        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(path);
        } catch (NoSuchFileException e) {
            System.out.println("There is no such file on this path");
        } catch (IOException io) {
            System.out.println("Another error with reading file");
        }
        for (String line : lines) {
            printSumOfAscii(line);

        }
    }

    public static void printSumOfAscii(String line) {
        int sum = 0;
        for (char symbol : line.toCharArray()) {
            sum += symbol;
        }
        System.out.println(sum);
    }
}
