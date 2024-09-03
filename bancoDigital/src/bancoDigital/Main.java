package bancoDigital;

public class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		ContaPoupanca cp = new ContaPoupanca();
		cc.transferir(10, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}
}
