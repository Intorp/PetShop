package vendedor;

import java.util.ArrayList;

import arquivo.GerenciadorArq;
import produto.Vendedor;

public class VendedorDAO {
	
	//DAO significa Data Acess Object
	
	public final static String mNomeDoArquivo = "Vendedor.txt";
	
	private GerenciadorArq mGerenciadorDeArquivo;
	private FormatadorVendedor mFormatador;
	
	public VendedorDAO(){
		mGerenciadorDeArquivo = new GerenciadorArq();
		mGerenciadorDeArquivo.inicializarArquivo(mNomeDoArquivo);
		mFormatador = new FormatadorVendedor();
	}
	
	private void inserir(Vendedor vendedor){
		mGerenciadorDeArquivo.adicionarLinhaNoFinalDoArquivo(mNomeDoArquivo, mFormatador.formatar(vendedor));
	}
	
	public void salvar(Vendedor vendedor){
		if(obter(vendedor.getCodigo()) != null){
			atualizar(vendedor);
		}else{
			inserir(vendedor);
		}
	}
	
	private void atualizar(Vendedor vendedor){
		mGerenciadorDeArquivo.atualizarLinha(mNomeDoArquivo, mFormatador.formatar(vendedor), obterPosicaoDoRegistroNoArquivo(vendedor.getCodigo()));
	}
	
	public void deletar(Vendedor vendedor){
		mGerenciadorDeArquivo.excluirLinha(mNomeDoArquivo, obterPosicaoDoRegistroNoArquivo(vendedor.getCodigo()));
	}
	
	public Vendedor obter(int codigo){
		
		Vendedor vendedor = null;
		
		for(Vendedor v: obterTodos()){
			if(v.getCodigo()==codigo){
				vendedor = v;
				break;
			}
		}
		
		return vendedor;
		
	}
	
	public int obterPosicaoDoRegistroNoArquivo(int codigo){
		
		int posicaoDoRegistro = -1;
		
		for(Vendedor v : obterTodos()){
			posicaoDoRegistro++;
			if(v.getCodigo() == codigo){
				break;
			}
		}
		
		return posicaoDoRegistro;
		
	}
	
	public ArrayList<Vendedor> obterTodos(){
		
		ArrayList<Vendedor> vendedores = new ArrayList<>();
		
		ArrayList<String> linhas = mGerenciadorDeArquivo.lerArquivoLinha(mNomeDoArquivo);
		
		for(String linha : linhas){
			vendedores.add(mFormatador.obterDaString(linha));
		}
		
		return vendedores;
		
	}
	
	public ArrayList<Vendedor> obteroTodosComONome(String nome){
		
		ArrayList<Vendedor> vendedores = new ArrayList<>();
		ArrayList<String> linhas = mGerenciadorDeArquivo.lerArquivoLinha(mNomeDoArquivo);
		
		for(String linha : linhas){
			Vendedor vendedor = mFormatador.obterDaString(linha);
			if(vendedor.getNome().contains(nome)){
				vendedores.add(vendedor);
			}
		}
		
		return vendedores;
		
	}
	

}
