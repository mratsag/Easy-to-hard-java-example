public class Book implements Comparable<Book>{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.price = price;
        this.name = name;
    }

    public double totalPrice(){
        return price+(8/100)*price;
    }

    @Override
    public int compareTo(Book other) {
        return Double.compare(this.totalPrice(),other.totalPrice());
    }
    public String toString() {
        return "Name: " + name + ", Total Price: " + totalPrice();
    }
}
