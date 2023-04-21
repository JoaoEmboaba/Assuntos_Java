package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExFixacao03 {

	public static void main(String[] args) throws IOException {

		Scanner read = new Scanner(System.in);
		Map<String, Integer> candidatos = new HashMap<>();

		System.out.println("Enter the file path: ");
		String path = read.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				int count = Integer.parseInt(fields[1]);
				if (candidatos.containsKey(fields[0])) {
					int soma = candidatos.get(fields[0]);
					candidatos.put(fields[0], count + soma);

				} else {

					candidatos.put(fields[0], Integer.parseInt(fields[1]));

				}

				line = br.readLine();
			}

			for (String candidato : candidatos.keySet()) {
				System.out.println(candidato + ": " + candidatos.get(candidato));
			}

		} catch (IOException ex) {
			throw new IOException(ex.getCause());
		}

		read.close();
	}
}
