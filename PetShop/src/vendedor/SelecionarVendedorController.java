package vendedor;

import java.util.Scanner;

import produto.Vendedor;

public class SelecionarVendedorController {
	
	private ListarVendedoresController listarVendedoresController;
	private Scanner mScanner;
	private VendedorDAO mDao;
	private SelecionarVendedorView selecionarVendedorView;
	private Vendedor selecionado;
	
	public SelecionarVendedorController(){
		listarVendedoresController = new ListarVendedoresController();
		selecionarVendedorView = new SelecionarVendedorView();
		mScanner = new Scanner(System.in);
		mDao = new VendedorDAO();
	}
	
	public Vendedor executar(){
		listarVendedoresController.executar();
		
		selecionarVendedorView.exibirMensagemDeSelecao();
		
		selecionado = mDao.obter(Integer.parseInt(mScanner.nextLine()));
		
		return selecionado;
		
	}

}
