package set;

import java.util.Objects;

public class Convidado {
	
	private String nome;
	private int condigoConvite;
	
	@Override
	public String toString() {
		return "Convidado [nome=" + nome + ", condigoConvite=" + condigoConvite + "]";
	}
	
	public Convidado(String nome, int condigoConvite) {
		this.nome = nome;
		this.condigoConvite = condigoConvite;
	}	
	
	public String getNome() {
		return nome;
	}
	
	public int getCondigoConvite() {
		return condigoConvite;
	}

	@Override
	public int hashCode() {
		return Objects.hash(condigoConvite);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return condigoConvite == other.condigoConvite;
	}	
	

}
