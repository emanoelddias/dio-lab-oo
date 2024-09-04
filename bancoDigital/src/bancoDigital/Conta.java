package bancoDigital;

public abstract class Conta implements IConta{
	
	private final int AGENCIA_PADRA = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;	
	protected Cliente cliente;
	protected boolean saque;
	
	public Conta() {
		this.agencia = AGENCIA_PADRA;
		this.numero = SEQUENCIAL++;
	}

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		if(this.saldo <= 0 || this.saldo < valor) {
			System.out.println("Saldo insuficiente !!");
			saque = false;
		}else {			
			this.saldo -= valor;	
			saque = true;
		}
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;		
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		if(saque) {
			contaDestino.depositar(valor);
		}		
	}
	
	protected void imprimirInformacoesComuns(){
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
