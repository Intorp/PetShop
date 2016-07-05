package produto;

public class FormatadorProduto {
	
	public final static String mDelimitador = "&";
	
	public String formatar(Produto produto){
		return produto.getCodigo()+mDelimitador+produto.getDescricao()+mDelimitador+produto.getTipo()+mDelimitador+produto.getPreco();
	}
	
	public Produto obterDaString(String linha){
		String campos[] = linha.split(mDelimitador);
		
		Produto produto = new Produto();
		produto.setCodigo(Integer.parseInt(campos[0]));
		produto.setDescricao(campos[1]);
		produto.setTipo(campos[2]);
		produto.setPreco(Double.parseDouble(campos[3]));
		return produto;
		/*}else{
			Animal animal = new Animal();
			animal.setCodigo(Integer.parseInt(campos[0]));
			animal.setDescricao(campos[1]);
			animal.setTipo(campos[2]);
			animal.setPreco(Double.parseDouble(campos[3]));
			animal.setIdade(Integer.parseInt(campos[4]));
			animal.setRaca(campos[5]);
			return animal;
		}*/
		
			
	}


}
