package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("course start")) {
            String[] tokens = commands.split(":");
            String command = tokens[0];
            String lessonTitle = tokens[1];

            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;

                case "Remove":
                    if (schedule.contains(lessonTitle)) {
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if (schedule.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {
                        schedule.remove(indexLesson + 1);
                    }
                    break;

                case "Swap":
                    String secondLessonTitle = commands.split(":")[2];
                    if (schedule.contains(lessonTitle) && schedule.contains(secondLessonTitle)) {
                        int firstLessonIndex = schedule.indexOf(lessonTitle);
                        int secondLessonIndex = schedule.indexOf(secondLessonTitle);
                        schedule.set(firstLessonIndex, secondLessonTitle);
                        schedule.set(secondLessonIndex, lessonTitle);

                        String exerciseOne = lessonTitle + "-Exercise";
                        String exerciseTwo = secondLessonTitle + "-Exercise";
                        if (schedule.contains(exerciseOne)) {
                            schedule.remove(schedule.indexOf(exerciseOne));
                            schedule.add(schedule.indexOf(lessonTitle + 1), exerciseOne);
                        }
                        if (schedule.contains(exerciseTwo)) {
                            schedule.remove(schedule.indexOf(exerciseTwo));
                            schedule.add(schedule.indexOf(secondLessonTitle) + 1, exerciseTwo);
                        }
                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = schedule.indexOf(lessonTitle);

                    if (schedule.contains(lessonTitle)) {
                        if (indexLessonTitle == schedule.size() - 1) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }
                    break;
            }
            commands = scanner.nextLine();
        }
        printList(schedule);

    }


    private static void printList(List<String> elements) {
        int count = 1;
        for (String element : elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
