package entities;

import java.util.Date;
import java.util.Objects;

public class Cadastro implements Comparable<Cadastro> {

	private String nome;
	private Date data;
	
	public Cadastro(String nome, Date data) {
		this.nome = nome;
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro other = (Cadastro) obj;
		return Objects.equals(data, other.data) && Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Cadastro other) {
		return nome.compareTo(other.getNome());
	}

	@Override
	public String toString() {
		return "" + nome + " " + data;
	}
}
