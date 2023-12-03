public class Customer {

    private int age;
    private int km;
    private int trip;

    public Customer(int age, int km, int trip) {
        this.age = age;
        this.km = km;
        this.trip = trip;
    }

    public int calculatePrice() {
        if (this.age > 0 && this.km > 0 && (this.trip == 1 || this.trip == 2)) {
            int basePrice;
            int discount;
            if (trip==2){
                km = km*2;
                basePrice= this.km * 10; // 1 km başına 0.10 birim fiyat alındığını varsayalım
                discount = 0;
            }
            else {
                basePrice= (int) (this.km * 0.1); // 1 km başına 0.10 birim fiyat alındığını varsayalım
                discount = 0;
            }

            if (this.age < 12) {
                discount = 50; // 12 yaş altı için %50 indirim
            } else if (this.age > 12 && this.age < 24) {
                discount = 10; // 12-24 yaş arası için %10 indirim
            } else if (this.age>=65) {
                discount = 30; //65 yaş ve üstü için %30 indirim
            } else if (trip == 2) {
                discount = 20; //gidiş dönüş seçenlere %20 indirim
            }

            // İndirimli fiyatı hesapla
            int discountedPrice = basePrice - (basePrice * discount / 100);
            return discountedPrice;
        } else {
            System.out.println("Geçersiz giriş. Lütfen doğru değerleri girin.");
            return -1;
        }
    }
}