import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List<Circle> circleList = new LinkedList<>();

        Circle c1 = new Circle(3.0, "Red");
        Circle c2 = new Circle(5.0, "Blue");
        Circle c3 = new Circle(2.0, "Green");

        circleList.add(c1);
        circleList.add(c2);
        circleList.add(c3);

        Collections.sort(circleList);

        for (Circle circle : circleList) {
            System.out.println(circle);
        }
    }
}