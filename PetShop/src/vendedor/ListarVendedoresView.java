package vendedor;

import java.util.ArrayList;

import produto.Vendedor;

public class ListarVendedoresView {
	
	public void exibirVendedores(ArrayList<Vendedor> vendedores){
		System.out.println("|================================================|");
		System.out.println("|				LISTA DE VENDEDORES	   		 	 |");
		System.out.println("|================================================|");
		System.out.println("|												 |");
		System.out.println("| 		Código	|  Nome	| Venda |		  		 |");
		for(Vendedor v : vendedores){
			System.out.println("| " + v.getCodigo() + " | " + v.getNome()+ " | " + v.getVendas());
		}
		
	}
	
	public void exibirMensagemNaoHaVendedoresCadastrados(){
		System.out.println("|		Não existem vendedores cadastrados		 |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeProsseguir(){
		System.out.println("|  		Tecle ENTER para prosseguir				 |");
		System.out.println("|================================================|");
	}

}