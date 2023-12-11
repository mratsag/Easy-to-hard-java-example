public abstract class Shape2D {
    final double PI = 3.14159;
    double height;
    double radius;
    double width;

    public Shape2D(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Shape2D(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();

    public String toString() {
        return "Shape2D";
    }

}
