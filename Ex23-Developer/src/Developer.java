public abstract class Developer {
    private String fullName;
    private int id;

    public Developer(){

    };
    public Developer(int id, String fullName){
        super();
        this.fullName = fullName;
        this.id = id;
    }
    public abstract double income();
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }
}
