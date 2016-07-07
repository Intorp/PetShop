package control;

import java.util.Scanner;

import data.VendedorDAO;
import model.Vendedor;
import view.ExibirVendedorView;

public class ExibirVendedorController {
	
	private Vendedor mVendedor;
	private VendedorDAO mDao;
	private ExibirVendedorView mView;
	private Scanner mScanner;
	
	public ExibirVendedorController(){
		mDao = new VendedorDAO();
		mView = new ExibirVendedorView();
		mScanner = new Scanner(System.in);
	}
	
	public void executar(){
		mView.solicitarCodigoVendedorExibir();
		int codigo = Integer.parseInt(mScanner.nextLine());
		
		mVendedor = mDao.obter(codigo);
		
		if(mVendedor == null){
			mView.exibirMensagemTurmaComCodigoInformadoNaoExiste(codigo);
			mView.exibirMensagemDeParaProsseguir();
			mScanner.nextLine();
		}else{
			mView.exibirVendedor(mVendedor);
			mView.exibirMensagemDeParaProsseguir();
			mScanner.nextLine();
		}
	}

}
