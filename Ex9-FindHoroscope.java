import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum tarihiniz ay olarak (1 - 13) :");
        int month = scanner.nextInt();

        System.out.println("Doğum tarihiniz gün olarak :");
        int day = scanner.nextInt();


        if (month > 0 && month < 13 && day < 32 && day > 0) {
            if (month == 1) {
                if (day < 21) {
                    System.out.println("Burcunuz oğlak.");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            }

            if (month == 2) {
                if (day <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            }

            if (month == 3) {
                if (day <= 20) {
                    System.out.println("Burcunuzu Balık");
                } else {
                    System.out.println("Burcunuzu Koç");
                }
            }

            if (month == 4) {
                if (day <= 20) {
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            }

            if (month == 5) {
                if (day <= 21) {
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            }

            if (month == 6) {
                if (day <= 22) {
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            }

            if (month == 7) {
                if (day <= 22){
                    System.out.println("Burcunuz Yengeç");
                }else {
                    System.out.println("Burcunuz Aslan");
                }
            }

            if (month == 8){
                if (day <= 22){
                    System.out.println("Burcunuz Aslan");
                }else {
                    System.out.println("Burcunuz Başak");
                }
            }

            if (month == 9){
                if (day<=22){
                    System.out.println("Burcunuz Başak");
                }else {
                    System.out.println("Burcunuz Terazi");
                }
            }

            if (month == 10){
                if (day<=22){
                    System.out.println("Burcunuz Terazi");
                }else {
                    System.out.println("Burcunuz Akrep");
                }
            }

            if (month == 11){
                if (day<=21){
                    System.out.println("Burcunuz Akrep");
                }else {
                    System.out.println("Burcunuz Yay");
                }
            }

            if (month == 12){
                if (day<=21){
                    System.out.println("Burcunuz Yay");
                }else {
                    System.out.println("Burcunuz Oğlak");
                }
            }


        } else {
            System.out.println("Yanlış değer girdiniz, lütfen tekrar deneyiniz !!!");
        }


    }
}
