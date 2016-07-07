package control;

import java.util.Scanner;

import data.VendedorDAO;
import model.Vendedor;
import view.IncluirNovoVendedorView;

public class IncluirNovoVendedorController {
	
	private IncluirNovoVendedorView mView;
	private Scanner mScanner;
	private VendedorDAO mDao;
	
	public IncluirNovoVendedorController(){
		mView = new IncluirNovoVendedorView();
		mScanner = new Scanner(System.in);
		mDao = new VendedorDAO();
	}
	
	public void executar(){
		
		Vendedor vendedor = new Vendedor();
		
		mView.exibirCabecalho();
		
		mView.exibirSolicitacaoDoCodigo();
		vendedor.setCodigo(Integer.parseInt(mScanner.nextLine()));
		
		mView.exibirSolicitacaoDoNome();
		vendedor.setNome(mScanner.nextLine());
		
		vendedor.setVendas(0);
		
		mDao.salvar(vendedor);
		
		mView.exibirMensagemDeVendedorCadastrado();
		mView.exibirMensagemDeParaProsseguir();
		
		mScanner.nextLine();
		
	}
	

}
