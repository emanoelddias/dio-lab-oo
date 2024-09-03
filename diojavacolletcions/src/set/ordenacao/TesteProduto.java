package set.ordenacao;

public class TesteProduto {
	
	public static void main(String[] args) {
		
		CadastroProduto listaProdutos = new CadastroProduto();
		
		listaProdutos.adicionarProduto(123456, "Produto1", 20.0, 2);
		listaProdutos.adicionarProduto(123545, "Produto2", 32.0, 4);
		listaProdutos.adicionarProduto(345756, "Produto3", 45.0, 6);
		listaProdutos.adicionarProduto(456987, "Produto4", 56.0, 8);
		listaProdutos.adicionarProduto(534123, "Produto5", 28.0, 9);
		listaProdutos.adicionarProduto(578097, "Produto6", 19.0, 1);
		listaProdutos.adicionarProduto(563458, "Produto7", 31.0, 12);
		
		System.out.println(listaProdutos.exibirProdutosPorPreco());		
		System.out.println(listaProdutos.exibirProdutosPorNome());
		
	}
	
	
}
