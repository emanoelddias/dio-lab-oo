package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionario;

	public Dicionario() {
		dicionario = new HashMap<String, String>();
	}
	
	public void adicionarPalavra(String palavra, String definicao) {
		dicionario.put(palavra, definicao);
	}
	
	public void removerPalavra(String palavra) {
		if(!dicionario.isEmpty()) {
			dicionario.remove(palavra);
		}
	}
	
	public void exibirPalavras() {
		System.out.println(dicionario);
	}
	
	public String pesquisarPorPalavra(String palavra) {
		String definicaoPorPalavra = null;
		
		if(!dicionario.isEmpty()) {
			definicaoPorPalavra = dicionario.get(palavra);
		}
		
		return definicaoPorPalavra;
	}
	
	
	
	
	
	
}
