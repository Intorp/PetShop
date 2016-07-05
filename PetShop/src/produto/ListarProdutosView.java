package produto;

import java.util.ArrayList;

public class ListarProdutosView {

		public void exibirProdutos(ArrayList<Produto> produto){
		System.out.println("|====================================================|");
		System.out.println("|				LISTA DE PRODUTOS	   		 		 |");
		System.out.println("|====================================================|");
		System.out.println("|												 	 |");
		System.out.println("| Código | Descricao | Tipo | Preco | Idade | Raca	 |");
		for(Produto p : produto){
			System.out.println("| " + p.getCodigo() + " | " + p.getDescricao() +" | " + p.getTipo() + " | " + p.getPreco() + " |");
			if(p instanceof Animal){
				System.out.println("| " + p.getCodigo() + " | " + p.getDescricao() +" | " + p.getTipo() + " | " + p.getPreco() + " | " + ((Animal) p).getIdade() + " | " + ((Animal) p).getRaca() + " |");
			}
		}
		
	}
	
	public void exibirMensagemNaoHaProdutosCadastrados(){
		System.out.println("|		Não existem produtos cadastrados		 |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeProsseguir(){
		System.out.println("|  		Tecle ENTER para prosseguir				 |");
		System.out.println("|================================================|");
	}

}
