package projectProwayEAD2;

public class Livro {
	
	private String titulo;
	private String autor;
	private Integer anoPublicacao;
	private Integer numeroPaginas;
	private Integer quantidadeEstoque;
	
	public Livro() {}

	public Livro(String titulo, String autor, Integer anoPublicacao, Integer numeroPaginas, Integer quantidadeEstoque) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.numeroPaginas = numeroPaginas;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(Integer anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	};
	
	public void imprimirDados() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		System.out.println("Ano de publição" + this.anoPublicacao);
		System.out.println("Número de paginas" + this.numeroPaginas);
		System.out.println("Quantidade no estoque:" + this.quantidadeEstoque);
	}
	
	public boolean verificarDisponibilidade() {
		if (this.quantidadeEstoque > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void realizarVenda() {
		if(this.verificarDisponibilidade()) {
			this.quantidadeEstoque --;
			System.out.println("Venda realizada com sucesso");
		} else {
			System.out.println("Sem quantidade em estoque");
		}	
		
	}
	
	public void adicionarEstoque(Integer quantidade) {
		this.quantidadeEstoque += quantidade;
	}

}
