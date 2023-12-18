package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("Lenova V5");
		product1.setUnitPrice(16000);
		product1.setDetails("32 GB Ram");
		product1.setDiscount(10);
		product1.getUnitPriceAfterDiscount();
		
		Product product2 = new Product("Lenova V14", 2, 14000, "16 GB Ram", 10, 12560);
		
		
		Product[] products = {product1,product2};
		for(Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);	
		
		Category category1 = new Category(1,"Computer");
		Category category2 = new Category(2,"House/Garden");
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
	
		
	}

}
