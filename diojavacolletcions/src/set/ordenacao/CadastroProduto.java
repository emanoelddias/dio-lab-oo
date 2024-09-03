package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
	private Set<Produto> cadastroProduto;

	public CadastroProduto() {
		cadastroProduto = new HashSet<Produto>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade){
		cadastroProduto.add(new Produto(nome,cod,preco,quantidade));
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> listaProdutosPorNome = new TreeSet<Produto>(cadastroProduto);
		return listaProdutosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> listaProdutosPorPreco = new TreeSet<Produto>(new ComparatorPorPreco());
		listaProdutosPorPreco.addAll(cadastroProduto);
		return listaProdutosPorPreco;
	}
	
	
}
