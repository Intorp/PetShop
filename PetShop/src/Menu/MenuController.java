package menu;

import java.util.Scanner;

import produto.Vendedor;
import vendedor.IncluirNovoVendedorController;
import vendedor.ListarVendedoresController;
import vendedor.SelecionarVendedorController;

public class MenuController {
	
	private MenuView mView;
	private Scanner mScanner;
	
	public MenuController (){
		mView = new MenuView();
		mScanner = new Scanner(System.in);
	}
	
	public void executar(){
		boolean sair = false;
		
		while(!sair){
			mView.opcoesVendedores();
			
			String menu = mScanner.nextLine();
			
			if(opcaoFoiSelecionada(menu,"S")){
				Vendedor vendedor = new Vendedor();
				SelecionarVendedorController selecionarVendedorController = new SelecionarVendedorController();
				vendedor = selecionarVendedorController.executar();
				System.out.println(vendedor.getNome());
				MenuVendaController menuVendaController = new MenuVendaController();
				menuVendaController.executar(vendedor);				
			}else if(opcaoFoiSelecionada(menu,"L")){
				ListarVendedoresController listarVendedoresController = new ListarVendedoresController();
				listarVendedoresController.executar();
			}else if(opcaoFoiSelecionada(menu,"C")){
				IncluirNovoVendedorController incluirNovoVendedorController = new IncluirNovoVendedorController();
				incluirNovoVendedorController.executar();
			}else if(opcaoFoiSelecionada(menu,"X")){
				sair = true;
			}

		}
		
	}
	

	private boolean opcaoFoiSelecionada(String opcaoDigitada, String codigoDaOpcao){
		return opcaoDigitada != null && opcaoDigitada.equalsIgnoreCase(codigoDaOpcao);
	}
	
	
}
