package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> agendaContatos;

	public AgendaContatos() {
		agendaContatos = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numero) {
		agendaContatos.add(new Contato(nome,numero));
	}
	
	public Set<Contato> exibirContatos(){
		return agendaContatos;
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> listaContatoPorNome = new HashSet<Contato>();
		
		for(Contato c : agendaContatos) {
			if(c.getNome().startsWith(nome)) {
				listaContatoPorNome.add(c);
			}
		}
		
		return listaContatoPorNome;
	}
	
	public void atualizarNumeroContato(String nome, int novoNumero) {
		for(Contato c : agendaContatos) {
			if(c.getNome().equals(nome)) {
				c.setNumero(novoNumero);
			}
		}
	}

}
