package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<PalavrasUnicas> conjuntoPalavrasUnicas;

	public ConjuntoPalavrasUnicas() {
		conjuntoPalavrasUnicas = new HashSet<PalavrasUnicas>();
	}
	
	public void adicionarPalavra(String palavra) {
		conjuntoPalavrasUnicas.add(new PalavrasUnicas(palavra));		
	}
	
	public void removerPalavra(String palavra) {
		for(PalavrasUnicas p : conjuntoPalavrasUnicas) {
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				conjuntoPalavrasUnicas.remove(p);
				break;
			}
		}
	}
	
	public boolean verificarPalavra(String palavra) {
		boolean verificaPalavra = false;
		
		for(PalavrasUnicas p : conjuntoPalavrasUnicas) {
			if(p.getPalavra().equalsIgnoreCase(palavra)) {
				verificaPalavra = true;
				break;
			}
		}
		return verificaPalavra;
	}
	
	public void exibirPalavrasUnicas() {
		System.out.println(conjuntoPalavrasUnicas);
	}
	
	public void quantidadePalavras() {
		System.out.println(conjuntoPalavrasUnicas.size());
	}
	
	
	
}
