import java.util.Scanner;

public class performOperations {
    public performOperations() {
        Scanner input = new Scanner(System.in);
        int opera = 0;
        int balance = 1000;
        boolean exit = true;

        while (opera != 5) {
            String answer;
            System.out.println("1-Withdraw cash\n2-Deposit cash\n3-Check balance\n4-Bill Payment\n5-Exit\nSelect the action you want to perform :");
            opera = input.nextInt();
            int amount;
            label59:
            switch (opera) {
                case 1:
                    System.out.println("Please enter the amount of money you would like to withdraw :");
                    amount = input.nextInt();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Current balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 2:
                    System.out.println("Please enter the amount you would like to deposit:");
                    amount = input.nextInt();
                    balance += amount;
                    System.out.println("Current balance: " + balance);
                    break;
                case 3:
                    System.out.println("Current balance: " + balance);
                    break;
                case 4:
                    System.out.println("Please select the bill you would like to pay:\n1-Phone bill\n2-Electricity bill\n3-Water bill\n4-Internet bill\n5-Natural gas bill");
                    String chose;
                    switch (input.next()) {
                        case "1":
                            System.out.println("You owe 100 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 100;
                                System.out.println("Current balance: " + balance);
                            }
                            break label59;
                        case "2":
                            System.out.println("You owe 150 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 150;
                                System.out.println("Current balance: " + balance);
                            }
                            break label59;
                        case "3":
                            System.out.println("You owe 50 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 50;
                                System.out.println("Current balance: " + balance);
                            }
                            break label59;
                        case "4":
                            System.out.println("You owe 200 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 200;
                                System.out.println("Current balance: " + balance);
                            }
                            break label59;
                        case "5":
                            System.out.println("You owe 400 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 400;
                                System.out.println("Current balance: " + balance);
                            }
                            break label59;
                        default:
                            System.out.println("You have made an incorrect selection, please try again!!");
                            break label59;
                    }
                case 5:
                    System.out.println("Exiting the system.");
                    exit = false;
                    break;
                default:
                    System.out.println("You have made an incorrect selection, please try again!!");
            }

            if (exit) {
                System.out.println("Do you want to continue? (Y/N)");
                answer = input.next();
                exit = answer.equalsIgnoreCase("Y");
            }
        }

    }

    public void execute(User user) {
    }
}


