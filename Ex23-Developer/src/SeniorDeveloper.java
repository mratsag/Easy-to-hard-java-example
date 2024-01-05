public class SeniorDeveloper extends RegularDeveloper implements PromotionBehaviour{
    public SeniorDeveloper(int id, String fullName, double monthlySalary) {
        super(id, fullName, monthlySalary);
    }

    @Override
    public double getPromotion() {
        return 1.5*monthlySalary;
    }
    @Override
    public double income() {
        return monthlySalary+getPromotion();
    }
}
