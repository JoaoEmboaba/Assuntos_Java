package main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExFixacao02 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		Set<Integer> students = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int qtdA = read.nextInt();
		
		for(int i = 1; i<=qtdA; i++) {
			int values = read.nextInt();
			students.add(values);
		}
		
		System.out.print("\nHow many students for course B?");
		int qtdB = read.nextInt();
		
		for(int i = 1; i<=qtdB; i++) {
			int values = read.nextInt();
			students.add(values);
		}
		
		System.out.print("\nHow many students for course C?");
		int qtdC = read.nextInt();
		
		for(int i = 1; i<=qtdC; i++) {
			int values = read.nextInt();
			students.add(values);
		}
		
		System.out.println("\nTotal students: " + students.size());
	}
}
