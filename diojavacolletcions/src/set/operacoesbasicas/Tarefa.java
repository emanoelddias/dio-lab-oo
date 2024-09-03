package set.operacoesbasicas;

public class Tarefa {
	
	private String descricao;
	private boolean status;	
	
	public Tarefa(String descricao) {
		
		this.descricao = descricao;
		this.status = false;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "[descricao=" + descricao + ", status=" + status + "]";
	}
	
	
	
	

}
