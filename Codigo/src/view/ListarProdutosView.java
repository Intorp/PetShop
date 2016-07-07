package view;

import java.util.ArrayList;

import model.Animal;
import model.Produto;

public class ListarProdutosView {

		public void exibirProdutos(ArrayList<Produto> produto){
		System.out.println("|====================================================|");
		System.out.println("|				LISTA DE PRODUTOS	   		 		 |");
		System.out.println("|====================================================|");
		System.out.println("|												 	 |");
		System.out.println("| C�digo | Descricao | Tipo | Preco | Idade | Raca	 |");
		for(Produto p : produto){
			if(p instanceof Animal){
				System.out.println("| " + p.getCodigo() + " | " + p.getDescricao() +" | " + p.getTipo() + " | " + p.getPreco() + " | " + ((Animal) p).getIdade() + " | " + ((Animal) p).getRaca() + " |");
			}else{
				System.out.println("| " + p.getCodigo() + " | " + p.getDescricao() +" | " + p.getTipo() + " | " + p.getPreco() + " |");
			}
		}
		
	}
	
	public void exibirMensagemNaoHaProdutosCadastrados(){
		System.out.println("|		N�o existem produtos cadastrados		 |");
		System.out.println("|================================================|");
	}
	
	public void exibirMensagemDeProsseguir(){
		System.out.println("|  		Tecle ENTER para prosseguir				 |");
		System.out.println("|================================================|");
	}

}
