package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExFixacao03 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		Map<String, Integer> candidatos = new HashMap<>();

		System.out.print("Enter the file path: ");
		String path = read.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String fields[] = line.split(",");
				int count = Integer.parseInt(fields[1]);
				if (candidatos.containsKey(fields[0])) {
					int soma = candidatos.get(fields[0]);
					candidatos.put(fields[0], count + soma);
				} else {
					candidatos.put(fields[0], count);
				}

				line = br.readLine();
			}

			System.out.println();

			for (String nomes : candidatos.keySet()) {
				System.out.println(nomes + ": " + candidatos.get(nomes));
			}

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		read.close();

	}
}
