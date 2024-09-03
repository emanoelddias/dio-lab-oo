package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	private List<Numero> ordenacaoNumero;

	public OrdenacaoNumeros() {
		ordenacaoNumero = new ArrayList<Numero>();
	}
	
	public void adicionarNumero(int numero) {
		ordenacaoNumero.add(new Numero(numero));		
	}
	
	public List<Numero> ordenarAscendente(){
		List<Numero> numeroOrdemAsc = new ArrayList<Numero>(ordenacaoNumero);
		Collections.sort(numeroOrdemAsc);
		return numeroOrdemAsc;		
	}
	
	public List<Numero> ordenarDescendente(){
		List<Numero> numeroOrdemDec = new ArrayList<Numero>(ordenacaoNumero);
		Collections.sort(numeroOrdemDec, Collections.reverseOrder());
		return numeroOrdemDec;		
	}
	

}
