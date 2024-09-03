package map.operacoesBasicas;

public class TesteDicionario {
	
	public static void main(String[] args) {
		
		Dicionario dicionario = new Dicionario();
		
		dicionario.adicionarPalavra("Palavra1 ", "Defionicao1");
		dicionario.adicionarPalavra("Palavra2 ", "Defionicao2");
		dicionario.adicionarPalavra("Palavra3 ", "Defionicao3");
		dicionario.adicionarPalavra("Palavra4 ", "Defionicao4");
		dicionario.adicionarPalavra("Palavra5 ", "Defionicao5");
		dicionario.adicionarPalavra("Palavra6 ", "Defionicao6");
		dicionario.adicionarPalavra("Palavra7 ", "Defionicao7");
		dicionario.adicionarPalavra("Palavra8 ", "Defionicao9");
		dicionario.adicionarPalavra("Palavra9 ", "Defionicao0");
		
		System.out.println(dicionario.pesquisarPorPalavra("Palavra9 "));
		
		dicionario.exibirPalavras();
		
		dicionario.removerPalavra("Palavra1 ");
		
		dicionario.exibirPalavras();
	}
	
	
	

}
