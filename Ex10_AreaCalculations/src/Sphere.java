public class Sphere extends Shape3D{
    public Sphere(double depth, double radius){
        super(depth,radius);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

    @Override
    public double getArea() {
        return 4 * PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere";
    }
}
