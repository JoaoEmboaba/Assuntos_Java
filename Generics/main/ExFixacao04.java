package main;

import java.util.HashMap;
import java.util.Map;

import entities.Produto;

public class ExFixacao04 {

	public static void main(String[] args) {
		
		Map<Produto, Double> estoque = new HashMap<>();
		
		Produto p1 = new Produto("TV", 900.0);
		Produto p2 = new Produto("MONITOR", 1200.0);
		Produto p3 = new Produto("MOUSE", 349.0);
		
		double valor = 900.0;
		
		estoque.put(p1, valor);
		estoque.put(p2, valor);
		estoque.put(p3, valor);
		
		Produto p = new Produto("TV", 900.0);
		
		System.out.println(estoque.containsKey(p));
	}
}
