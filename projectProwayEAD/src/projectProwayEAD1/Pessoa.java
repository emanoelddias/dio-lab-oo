package projectProwayEAD1;

public class Pessoa {

	private String nome;
	private Integer idade;
	private double altura;
	private double peso;
	
	public Pessoa() {};
	
	public Pessoa(String nome, Integer idade, double altura, double peso) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void imprimirDados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
	}
	
	public void calcularImc() {
		double imc = this.peso/(this.altura * this.altura);
		System.out.println("Imc: " + imc);
	}
	
	public void fazerAniversario() {
		this.idade ++;
		System.out.println("Feliz aniversario " + this.nome + " você está fazendo: " + this.idade);
	}
	
	public void cumprimentar(String nome) {
		System.out.println("Olá " + nome + 
				" Meu nome é: " + this.nome);
	}
	
}
