package projectProwayEAD1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa("João", 30, 1.70, 85.0);
		Pessoa pessoa2 = new Pessoa("Maria", 25, 1.65, 60.0);
		
		pessoa1.imprimirDados();
		pessoa1.calcularImc();
		pessoa1.fazerAniversario();
		pessoa1.cumprimentar("Emanoel");
		
		System.out.println("--------------------------------------"); 
		
		pessoa2.imprimirDados();
		pessoa2.calcularImc();
		pessoa2.fazerAniversario();
		pessoa2.cumprimentar("Emanoel");

	}

}
