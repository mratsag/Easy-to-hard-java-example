package StudentData;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {
    Scanner input = new Scanner(System.in);
    private Lesson lesson = new Lesson();
    private String name;
    private String surname;
    private String year;
    private String studentNo;

    private static int id = 1000;

    public Student() {
        System.out.println("Enter your name :");
        this.name = input.nextLine();

        System.out.println("Enter your surname :");
        this.surname = input.nextLine();

        System.out.println("which year did you register :");
        this.year = input.nextLine();

    }


    //student number assignment
    public void StudentNoAssignment() {
        this.studentNo = year + id;
        id++;
        System.out.println("Student Number :" + studentNo);
    }

    //register the lesson
    public void RegisterLesson() {
        lesson.registerLesson();
    }


    public void DisplayInfo() {
        System.out.println("----------------------\n");
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Student Number : " + studentNo);
        System.out.println("Total Debt : " + lesson.getTotalDebt());
        System.out.println("Lessons : " + lesson.getSelectedLessons());
    }


    public void paymentMethods() {
        int pay;
        System.out.println("How much will you pay :");
        pay = input.nextInt();
        System.out.println("Amount payable : " + pay);
        lesson.pay(pay);
        lesson.getTotalDebt();
    }
}
