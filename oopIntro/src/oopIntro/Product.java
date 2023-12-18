package oopIntro;

public class Product {
	//encapsulation
	String name;
	int id;
	double unitPrice;
	String details;
	double discount;
	double unitPriceAfterDiscount;
	
	public Product() {
		
	}
	
	public Product(String name, int id, double unitPrice,
			String details, double discount, double unitPriceAfterDiscount) {
		super();
		this.name = name;
		this.id = id;
		this.unitPrice = unitPrice;
		this.details = details;
		this.discount = discount;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);
	}

	
}
