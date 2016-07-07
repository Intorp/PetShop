package view;

import model.Vendedor;

public class ExibirVendedorView {
	
	public void solicitarCodigoVendedorExibir(){
		
		System.out.println("|================================================|");
        System.out.println("|                   VENDEDOR                     |");
        System.out.println("|================================================|");
        System.out.println("|  Informe o código do vendedor 		         |");
        System.out.println("|  que deseja visualizar:						 |");
		
	}
	
	public void exibirVendedor(Vendedor vendedor){
		System.out.println("|================================================|");
		System.out.println("|                   VENDEDOR                     |");
		System.out.println("|================================================|");
		System.out.println("|												 |");
		System.out.println("| Código : " + vendedor.getCodigo() + "|");
		System.out.println("| Nome: " + vendedor.getNome() + "|");
		System.out.println("| Vendas: " + vendedor.getVendas() + "|");
		System.out.println("|												 |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemTurmaComCodigoInformadoNaoExiste(int codigo){
		System.out.println("|================================================|");
		System.out.println("| Não exite vendedor com o código : " + codigo + "|");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeParaProsseguir(){
		System.out.println("|  Tecle ENTER para prosseguir					 |");
		System.out.println("|================================================|");
	}

}
