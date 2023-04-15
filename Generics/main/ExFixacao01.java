package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import entities.Cadastro;
import exceptions.WrongPathException;

public class ExFixacao01 {

	public static void main(String[] args) throws WrongPathException {

		Scanner read = new Scanner(System.in);

		System.out.println("Informe o caminho do arquivo: ");
		String path = read.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			Set<Cadastro> log = new TreeSet<>();

			while (line != null) {
				String[] fields = line.split(" ");
				log.add(new Cadastro(fields[0], Date.from(Instant.parse(fields[1]))));
				line = br.readLine();
			}

			System.out.println("\nTotal users: " + log.size());

			for (Cadastro cadastros : log) {
				System.out.print("\n" + cadastros);
			}

		} catch (IOException ex) {
			throw new WrongPathException(ex.getMessage(), ex.fillInStackTrace());
		}finally {
			System.out.println("\n\n | *finished program* |");
		}
	}
}
