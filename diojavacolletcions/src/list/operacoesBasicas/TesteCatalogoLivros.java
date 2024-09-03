package list.operacoesBasicas;

public class TesteCatalogoLivros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatalogoLivros catalogo1 = new CatalogoLivros();
		
		catalogo1.adicionarLivro("Livro1", "Autor1", 2019);
		catalogo1.adicionarLivro("Livro2", "Autor2", 2017);
		catalogo1.adicionarLivro("Livro3", "Autor3", 2015);
		catalogo1.adicionarLivro("Livro4", "Autor1", 2016);
		catalogo1.adicionarLivro("Livro5", "Autor3", 2018);
		catalogo1.adicionarLivro("Livro6", "Autor2", 2011);
		
		catalogo1.pesquisarPorTitulo("Livro1");	
		catalogo1.pesquisarPorIntervaloAnos(2015, 2018);
		catalogo1.pesquisarPorAutor("Autor1");
	}

}
