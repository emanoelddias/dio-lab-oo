package set.operacoesbasicas;

public class TesteContato {
	
	public static void main(String[] args) {
		AgendaContatos listaContatos = new AgendaContatos();
		
		listaContatos.adicionarContato("Emanoel Dornelas", 933701714);
		listaContatos.adicionarContato("Emanoel Dias", 999991111);
		listaContatos.adicionarContato("Emanoel lopes", 933705714);
		listaContatos.adicionarContato("Emanoel Rosendo", 123456789);
		listaContatos.adicionarContato("Gabrielle Teles", 987654321);
		listaContatos.adicionarContato("Gabrielle Cunha", 888888888);
		listaContatos.adicionarContato("Gabrielle Dias", 111111111);
		listaContatos.adicionarContato("Catarina Teles", 232322333);
		listaContatos.adicionarContato("Catarina Dias", 555567775);
				
		System.out.println(listaContatos.exibirContatos());
		System.out.println(listaContatos.pesquisarPorNome("Catarina"));
		
		listaContatos.atualizarNumeroContato("Emanoel Dornelas", 222222222);
		System.out.println(listaContatos.pesquisarPorNome("Emanoel Dornelas"));
				
	}

}
