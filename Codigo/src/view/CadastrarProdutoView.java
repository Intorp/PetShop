package view;

public class CadastrarProdutoView {
	
	public void exibirCabecalho(){
		System.out.println("|================================================|");
        System.out.println("|                 NOVO PRODUTO                   |");
        System.out.println("|================================================|");
        System.out.println("|                                                |");
	}
	
	public void exibirSolicitacaoDoCodigo(){
		System.out.println("|				Digite o código:		   		 |");
	}
	
	public void exibirSolicitacaoDaDescricao(){
		System.out.println("|				Digite o descricao:				 |");
	}
	
	public void exibirSolicitacaoDoTipo(){
		System.out.println("|				Digite o tipo:				 |");
	}
	
	public void exibirSolicitacaoDoPreco(){
		System.out.println("|				Digite o preço:				 |");
	}
	
	public void exibirMensagemDeProdutoCadastrado(){
		System.out.println("|================================================|");
		System.out.println("|      Novo Produto Cadastrado com Sucesso       |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeParaProsseguir(){
		System.out.println("|  Tecle ENTER para continuar                    |");
		System.out.println("|================================================|");
	}

}
