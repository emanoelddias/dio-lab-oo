package map.operacoesBasicas;

public class TesteContagemPalavras {
	
	public static void main(String[] args) {
		ContagemPalavras contagemLinguagens = new ContagemPalavras();

	    // Adiciona linguagens e suas contagens
	    contagemLinguagens.adicionarPalavra("Java", 2);
	    contagemLinguagens.adicionarPalavra("Python", 8);
	    contagemLinguagens.adicionarPalavra("JavaScript", 1);
	    contagemLinguagens.adicionarPalavra("C#", 6);

	    // Exibe a contagem total de linguagens
	    System.out.println(contagemLinguagens.exibirContagemPalavras());

	    // Encontra e exibe a linguagem mais frequente
	    contagemLinguagens.encontrarPalavraMaisFrequente();
	}

}
