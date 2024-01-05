public class Circle implements Comparable<Circle>{
    private double Pi=3.14;
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double calculateArea(){
        return radius*radius*Pi;
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }
    public String toString() {
        return "Renk: " + color + ", Yarıçap: " + radius + ", Alan: " + calculateArea();
    }
}
