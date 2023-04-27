package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Products01;

public class Ex_Fixacao01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = read.next();

		List<Products01> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				lista.add(new Products01(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}

			double average = lista.stream().map(x -> x.getPreco()).reduce(0.0, (x, y) -> x + y / lista.size());

			System.out.printf("\nAverage: %.2f", average);

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> nomes = lista.stream().filter(x -> x.getPreco() < average).map(x -> x.getNome())
					.sorted(comp.reversed()).collect(Collectors.toList());

			System.out.println("\n");

			nomes.forEach(System.out::println);

		} catch (IOException ex) {
			ex.fillInStackTrace();
		}
	}
}
