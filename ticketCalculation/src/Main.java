import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınızı girin:");
        int age = scanner.nextInt();
        System.out.println("Kat edilen mesafeyi (km cinsinden) girin:");
        int km = scanner.nextInt();
        System.out.println("Yolculuk tipini seçin (1-tek yönlü veya 2-gidiş dönüş):");
        int trip = scanner.nextInt();

        Customer customer = new Customer(age, km, trip);
        int price = customer.calculatePrice();

        if (price != -1) {
            System.out.println("Hesaplanan fiyat: $" + price);
        }
    }
}