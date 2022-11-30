package StreamsFilesAndDirectories_Lab;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35987\\Desktop\\Streams, Files And Directories\\04. " +
                "Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);
        int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("copy-bites-out.txt");

        while (nextByte != -1) {
            if (nextByte == ' ') {
                printStream.print((char) nextByte);
            } else if (nextByte == 10) {
                printStream.println();
            } else {
                printStream.print(nextByte);
            }
            nextByte = inputStream.read();
        }
    }
}
