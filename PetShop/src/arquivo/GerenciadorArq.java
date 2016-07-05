package arquivo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorArq {
	
	public void inicializarArquivo(String nomeDoArquivo){
		
		try{
			
			//� criado um escritor de arquivo, ele somente escreve os dados passados
			//pelo buffer
			FileWriter fileWriter = new FileWriter(nomeDoArquivo, true);
			//Bufferiza os dados do usu�rio para serem salvos, � necess�rio repassar para
			//o Writer
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			//Adiciona "nada" para inicializar o arquivo
			bufferedWriter.write("");
			//Ambos s�o fechados para liberarem o arquivo
			bufferedWriter.close();
			fileWriter.close();
			
		}catch (Exception e){
			//Toda opera��o com arquivos � envolta em um Try Catch
			e.getStackTrace();
		}
		
	}
	
	public ArrayList<String> lerArquivoLinha(String nomeDoArquivo){
		
		//O m�todo universal para transformar um arquivo de texto em classes � utilizar
		//um ArrayList para separar os argumentos e recriar o objeto
		ArrayList<String> lista = new ArrayList<>();
		
		try{
			
			FileReader fileReader = new FileReader(nomeDoArquivo);
			Scanner scanner = new Scanner(fileReader);
			
			//� realizada a leitura enquanto houver um pr�ximo car�cter e ent�o � salva a
			//sua linha
			while(scanner.hasNext()){
				
				lista.add(scanner.nextLine());
				
			}
			
		}catch (FileNotFoundException e){
			System.out.println("O arquivo n�o foi encontrado!");
		}catch (Exception e){
			e.printStackTrace();
		}
		
		
		return lista;
	}
	
	public void adicionarLinhaNoFinalDoArquivo(String nomeDoArquivo, String linha){
		
		try{
			
			//O True indica que a linha ser� inserida no final do arquivo ao inves do come�o
			FileWriter fileWriter = new FileWriter(nomeDoArquivo, true);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(linha);
			bufferedWriter.newLine();
			
			bufferedWriter.close();
			fileWriter.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void escreverNoArquivo(String nomeDoArquivo, ArrayList<String> linhas){
		
		try{
			
			FileWriter fileWriter = new FileWriter(nomeDoArquivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			for(String linha: linhas){
				
				//Escreve todas as linhas do vetor
				bufferedWriter.write(linha);
				bufferedWriter.newLine();
				
			}
			
			//Primeiro � necess�rio fechar o bufferedWriter, pois ele utiliza o fileWriter
			bufferedWriter.close();
			fileWriter.close();
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void atualizarLinha(String nomeDoArquivo, String novaLinha, int posicaoDaLinha){
		
		ArrayList<String> arquivo = lerArquivoLinha(nomeDoArquivo);
		
		//� salvo em uma posi��o espec�fica, mantendo as outras intactas
		arquivo.set(posicaoDaLinha, novaLinha);
		
		escreverNoArquivo(nomeDoArquivo,arquivo);
	}
	
	public void excluirLinha(String nomeDoArquivo, int posicaoDaLinha){
		
		ArrayList<String> arquivo = lerArquivoLinha(nomeDoArquivo);
		arquivo.remove(posicaoDaLinha);
		
		escreverNoArquivo(nomeDoArquivo,arquivo);
		
	}

}
