public abstract class Shape3D extends Shape2D{
    double depth;

    public Shape3D(double depth, double height, double width){
        super(height, width);
        this.depth = depth;
    }

    public Shape3D(double depth, double radius){
        super(radius);
        this.depth = depth;
    }

    public abstract double getVolume();

    @Override
    public String toString() {
        return "Shape3D";
    }
}
