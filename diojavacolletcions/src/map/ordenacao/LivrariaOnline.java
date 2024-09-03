package map.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

	private Map<String, Livro> livros;

	public LivrariaOnline() {
		livros = new HashMap<String, Livro>();
	}

	public void adicionarLivro(String link, Livro livro) {
		livros.put(link, livro);
	}

	public void removerLivro(String titulo) {
		for (Map.Entry<String, Livro> e : livros.entrySet()) {
			if (e.getValue().getTitulo() == titulo) {
				livros.remove(e.getKey());
				break;
			}
		}
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {

		List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

		Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

		Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
			livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
		}
		return livrosOrdenadosPorPreco;
	}

	public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
		List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

		Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

		Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

		for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
			livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
		}

		return livrosOrdenadosPorAutor;
	}
	
	public void obterLivroMaisCaro() {
		Double valorMaisCaro = Double.MIN_VALUE;
		String livroMaisCaro = null;
		
		for(Map.Entry<String, Livro> entry : livros.entrySet()) {
			if(entry.getValue().getPreco() > valorMaisCaro) {
				valorMaisCaro = entry.getValue().getPreco();
				livroMaisCaro = entry.getValue().getTitulo();
			}
		}
		
		System.out.println("O Livro mais caro é " + livroMaisCaro + " custando " + valorMaisCaro );
	}
	
	public void exibirLivroMaisBarato() {
		Double valorMaisBarato = Double.MAX_VALUE;
		String livroMaisBarato = null;
		
		for(Map.Entry<String, Livro> entry : livros.entrySet()) {
			if(entry.getValue().getPreco() < valorMaisBarato) {
				valorMaisBarato = entry.getValue().getPreco();
				livroMaisBarato = entry.getValue().getTitulo();
			}
		}
		
		System.out.println("O Livro mais Barato é " + livroMaisBarato + " custando " + valorMaisBarato );
	}

}
