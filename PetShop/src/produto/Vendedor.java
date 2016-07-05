package produto;

public class Vendedor {
	
	protected int codigo;
	protected String nome;
	protected double vendas;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	@Override
	public String toString() {
        return "[Codigo:" + codigo + "Nome : " + nome + "Vendas: " + vendas + "]" ;
    }
    
	
    public String toString(String delimitador) {
        return codigo+delimitador+nome+delimitador+vendas;
    }
	

}
