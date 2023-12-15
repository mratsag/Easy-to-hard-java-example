public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat("ELİSE");
        System.out.println("Cat name :"+myCat.getName());
        myCat.swim();
        System.out.println("--------------------\n\n");


        Duck myDuck = new Duck("john");
        System.out.println("Duck name : "+myDuck.getName());
        myDuck.fly();
        myDuck.swim();
        myDuck.move();
        System.out.println("--------------------\n\n");

        Eagle myEagle = new Eagle("Cris");
        System.out.println("Eagle name : "+myEagle.getName());
        myEagle.fly();
    }
}