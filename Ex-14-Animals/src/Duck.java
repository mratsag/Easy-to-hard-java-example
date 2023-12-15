public class Duck extends Animal implements Moveable, Fiyable, Swimmable{

    public Duck(String name){
        super.setName(name);
    }

    @Override
    public void move() {
        System.out.println("Duck walks.");
    }

    @Override
    public void fly() {
        System.out.println("Duck flies.");
    }

    @Override
    public void swim() {
        System.out.println("Duck swims.");
    }
}
