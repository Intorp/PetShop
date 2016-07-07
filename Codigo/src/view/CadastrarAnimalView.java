package view;

public class CadastrarAnimalView {
	
	public void exibirCabecalho(){
		System.out.println("|================================================|");
        System.out.println("|                 NOVO ANIMAL                    |");
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
		System.out.println("|				Digite o tipo:					 |");
	}
	
	public void exibirSolicitacaoDoPreco(){
		System.out.println("|				Digite o preço:					 |");
	}
	
	public void exibirSolicitacaoDaRaca(){
		System.out.println("|				Digite a raça:					 |");
	}
	
	public void exibirSolicitacaoDaIdade(){
		System.out.println("|				Digite a idade:					 |");
	}
	
	public void exibirMensagemDeAnimalCadastrado(){
		System.out.println("|================================================|");
		System.out.println("|      Novo Animal Cadastrado com Sucesso        |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeParaProsseguir(){
		System.out.println("|  Tecle ENTER para continuar                    |");
		System.out.println("|================================================|");
	}

}
