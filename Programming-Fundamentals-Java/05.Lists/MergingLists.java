package Lists_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<Integer> resultList = new ArrayList<>();

        int smallerList = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < smallerList; i++) {
            int numberOfFirstList = firstList.get(i);
            int numberOfSecondList = secondList.get(i);

            resultList.add(numberOfFirstList);
            resultList.add(numberOfSecondList);
        }

        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(smallerList, firstList.size()));
        } else if (secondList.size() > firstList.size()) {
            resultList.addAll(secondList.subList(smallerList, secondList.size()));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
