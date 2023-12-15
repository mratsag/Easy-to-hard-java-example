public class Eagle extends Animal implements Fiyable{
    public Eagle(String name){
        super.setName(name);
    }
    @Override
    public void fly() {
        System.out.println("Eagle flies.");
    }
}
