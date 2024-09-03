package set.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
	
	private String nome;
	private long cod;
	private double preço;
	private int quantidade;	
	
	@Override
	public int compareTo(Produto p) {
		// TODO Auto-generated method stub
		return nome.compareToIgnoreCase(p.getNome());
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", cod=" + cod + ", preço=" + preço + ", quantidade=" + quantidade + "]";
	}

	public Produto(String nome, long cod, double preço, int quantidade) {
		this.nome = nome;
		this.cod = cod;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public long getCod() {
		return cod;
	}
	public double getPreço() {
		return preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
}

class ComparatorPorPreco implements Comparator<Produto>{

	@Override
	public int compare(Produto p1, Produto p2) {
		// TODO Auto-generated method stub
		return Double.compare(p1.getPreço(), p2.getPreço());
	}
	
}
