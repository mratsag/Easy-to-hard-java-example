public class Square extends Shape2D {

    public Square(double width) {
        super(width, width);
    }

    @Override
    public String toString() {
        return "Square";
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
