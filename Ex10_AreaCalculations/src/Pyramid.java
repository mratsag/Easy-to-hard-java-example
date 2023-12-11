public class Pyramid extends Shape3D{

    public Pyramid (double depth, int height, int width){
        super(depth, height, width);
    }
    @Override
    public double getVolume() {
        return (1.0 / 3.0) * depth * height * width;
    }

    @Override
    public double getArea() {
        return width * height + height * Math.pow(Math.pow(width / 2, 2) + height * height, 0.5) + width * Math.pow(Math.pow((height / 2), 2) + height * height, 0.5);
    }

    @Override
    public String toString() {
        return "Pyramid";
    }
}
