package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExFixacao02 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Set<Integer> students = new HashSet<>();
		int studentCode = 0;

		System.out.println("How many students for course A?");
		int qtdA = read.nextInt();

		for (int i = 0; i < qtdA; i++) {
			studentCode = read.nextInt();
			students.add(studentCode);
		}

		System.out.println("How many students for course B?");
		int qtdB = read.nextInt();

		for (int i = 0; i < qtdB; i++) {
			studentCode = read.nextInt();
			students.add(studentCode);
		}

		System.out.println("How many students for course C?");
		int qtdC = read.nextInt();

		for (int i = 0; i < qtdC; i++) {
			studentCode = read.nextInt();
			students.add(studentCode);
		}

		System.out.println("\nTotal students: " + students.size());
	}
}
