package menu;

import java.util.Scanner;

import produto.CadastrarProdutoController;
import produto.ListarProdutosController;
import produto.Vendedor;
import produto.VenderProdutoController;

public class MenuVendaController {
	
	private MenuVendaView mView;
	private Scanner mScanner;
	
	public MenuVendaController(){
		mView = new MenuVendaView();
		mScanner = new Scanner(System.in);
	}
	
	public void executar(Vendedor vendedor){
		boolean sair = false;
		
		while(sair!=true){
			mView.opcoesVendas();
			
			String menu = mScanner.nextLine();
			
			if(opcaoFoiSelecionada(menu,"V")){
				VenderProdutoController venderProdutoController = new VenderProdutoController();
				venderProdutoController.executar(vendedor);
			}else if(opcaoFoiSelecionada(menu,"C")){
				CadastrarProdutoController cadastrarProdutoController = new CadastrarProdutoController();
				cadastrarProdutoController.executar();
			}else if(opcaoFoiSelecionada(menu,"L")){
				ListarProdutosController listarProdutosController = new ListarProdutosController();
				listarProdutosController.executar();
			}else if(opcaoFoiSelecionada(menu,"X")){
				sair = true;
			}else{
				System.out.println("Opcao invalida");
			}
			
		}
		
	}
	
	private boolean opcaoFoiSelecionada(String opcaoDigitada, String codigoDaOpcao){
		return opcaoDigitada != null && opcaoDigitada.equalsIgnoreCase(codigoDaOpcao);
	}

}
