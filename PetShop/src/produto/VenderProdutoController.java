package produto;

import java.util.Scanner;

import vendedor.VendedorDAO;

public class VenderProdutoController {
	
	private ListarProdutosController listarProdutosController;
	private Scanner mScanner;
	private ProdutoDAO mDao;
	private VendedorDAO vDao;
	private VenderProdutoView venderProdutoView;
	private Produto selecionado;
	
	public VenderProdutoController(){
		listarProdutosController = new ListarProdutosController();
		venderProdutoView = new VenderProdutoView();
		mScanner = new Scanner(System.in);
		mDao = new ProdutoDAO();
		vDao = new VendedorDAO();
	}
	
	public void executar(Vendedor vendedor){
		listarProdutosController.executar();
		
		venderProdutoView.exibirMensagemDeSelecao();
		
		selecionado = mDao.obter(Integer.parseInt(mScanner.nextLine()));
		
		double venda = vendedor.getVendas() + selecionado.getPreco();
		vendedor.setVendas(venda);
		vDao.salvar(vendedor);
		
		System.out.println(selecionado.getDescricao());
		
		mDao.deletar(selecionado);
		
		
		
	}

}
