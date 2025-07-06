package Compareable;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>{
	String name;
	double price;
	
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	@Override
	public int compareTo(Product other) {
		return Double.compare(this.price,other.price);
	}
	
	@Override
	public String toString() {
		return String.format("%s： $%.2f",name,price);
	}
	
}

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> products=new ArrayList<>();
		products.add(new Product("Laptop", 25999.99));
		products.add(new Product("Mouse", 499.50));
		products.add(new Product("Keyboard", 1200.00));
		products.add(new Product("Monitor", 5999.00));
		products.add(new Product("USB Cable", 299.99));
		
		Collections.sort(products);
		
		for(Product p:products) {
			System.out.println(p);
		}
	}

}
