package set.operacoesbasicas;

public class TesteTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		ListaTarefas listatarefa1 = new ListaTarefas();
		
		//adicionarTarefa(String descricao): Adiciona uma nova tarefa ao Set.
		listatarefa1.adicionarTarefa("Tarefa1");
		listatarefa1.adicionarTarefa("Tarefa2");
		listatarefa1.adicionarTarefa("Tarefa3");
		listatarefa1.adicionarTarefa("Tarefa4");
		listatarefa1.adicionarTarefa("Tarefa5");
		listatarefa1.adicionarTarefa("Tarefa6");
		listatarefa1.adicionarTarefa("Tarefa7");
		listatarefa1.adicionarTarefa("Tarefa8");
		
		//•contarTarefas(): Conta o número total de tarefas na lista de tarefas.
		listatarefa1.contarTarefas();
				
		//removerTarefa(String descricao): Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
		listatarefa1.removerTarefa("Tarefa3");
		listatarefa1.removerTarefa("Tarefa7");
		
		//•exibirTarefas(): Exibe todas as tarefas da lista de tarefas.
		System.out.println(listatarefa1.exibirTarefas());

		//•contarTarefas(): Conta o número total de tarefas na lista de tarefas.
		listatarefa1.contarTarefas();
		
		//•obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
		System.out.println(listatarefa1.obterTarefasConcluidas());
				
		//•obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
		System.out.println(listatarefa1.obterTarefasPendentes());		
		
		//•marcarTarefaConcluida(String descricao): Marca uma tarefa como concluída de acordo com a descrição.
		listatarefa1.marcarTarefaConcluida("Tarefa1");
		listatarefa1.marcarTarefaConcluida("Tarefa2");
		listatarefa1.marcarTarefaConcluida("Tarefa4");
		listatarefa1.marcarTarefaConcluida("Tarefa5");
		listatarefa1.marcarTarefaConcluida("Tarefa8");
		
		//•obterTarefasConcluidas(): Retorna um Set com as tarefas concluídas.
		System.out.println(listatarefa1.obterTarefasConcluidas());
		
		//•marcarTarefaPendente(String descricao): Marca uma tarefa como pendente de acordo com a descrição.
		listatarefa1.marcarTarefaPendente("Tarefa2");
		listatarefa1.marcarTarefaPendente("Tarefa4");
		
		//•obterTarefasPendentes(): Retorna um Set com as tarefas pendentes.
		System.out.println(listatarefa1.obterTarefasPendentes());	
		
		//•limparListaTarefas(): Remove todas as tarefas da lista de tarefas. 
		listatarefa1.limparListaTarefas();
		
		//•contarTarefas(): Conta o número total de tarefas na lista de tarefas.
		listatarefa1.contarTarefas();
		
	}

}
