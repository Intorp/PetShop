package data;

import java.util.ArrayList;

import model.Produto;

public class ProdutoDAO {
	
public final static String mNomeDoArquivo = "Produtos.txt";
	
	private GerenciadorArq mGerenciadorDeArquivo;
	private FormatadorProduto mFormatador;
	
	public ProdutoDAO(){
		mGerenciadorDeArquivo = new GerenciadorArq();
		mGerenciadorDeArquivo.inicializarArquivo(mNomeDoArquivo);
		mFormatador = new FormatadorProduto();
	}
	
	private void inserir(Produto produto){
		mGerenciadorDeArquivo.adicionarLinhaNoFinalDoArquivo(mNomeDoArquivo, mFormatador.formatar(produto));
	}
	
	public void salvar(Produto produto){
		if(obter(produto.getCodigo()) != null){
			atualizar(produto);
		}else{
			inserir(produto);
		}
	}
	
	public void atualizar(Produto produto){
		mGerenciadorDeArquivo.atualizarLinha(mNomeDoArquivo, mFormatador.formatar(produto), obterPosicaoDoRegistroNoArquivo(produto.getCodigo()));
	}
	
	public void deletar(Produto produto){
		mGerenciadorDeArquivo.excluirLinha(mNomeDoArquivo, obterPosicaoDoRegistroNoArquivo(produto.getCodigo()));
	}
	
	
	public Produto obter(int codigo){
		
		Produto produto = null;
		
		for(Produto p : obterTodos()){
			if(p.getCodigo()==codigo){
				produto = p;
				break;
			}
		}
		
		return produto;
		
	}
	
	public int obterPosicaoDoRegistroNoArquivo(int codigo){
		
		int posicaoDoRegistro = -1;
		
		for(Produto p : obterTodos()){
			posicaoDoRegistro++;
			if(p.getCodigo() == codigo){
				break;
			}
		}
		
		return posicaoDoRegistro;
		
	}
	
	public ArrayList<Produto> obterTodos(){
		
		ArrayList<Produto> produtos = new ArrayList<>();
		ArrayList<String> linhas = mGerenciadorDeArquivo.lerArquivoLinha(mNomeDoArquivo);
		
		for(String linha : linhas){
			produtos.add(mFormatador.obterDaString(linha));
		}
				
		return produtos;
		
	}

}
