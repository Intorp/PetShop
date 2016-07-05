package vendedor;

public class IncluirNovoVendedorView {
	
	public void exibirCabecalho(){
		System.out.println("|================================================|");
        System.out.println("|                NOVO VENDEDOR                   |");
        System.out.println("|================================================|");
        System.out.println("|                                                |");
	}
	
	public void exibirSolicitacaoDoCodigo(){
		System.out.println("|				Digite o código:		   		 |");
	}
	
	public void exibirSolicitacaoDoNome(){
		System.out.println("|				Digite o nome:					 |");
	}
	
	public void exibirMensagemDeVendedorCadastrado(){
		System.out.println("|================================================|");
		System.out.println("|      Novo Vendedor Cadastrado com Sucesso      |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeParaProsseguir(){
		System.out.println("|  Tecle ENTER para continuar                    |");
		System.out.println("|================================================|");
	}

}
