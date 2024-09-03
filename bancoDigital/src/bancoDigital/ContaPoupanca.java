package bancoDigital;

public class ContaPoupanca extends Conta {
	
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupança ====");
		super.imprimirInformacoesComuns();
	}
}
