package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class WriteToFile {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35987\\Desktop\\Streams, Files And Directories\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);

        Set<Character> separators = Set.of(',', '.', '!', '?');
        int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("out.txt");

        while (nextByte != -1) {
            char currentSymbol = (char) nextByte;
            if (!separators.contains(currentSymbol)) {
                printStream.print(currentSymbol);
            }
            nextByte = inputStream.read();
        }
    }
}
