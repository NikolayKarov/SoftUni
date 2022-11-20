package SetsAndMapsAdvanced_Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();
        String guest = scanner.nextLine();

        while (!guest.equals("PARTY")) {
            if (Character.isDigit(guest.charAt(0))) {
                vip.add(guest);
            } else {
                regular.add(guest);
            }
            guest = scanner.nextLine();
        }

        while (!guest.equals("END")) {
            if (vip.contains(guest)) {
                vip.remove(guest);
            } else {
                regular.remove(guest);
            }
            guest = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String vipGuests : vip) {
            System.out.println(vipGuests);
        }

        for (String regularGuests : regular) {
            System.out.println(regularGuests);
        }
    }
}
