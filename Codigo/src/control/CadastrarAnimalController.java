package control;

import java.util.Scanner;

import data.ProdutoDAO;
import model.Animal;
import view.CadastrarAnimalView;

public class CadastrarAnimalController {
	
	private CadastrarAnimalView mView;
	private Scanner mScanner;
	private ProdutoDAO mDao;
	
	public CadastrarAnimalController(){
		mView = new CadastrarAnimalView();
		mScanner = new Scanner(System.in);
		mDao = new ProdutoDAO();
	}
	
	public void executar(){
		
		Animal animal = new Animal();
		
		mView.exibirCabecalho();
		
		mView.exibirSolicitacaoDoCodigo();
		animal.setCodigo(Integer.parseInt(mScanner.nextLine()));
		
		mView.exibirSolicitacaoDaDescricao();
		animal.setDescricao(mScanner.nextLine());		
		
		mView.exibirSolicitacaoDoTipo();
		animal.setTipo(mScanner.nextLine());		
		
		mView.exibirSolicitacaoDoPreco();
		animal.setPreco(Double.parseDouble(mScanner.nextLine()));
		
		mView.exibirSolicitacaoDaRaca();
		animal.setRaca(mScanner.nextLine());
		
		mView.exibirSolicitacaoDaIdade();
		animal.setIdade(Integer.parseInt(mScanner.nextLine()));
		
		mDao.salvar(animal);
		
		mView.exibirMensagemDeAnimalCadastrado();
		mView.exibirMensagemDeParaProsseguir();
		
		mScanner.nextLine();	
		
	}

}
