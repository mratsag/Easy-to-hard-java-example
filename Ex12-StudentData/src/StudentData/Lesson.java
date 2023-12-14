package StudentData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lesson {
    private Scanner input = new Scanner(System.in);
    private List<String> selectedLessons = new ArrayList<>();
    private int number;
    private int totalDebt = 0;
    private final int lessonDebt = 650;

    public void registerLesson() {
        System.out.println("Welcome to the course selection screen. Lessons\n" +
                "1-\"101\" History\n" +
                "2-\"202 \"Math\n" +
                "3-\"303 \"English\n" +
                "4-\"404 \"Chemistry\n" +
                "5-\"505 \"Turkish\n");
        System.out.println("How many lessons will you take : ");
        number = input.nextInt();
        input.nextLine(); // Consume the newline character

        for (int i = 0; i < number; i++) {
            boolean validCourseCode = false;

            while (!validCourseCode) {
                System.out.println("Enter the course code you want to select :");
                String lessonCode = input.nextLine();

                switch (lessonCode) {
                    case "101":
                        selectedLessons.add("History");
                        System.out.println("History lesson added.");
                        totalDebt += lessonDebt;
                        validCourseCode = true;
                        break;
                    case "202":
                        selectedLessons.add("Math");
                        System.out.println("Math lesson added.");
                        totalDebt += lessonDebt;
                        validCourseCode = true;
                        break;
                    case "303":
                        selectedLessons.add("English");
                        System.out.println("English lesson added.");
                        totalDebt += lessonDebt;
                        validCourseCode = true;
                        break;
                    case "404":
                        selectedLessons.add("Chemistry");
                        System.out.println("Chemistry lesson added.");
                        totalDebt += lessonDebt;
                        validCourseCode = true;
                        break;
                    case "505":
                        selectedLessons.add("Turkish");
                        System.out.println("Turkish lesson added.");
                        totalDebt += lessonDebt;
                        validCourseCode = true;
                        break;
                    default:
                        System.out.println("You entered the wrong course code!! Please try again.");
                        break;
                }
            }
        }

        // Print the selected lessons
        System.out.println("Selected Lessons:");
        for (String lesson : selectedLessons) {
            System.out.println(lesson);
        }

        // Print the total debt
        System.out.println("Total Debt: " + totalDebt + " TL");
    }

    public List<String> getSelectedLessons() {
        return selectedLessons;
    }

    public int getTotalDebt() {
        return totalDebt;
    }
    public void pay(int amount) {
        totalDebt -= amount;
        System.out.println("Payment Successful. Remaining Debt: " + totalDebt + " TL");
    }


}
