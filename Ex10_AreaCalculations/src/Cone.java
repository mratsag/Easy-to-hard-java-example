public class Cone extends Shape3D{
    public Cone(double depth, double radius){
        super(depth,radius);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * PI * Math.pow(radius, 2) * depth;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(depth, 2));
        return PI * radius * (radius + slantHeight);
    }

    @Override
    public String toString() {
        return "Cone";
    }
}
