package bancoDigital;

public class Main {
	
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(new Cliente("Emanoel"));
		cc.depositar(100);
		ContaPoupanca cp = new ContaPoupanca(new Cliente("Emanoel"));
		cc.transferir(10, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.sacar(150);
		cc.imprimirExtrato();
		
		

	}
}
