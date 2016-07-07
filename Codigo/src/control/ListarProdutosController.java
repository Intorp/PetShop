package control;

import java.util.ArrayList;

import data.ProdutoDAO;
import model.Produto;
import view.ListarProdutosView;

public class ListarProdutosController {
	
	private ListarProdutosView mView;
	private ProdutoDAO mDao;
	//private Scanner mScanner;
	
	public ListarProdutosController(){
		mView = new ListarProdutosView();
		//mScanner = new Scanner(System.in);
	}
	
	public void executar(){
		mDao = new ProdutoDAO();
		ArrayList<Produto> produtos = mDao.obterTodos();
		
		if(produtos.isEmpty()){
			mView.exibirMensagemNaoHaProdutosCadastrados();
		}else{
			mView.exibirProdutos(produtos);
		}
		//mView.exibirMensagemDeProsseguir();
		//mScanner.nextLine();
	}
	

}
