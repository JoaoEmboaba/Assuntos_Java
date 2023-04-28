package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entitie.Employee;

public class Ex_Fixacao02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = read.next();

		System.out.print("Enter the salary: ");
		float salaryy = read.nextFloat();

		List<Employee> funcionarios = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String fields[] = line.split(",");
				funcionarios.add(new Employee(fields[0], fields[1], Float.parseFloat(fields[2])));
				line = br.readLine();
			}

			List<String> emails = funcionarios.stream().filter(x -> x.getSalary() > salaryy).map(x -> x.getEmail())
					.sorted().collect(Collectors.toList());

			System.out.printf("\nEmployee's emails whose salary is greater than %.2f: ", salaryy);

			System.out.println();

			emails.forEach(System.out::println);

			Float sum = funcionarios.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary())
					.reduce(0.0f, (x, y) -> x + y);

			System.out.printf("\nThe sum of salary of people whose the name starts with 'M': R$%.2f", sum);

		} catch (Exception ex) {
			System.out.println(ex.fillInStackTrace());
		}

		read.close();
	}
}
