package inheritance;

public class main {

	public static void main(String[] args) {
		individualCustomer murat = new individualCustomer();
		murat.CustomerNumber = "123";
		
		CorporateCustomer HepsiBurada = new CorporateCustomer();
		HepsiBurada.CustomerNumber = "1245";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(murat);
		//customerManager.add(HepsiBurada);
		
		Customer[] customers = {murat,HepsiBurada};
		customerManager.addMultiple(customers);
	}

}
