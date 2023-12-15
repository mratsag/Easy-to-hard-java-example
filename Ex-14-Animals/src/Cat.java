public class Cat extends Animal implements Swimmable{

    @Override
    public void swim() {
        System.out.println("Cat does not swim.");
    }

    public Cat(String name){
        super.setName(name);
    }
}
