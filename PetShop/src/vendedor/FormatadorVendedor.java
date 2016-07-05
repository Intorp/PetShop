package vendedor;

import produto.Vendedor;

public class FormatadorVendedor {
	
	public final static String mDelimitador = "&";
	
	public String formatar(Vendedor vendedor){
		return vendedor.getCodigo()+mDelimitador+vendedor.getNome()+mDelimitador+vendedor.getVendas();
	}
	
	public Vendedor obterDaString(String linha){
		String campos[] = linha.split(mDelimitador);
		
		Vendedor vendedor = new Vendedor();
		
		vendedor.setCodigo(Integer.parseInt(campos[0]));
		vendedor.setNome(campos[1]);
		vendedor.setVendas(Double.parseDouble(campos[2]));
		
		
		return vendedor;
		
	}

}
