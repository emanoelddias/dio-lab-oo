package set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
	
	private String nome;
	private int matricula;
	private double nota;
	
	public Aluno(String nome, int matricula, double nota) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
	}

	@Override
	public int compareTo(Aluno a) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(a.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

}

class ComparatorPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno a1, Aluno a2) {
		// TODO Auto-generated method stub
		return Double.compare(a1.getNota(), a2.getNota());
	}
	
}
