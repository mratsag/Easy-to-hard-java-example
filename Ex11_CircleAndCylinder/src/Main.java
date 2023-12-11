public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "blue");
        System.out.println("-------------CIRCLE-------------");
        System.out.println("--------------------------------");
        System.out.println("Circle: " + circle.toString());
        System.out.printf("Circle Area: %.3f\n", circle.getArea());

        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        Cylinder cylinder = new Cylinder(3.0, 4.0, "green");
        System.out.println("-------------CYLINDER-----------");
        System.out.println("--------------------------------");
        System.out.println("Cylinder: " + cylinder.toString());
        System.out.printf("Cylinder Volume: %.3f\n", cylinder.getVolume());
    }
}
