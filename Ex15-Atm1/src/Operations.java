import java.util.Scanner;

public class Operations {
    public Operations() {
        Scanner input = new Scanner(System.in);
        int opera = 0;
        int amount;
        int balance = 1000;
        boolean exit = true;

        while (opera != 5) {
            System.out.println("1-Withdraw cash\n"
                    + "2-Deposit cash\n"
                    + "3-Check balance\n"
                    + "4-Bill Payment\n"
                    + "5-Exit\n"
                    + "Select the action you want to perform :");
            opera = input.nextInt();

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
                    String select;
                    System.out.println("Please select the bill you would like to pay:\n"
                            + "1-Phone bill\n"
                            + "2-Electricity bill\n"
                            + "3-Water bill\n"
                            + "4-Internet bill\n"
                            + "5-Natural gas bill");
                    select = input.next();

                    switch (select) {
                        case "1":
                            System.out.println("You owe 100 dollars, do you want to pay? (E/H)");
                            String chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 100;
                                System.out.println("Current balance: " + balance);
                            }
                            break;
                        case "2":
                            System.out.println("You owe 150 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 150;
                                System.out.println("Current balance: " + balance);
                            }
                            break;
                        case "3":
                            System.out.println("You owe 50 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 50;
                                System.out.println("Current balance: " + balance);
                            }
                            break;
                        case "4":
                            System.out.println("You owe 200 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 200;
                                System.out.println("Current balance: " + balance);
                            }
                            break;
                        case "5":
                            System.out.println("You owe 400 dollars, do you want to pay? (E/H)");
                            chose = input.next();
                            if (chose.equalsIgnoreCase("e")) {
                                balance -= 400;
                                System.out.println("Current balance: " + balance);
                            }
                            break;
                        default:
                            System.out.println("You have made an incorrect selection, please try again!!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    exit = false;
                    break;
                default:
                    System.out.println("You have made an incorrect selection, please try again!!");
            }
            if (exit){
                System.out.println("Do you want to continue? (Y/N)");
                String answer = input.next();
                exit = answer.equalsIgnoreCase("Y");
            }
        }
    }
}