package bancoDigital;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super.cliente = cliente;
	}
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Corrente ====");
		super.imprimirInformacoesComuns();
	}
	

}
