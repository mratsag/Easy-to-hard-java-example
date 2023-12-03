import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int degrees;
        System.out.println("what is the weather today? (Specify in degrees) :");
        degrees = scan.nextInt();

        if (degrees<5){
            System.out.println("Today the weather is perfect for skiing. Air temperature : "+degrees);
        } else if (degrees<=15 && degrees>5) {
            System.out.println("Today the weather is perfect for going to the theater. Air temperature : "+degrees);
        } else if (degrees<=25 && degrees>15) {
            System.out.println("Today the weather is perfect for barbecues. Air temperature : "+degrees);
        } else if (degrees>25) {
            System.out.println("Today the weather is perfect for swimming. Air temperature : "+degrees);
        }else {
            throw new IllegalStateException("Unexpected value: " +degrees);
        }
    }
}
