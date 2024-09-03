package testePalindromo;

public class Palavra {
	
	private String str;
	
	public Palavra(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Boolean verificarPalindromo() {
		
		String palavraMinuscula = this.str.toLowerCase();
		
		int i = 0;
		int j = palavraMinuscula.length() - 1;
		
		for(i = 0;i < palavraMinuscula.length();i ++) {
			char letraCres = palavraMinuscula.charAt(i);
			char letraDesc = palavraMinuscula.charAt(j);
			j --;
			
			if (letraDesc != letraCres) {
				return false;
			} 
	
		}
		return true;
	}
}
