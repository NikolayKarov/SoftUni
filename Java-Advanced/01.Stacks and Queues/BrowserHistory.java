package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        String command = scanner.nextLine();

        String currentURL = "";

        while (!command.equals("Home")) {

            if (command.equals("back")) {
                if (browserHistory.isEmpty()) {
                    System.out.println("no previous URLs");
                    command = scanner.nextLine();
                    continue;
                }
                String prevURL = browserHistory.pop();
                currentURL = prevURL;
            } else {
                if (!currentURL.equals("")) {
                    browserHistory.push(currentURL);
                }
                currentURL = command;
            }
            System.out.println(currentURL);
            command = scanner.nextLine();
        }
    }
}
