import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Operations {
    private List<User> users;
    private Scanner input;
    private int userIdCounter;

    public Operations(){
        this.users = new ArrayList<>();
        this.input = new Scanner(System.in);
        this.userIdCounter = 1;
    }
    void run() {
        int opera = 0;
        boolean exit = true;

        while (opera != 5) {
            String answer;
            System.out.println("1-Login\n2-Sign Up\n3-Exit");
            opera = input.nextInt();

            switch (opera) {
                case 1:
                    System.out.println("Enter your username:");
                    String username = input.next();
                    System.out.println("Enter your password:");
                    String password = input.next();

                    // Kullanıcı doğrulama işlemleri
                    User user = authenticateUser(username, password);

                    if (user != null) {
                        System.out.println("Login successful! Welcome, " + user.getUsername() + "!");
                        performOperations(user);
                    } else {
                        System.out.println("Login failed. Invalid username or password.");
                    }
                    break;
                case 2:
                    signUp();
                    break;
                case 3:
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

    private void login() {
        System.out.println("Enter your username:");
        String username = input.next();
        System.out.println("Enter your password:");
        String password = input.next();

        // Kullanıcı doğrulama işlemleri
        User user = authenticateUser(username, password);

        if (user != null) {
            System.out.println("Login successful! Welcome, " + user.getUsername() + "!");
            performOperations(user);
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    private void signUp() {
        System.out.println("Enter a username:");
        String username = input.next();
        System.out.println("Enter a password:");
        String password = input.next();

        // Kullanıcı oluşturma işlemleri
        User newUser = new User(username, password, userIdCounter++);
        users.add(newUser);

        System.out.println("User created successfully! You can now log in.");
    }
    private User authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    private void performOperations(User user) {
        new performOperations().execute(user);
    }

}
