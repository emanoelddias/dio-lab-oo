package testePalindromo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean palindromo = false;
		
		Palavra palavra1 = new Palavra("radar");	
		
		palindromo = palavra1.verificarPalindromo();
		
		System.out.println(palindromo ? "É palíndromo" : "Não é palíndromo");
		
	}
	


}
