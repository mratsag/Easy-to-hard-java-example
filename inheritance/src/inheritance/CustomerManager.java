package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.CustomerNumber+" : Added.");
	}
	
	
	//bulk-insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer: customers) {
			add(customer);
		}
	}
}
