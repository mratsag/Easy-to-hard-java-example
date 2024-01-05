public class RegularDeveloper extends Developer{
    protected double monthlySalary;

    public RegularDeveloper(int id, String fullName, double monthlySalary){
        super(id, fullName);
        this.monthlySalary = monthlySalary;
    }
    @Override
    public double income() {
        return monthlySalary;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
