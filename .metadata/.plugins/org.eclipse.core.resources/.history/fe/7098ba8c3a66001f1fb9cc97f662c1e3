package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
	
	private List<Livro> catalogoLivros;
	
	public CatalogoLivros() {
		this.catalogoLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogoLivros.add(new Livro(titulo,autor,anoPublicacao));
	}
	
	public void pesquisarPorAutor(String autor) {
			
		if(!catalogoLivros.isEmpty()) {
			List<Livro> listaLivroPesquisaAutor = new ArrayList<Livro>();
			
			for (Livro l : catalogoLivros) {
				if(l.getAutor().equals(autor)) {
					listaLivroPesquisaAutor.add(l);
				}
			}
			
			System.out.println(listaLivroPesquisaAutor);
		} else {
			System.out.println("Lista de livros está vazia");
		}
	}
	
	public void pesquisarPorTitulo(String titulo) {
		if(!catalogoLivros.isEmpty()) {	
			
			Livro pesquisaPorTitulo = null;
			
			for (Livro l : catalogoLivros) {
				if (l.getTitulo().equals(titulo)) {
					pesquisaPorTitulo = new Livro(l.getTitulo(),l.getAutor(),l.getAno());
				}
			}
			
			System.out.println(pesquisaPorTitulo);
		}else {
			System.out.println("Lista de livros vazia");
		}
	}
	
	public void pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		if(!catalogoLivros.isEmpty()) {
			List<Livro> pesquisaPorIntervaloAno = new ArrayList<Livro>();
			for(Livro l : catalogoLivros) {
				if(l.getAno() >= anoInicial && l.getAno() <= anoFinal) {
					pesquisaPorIntervaloAno.add(l);
				}
			}
			
			System.out.println(pesquisaPorIntervaloAno); 
		}else {
			System.out.println("Lista de livros vazia");
		}
	}

}
