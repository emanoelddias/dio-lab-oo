package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
	
	private Set<Aluno> listaAlunos;

	public GerenciadorAlunos() {
		listaAlunos = new HashSet<Aluno>();
	}
	
	public void adicionarAluno(String nome, int marticula, double nota){
		listaAlunos.add(new Aluno(nome,marticula,nota));
	}
	
	public void removerAluno(long matricula) {
		for(Aluno a : listaAlunos ) {
			if(a.getMatricula() == matricula) {
				listaAlunos.remove(a);
				break;
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<Aluno>(listaAlunos); 
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<Aluno>(new ComparatorPorNota()); 
		alunosPorNota.addAll(listaAlunos);
		return alunosPorNota;
	}
	
	public Set<Aluno> exibirAlunos(){
		return listaAlunos;
	}
	
	

}
