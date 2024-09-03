package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> listaTarefas;

	public ListaTarefas() {
		listaTarefas = new HashSet<Tarefa>();
	}
	
	public void adicionarTarefa(String descricao){
		listaTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao){
		for(Tarefa t : listaTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				listaTarefas.remove(t);
				break;
			}
		}
	}
	
	public Set<Tarefa> exibirTarefas(){
		return listaTarefas;
	}
	
	public void contarTarefas() {
		System.out.println("Quantidade de tarefas : " + listaTarefas.size());
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> listaTarefasConcluidas = new HashSet<Tarefa>();
		for(Tarefa t : listaTarefas) {
			if(t.isStatus()) {
				listaTarefasConcluidas.add(t);
			}
		}
		
		return listaTarefasConcluidas;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> listaTarefasPendentes = new HashSet<Tarefa>();
		for(Tarefa t : listaTarefas) {
			if(!t.isStatus()) {
				listaTarefasPendentes.add(t);
			}
		}
		return listaTarefasPendentes;
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for(Tarefa t : listaTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setStatus(true);;
				break;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for(Tarefa t : listaTarefas) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setStatus(false);;
				break;
			}
		}
	}
	
	public void limparListaTarefas() {
		listaTarefas.clear();
	}
	
}
