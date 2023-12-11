public class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(height , color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height= height;
    }
    @Override
    public String toString() {
        return "Cylinder [height=" + height + ", " + super.toString() + "]";
    }

    public double getVolume() {
        return getArea() * height;
    }
}
