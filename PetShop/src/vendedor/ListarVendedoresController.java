package vendedor;

import java.util.ArrayList;
import java.util.Scanner;

import produto.Vendedor;

public class ListarVendedoresController {
	
	private ListarVendedoresView mView;
	private VendedorDAO mDao;
	//private Scanner mScanner;
	
	public ListarVendedoresController(){
		mView = new ListarVendedoresView();
		//mScanner = new Scanner(System.in);
	}
	
	public void executar(){
		mDao = new VendedorDAO();
		ArrayList<Vendedor> vendedores = mDao.obterTodos();
		
		if(vendedores.isEmpty()){
			mView.exibirMensagemNaoHaVendedoresCadastrados();
		}else{
			mView.exibirVendedores(vendedores);
		}
		//mView.exibirMensagemDeProsseguir();
		//mScanner.nextLine();
	}
	
	

}
