public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle(){

    };
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
