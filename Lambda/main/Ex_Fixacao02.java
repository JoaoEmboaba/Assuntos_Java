package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionarios;

public class Ex_Fixacao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = read.next();

		System.out.print("Enter the minimum salary: ");
		float num = read.nextFloat();

		List<Funcionarios> funcionarios = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String fields[] = line.split(",");
				funcionarios.add(new Funcionarios(fields[0], fields[1], Float.parseFloat(fields[2])));
				line = br.readLine();
			}

			List<String> emails = funcionarios.stream().filter(x -> x.getSalario() > num).map(x -> x.getEmail())
					.sorted().collect(Collectors.toList());

			System.out.printf("\nList of emails of people whose salary is greater than %.2f: ", num);

			System.out.println();
			
			emails.forEach(System.out::println);

			float sum = funcionarios.stream().filter(x -> x.getNome().charAt(0) == 'M').map(x -> x.getSalario())
					.reduce(0.0f, (x, y) -> x + y);

			System.out.printf("\nSum of salary of people whose the name starts with 'M': R$%.2f", sum);

		} catch (Exception e) {
			// TODO: handle exception
		}

		read.close();
	}
}
