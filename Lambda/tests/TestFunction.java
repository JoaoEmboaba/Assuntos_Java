package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.FunctionInsideFunction;
import entities.Product;
import entities.ProductFunction;

public class TestFunction {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		FunctionInsideFunction fif = new FunctionInsideFunction();
		
		double answ = fif.filtredSum(list, x -> x.getPreco() <= 100.0);
		
		System.out.println(answ);
	}
}
