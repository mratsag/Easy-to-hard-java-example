public class Main {
    public static void main(String[] args) {
        // RegularDeveloper
        RegularDeveloper regularDeveloper = new RegularDeveloper(1, "John Doe", 5000.0);

        // Bilgileri yazdırma
        System.out.println("Regular Developer:");
        System.out.println("ID: " + regularDeveloper.getId());
        System.out.println("Full Name: " + regularDeveloper.getFullName());
        System.out.println("Monthly Salary: " + regularDeveloper.getMonthlySalary());
        System.out.println("Income: " + regularDeveloper.income());
        System.out.println();

        // FreelanceDeveloper
        FreelanceDeveloper freelanceDeveloper = new FreelanceDeveloper(2, "Jane Doe", 20);
        freelanceDeveloper.setUnitPrice(100);

        // Bilgileri yazdırma
        System.out.println("Freelance Developer:");
        System.out.println("ID: " + freelanceDeveloper.getId());
        System.out.println("Full Name: " + freelanceDeveloper.getFullName());
        System.out.println("Hours: " + freelanceDeveloper.getHours());
        System.out.println("Unit Price: " + freelanceDeveloper.getUnitPrice());
        System.out.println("Bonus Salary: " + freelanceDeveloper.getBonusSalary());
        System.out.println("Income: " + freelanceDeveloper.income());
        System.out.println();

        // SeniorDeveloper
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(3, "Bob Smith", 8000.0);

        // Bilgileri yazdırma
        System.out.println("Senior Developer:");
        System.out.println("ID: " + seniorDeveloper.getId());
        System.out.println("Full Name: " + seniorDeveloper.getFullName());
        System.out.println("Monthly Salary: " + seniorDeveloper.getMonthlySalary());
        System.out.println("Promotion: " + seniorDeveloper.getPromotion());
        System.out.println("Income: " + seniorDeveloper.income());
    }
}
