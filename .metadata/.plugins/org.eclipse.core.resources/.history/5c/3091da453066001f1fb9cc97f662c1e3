package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
	
	private List<Item> carrinhoDeCompra;
	
	public CarrinhoDeCompra() {
		this.carrinhoDeCompra = new ArrayList<>();	
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoDeCompra.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> listaDeItensRemover = new ArrayList<>();
		
		for(Item i : carrinhoDeCompra) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				listaDeItensRemover.add(i);
			}
		}
		
		carrinhoDeCompra.removeAll(listaDeItensRemover);
	}
	
	public void calcularValorTotal() {
		double valorTotal = 0;
		double valorItensCarrinho;
		
		for(Item i : carrinhoDeCompra) {
			valorItensCarrinho = i.getQuantidade() * i.getPreco();
			valorTotal += valorItensCarrinho;
		}
		
		System.out.println("O valor total de compras é : " + valorTotal);
	}
	
	public void exibirItens() {
		System.out.println("Segue a lista de intens : " + carrinhoDeCompra);
	}
	
	

}
