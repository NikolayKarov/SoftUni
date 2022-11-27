package StreamsFilesAndDirectories_Lab;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayDeque;

public class NestedFolders {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\35987\\Desktop\\Streams, Files And Directories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        ArrayDeque<File> files = new ArrayDeque<>();

        files.offer(file);

        int count = 0;

        while (!files.isEmpty()) {
            File currFolder = files.poll();
            File[] currFolderFiles = currFolder.listFiles();
            if (currFolderFiles != null) {
                for (File f : currFolderFiles) {
                    if (f.isDirectory()) {
                        files.offer(f);

                    }
                }
            }
            System.out.println(currFolder.getName());
            count++;
        }
        System.out.println(count + " folders");
    }
}
