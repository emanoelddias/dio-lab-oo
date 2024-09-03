package list.ordenacao;

public class TestePessoas {
	
	public static void main(String[] args) {
		
		OrdenacaoPessoas listaPessoas = new OrdenacaoPessoas();
		
		listaPessoas.adicionarPessoa("Nome1", 10, 1.80);
		listaPessoas.adicionarPessoa("Nome2", 15, 1.70);
		listaPessoas.adicionarPessoa("Nome3", 14, 1.60);
		listaPessoas.adicionarPessoa("Nome4", 12, 1.45);
		listaPessoas.adicionarPessoa("Nome5", 24, 1.75);
		listaPessoas.adicionarPessoa("Nome6", 35, 1.50);
		listaPessoas.adicionarPessoa("Nome7", 14, 1.65);
		
		System.out.println(listaPessoas.ordenarPorIdade());
		
		System.out.println(listaPessoas.ordenarPorAltura());
		
	}
}
