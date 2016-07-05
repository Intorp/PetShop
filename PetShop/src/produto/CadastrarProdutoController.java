package produto;

import java.util.Scanner;

public class CadastrarProdutoController {
	
	private CadastrarProdutoView mView;
	private Scanner mScanner;
	private ProdutoDAO mDao;
	
	public CadastrarProdutoController(){
		mView = new CadastrarProdutoView();
		mScanner = new Scanner(System.in);
		mDao = new ProdutoDAO();
	}
	
	public void executar(){
		
		Produto produto = new Produto();
		
		mView.exibirCabecalho();
		
		mView.exibirSolicitacaoDoCodigo();
		produto.setCodigo(Integer.parseInt(mScanner.nextLine()));
		
		mView.exibirSolicitacaoDaDescricao();
		produto.setDescricao(mScanner.nextLine());		
		
		mView.exibirSolicitacaoDoTipo();
		produto.setTipo(mScanner.nextLine());		
		
		mView.exibirSolicitacaoDoPreco();
		produto.setPreco(Double.parseDouble(mScanner.nextLine()));
		
		mDao.salvar(produto);
		
		mView.exibirMensagemDeProdutoCadastrado();
		mView.exibirMensagemDeParaProsseguir();
		
		mScanner.nextLine();	
		
	}
	
	

}
