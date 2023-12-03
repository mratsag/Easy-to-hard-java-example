import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        double total;

        System.out.println("Enter the number 1 :");
        number1 = scanner.nextInt();
        System.out.println("Enter the number 2 :");
        number2 = scanner.nextInt();
        System.out.println("Enter the operation (+ ,- ,* , /)");
        String symbol = scanner.next();
        switch (symbol) {
            case "+":
                total = number1 + number2;
                System.out.println(number1 + "+" + number2 + "=" + total);
                break;
            case "-":
                total = number1 - number2;
                System.out.println(number1 + "-" + number2 + "=" + total);
                break;
            case "*":
                total = number1 * number2;
                System.out.println(number1 + "*" + number2 + "=" + total);
                break;
            case "/":
                total = (double) number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + total);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + symbol);
        }

    }
}
