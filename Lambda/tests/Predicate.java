package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitie.Product;

public class Predicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		list.removeIf(p->p.getPreco() >= 100.0);
		
		for(Product p : list) {
		}
	}
}
