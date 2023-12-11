public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------2D Shapes---------");
        // 2D Shapes
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle: " + circle.toString());

        System.out.println("-------------------------");

        Square square = new Square(4.0);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square: " + square.toString());

        System.out.println("-------------------------");

        Rectangle rectangle = new Rectangle(3.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle: " + rectangle.toString());

        System.out.println("-------------------------");

        System.out.println("3D Shapes");
        // 3D Shapes
        Cylinder cylinder = new Cylinder(4.0, 7.0);
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Cylinder Area: " + cylinder.getArea());
        System.out.println("Cylinder: " + cylinder.toString());

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        Sphere sphere = new Sphere((int) 5.0, 10.0);
        System.out.println("Sphere Volume: " + sphere.getVolume());
        System.out.println("Sphere Area: " + sphere.getArea());
        System.out.println("Sphere: " + sphere.toString());

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        Pyramid pyramid = new Pyramid((int) 8.0, 4, 6);
        System.out.println("Pyramid Volume: " + pyramid.getVolume());
        System.out.println("Pyramid Area: " + pyramid.getArea());
        System.out.println("Pyramid: " + pyramid.toString());
    }
}
