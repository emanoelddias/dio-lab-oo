package list.ordenacao;

public class TesteOrdenacaoNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrdenacaoNumeros numerosOrdenados = new OrdenacaoNumeros();
		
		numerosOrdenados.adicionarNumero(1);
		numerosOrdenados.adicionarNumero(3);
		numerosOrdenados.adicionarNumero(6);
		numerosOrdenados.adicionarNumero(7);
		numerosOrdenados.adicionarNumero(9);
		numerosOrdenados.adicionarNumero(11);
		numerosOrdenados.adicionarNumero(2);
		numerosOrdenados.adicionarNumero(5);
		
		System.out.println(numerosOrdenados.ordenarAscendente());
		System.out.println(numerosOrdenados.ordenarDescendente());
		
		
	}

}
