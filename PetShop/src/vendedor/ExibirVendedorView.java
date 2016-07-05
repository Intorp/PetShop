package vendedor;

import produto.Vendedor;

public class ExibirVendedorView {
	
	public void solicitarCodigoVendedorExibir(){
		
		System.out.println("|================================================|");
        System.out.println("|                   VENDEDOR                     |");
        System.out.println("|================================================|");
        System.out.println("|  Informe o c�digo do vendedor 		         |");
        System.out.println("|  que deseja visualizar:						 |");
		
	}
	
	public void exibirVendedor(Vendedor vendedor){
		System.out.println("|================================================|");
		System.out.println("|                   VENDEDOR                     |");
		System.out.println("|================================================|");
		System.out.println("|												 |");
		System.out.println("| C�digo : " + vendedor.getCodigo() + "|");
		System.out.println("| Nome: " + vendedor.getNome() + "|");
		System.out.println("| Vendas: " + vendedor.getVendas() + "|");
		System.out.println("|												 |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemTurmaComCodigoInformadoNaoExiste(int codigo){
		System.out.println("|================================================|");
		System.out.println("| N�o exite vendedor com o c�digo : " + codigo + "|");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeParaProsseguir(){
		System.out.println("|  Tecle ENTER para prosseguir					 |");
		System.out.println("|================================================|");
	}

}
