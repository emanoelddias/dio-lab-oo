package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> conjuntoConvidados;

	public ConjuntoConvidados() {
		conjuntoConvidados = new HashSet<Convidado>();
	}
	
	public void adicionarConvidado(String nome, int codigoConvite) {
		conjuntoConvidados.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		for(Convidado c : conjuntoConvidados ) {
			if(codigoConvite == c.getCondigoConvite()) {
				conjuntoConvidados.remove(c);
				break;
			}
		}
	}
	
	public void contarConvidados() {
		System.out.println("quantidade de convidados :" + conjuntoConvidados.size());
	}
	
	public Set<Convidado> exibirConvidados(){
		return conjuntoConvidados;
	}
	

}
