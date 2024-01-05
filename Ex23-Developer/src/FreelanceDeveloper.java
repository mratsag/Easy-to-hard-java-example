public class FreelanceDeveloper extends Developer implements BonusSalaryBehaviour{
    private int hours;
    private int unitPrice;

    public FreelanceDeveloper(int id,String fullName, int hours){
        super(id, fullName);
        this.hours = hours;
    }
    @Override
    public double getBonusSalary() {
        return hours*1.5;
    }

    @Override
    public double income() {
        return hours*unitPrice+getBonusSalary();
    }

    public void setUnitPrice(int i) {
    }

    public String getHours() {
        return null;
    }

    public String getUnitPrice() {
        return null;
    }
}
