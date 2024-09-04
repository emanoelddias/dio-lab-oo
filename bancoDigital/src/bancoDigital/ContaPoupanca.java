package bancoDigital;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super.cliente = cliente;
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupança ====");
		super.imprimirInformacoesComuns();
	}
}
