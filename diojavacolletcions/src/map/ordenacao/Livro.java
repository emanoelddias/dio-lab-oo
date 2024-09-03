package map.ordenacao;

import java.util.Comparator;
import java.util.Map;

public class Livro implements Comparable<Livro> {
	
	private String titulo;
	private String autor;
	private double preco;
	
	public Livro(String titulo, String autor, double preco) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "[titulo=" + titulo + ", autor=" + autor + ", preco=" + preco + "]";
	}

	@Override
	public int compareTo(Livro l) {
		// TODO Auto-generated method stub
		return Double.compare(this.preco, l.getPreco());
	}	

}

class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
	  @Override
	  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
	    return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
	  }
	}

class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {
	  @Override
	  public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
	    return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
	  }
	}
