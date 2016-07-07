package data;

import model.Animal;
import model.Produto;

public class FormatadorProduto {
	
	public final static String mDelimitador = "&";
	
	public String formatar(Produto produto){
		if(produto instanceof Animal){
			return produto.getCodigo()+mDelimitador+produto.getDescricao()+mDelimitador+produto.getTipo()+mDelimitador+produto.getPreco()+mDelimitador+((Animal) produto).getIdade()+mDelimitador+((Animal) produto).getRaca();
		}else{
			return produto.getCodigo()+mDelimitador+produto.getDescricao()+mDelimitador+produto.getTipo()+mDelimitador+produto.getPreco();
		}
	}
	
	public Produto obterDaString(String linha){
		String campos[] = linha.split(mDelimitador);
		
		if(campos.length == 4){
			Produto produto = new Produto();
			produto.setCodigo(Integer.parseInt(campos[0]));
			produto.setDescricao(campos[1]);
			produto.setTipo(campos[2]);
			produto.setPreco(Double.parseDouble(campos[3]));
			return produto;
		}else{
			Animal animal = new Animal();
			animal.setCodigo(Integer.parseInt(campos[0]));
			animal.setDescricao(campos[1]);
			animal.setTipo(campos[2]);
			animal.setPreco(Double.parseDouble(campos[3]));
			animal.setIdade(Integer.parseInt(campos[4]));
			animal.setRaca(campos[5]);
			return animal;
		}
		
			
	}


}
