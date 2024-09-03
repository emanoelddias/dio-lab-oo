																				package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
	
	private Map<String, Integer> contagemPalavras;

	public ContagemPalavras() {
		contagemPalavras = new HashMap<String, Integer>();
	}
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		contagemPalavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		contagemPalavras.remove(palavra);
	}
	
	public Map<String, Integer> exibirContagemPalavras(){
		return contagemPalavras;
	}
	
	public void encontrarPalavraMaisFrequente(){
		String palavraMaiorFrequencia = null;
		Integer contagemMaiorFrequancia = null;
		Integer maiorQuantidade = Integer.MIN_VALUE;
		
		if(!contagemPalavras.isEmpty()) {
			for(Map.Entry<String, Integer> entry: contagemPalavras.entrySet()) {
				if(entry.getValue() > maiorQuantidade) {
					palavraMaiorFrequencia = entry.getKey();
					contagemMaiorFrequancia = entry.getValue();
				}
			}
		}
		
		System.out.println("A palavra que aparece mais vezes é :" + palavraMaiorFrequencia + " aparece " + contagemMaiorFrequancia );
	}

}
