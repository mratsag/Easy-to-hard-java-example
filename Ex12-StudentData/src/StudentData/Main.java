package StudentData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you want to enter :");
        int StudentPiece = input.nextInt();
        Student[] students = new Student[StudentPiece];

        //Create n number of students
        for (int i = 0; i < StudentPiece; i++) {
            students[i] = new Student();
            students[i].StudentNoAssignment();
            students[i].RegisterLesson();
            students[i].paymentMethods();
            students[i].DisplayInfo();
        }

    }
}
