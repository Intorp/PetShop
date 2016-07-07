package model;

public class Animal extends Produto {
	
	//protected só pode ser acessado pelas classes do mesmo pacote
	//final determina que a variavel seja inicializada junto com o objeto e nao pode ser alterada depois

	
	protected int idade;
	protected String raca;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	//override faz com que o metodo abaixo substitua o metodo da superclasse 
	@Override
	public String toString() {
        return "[Código : " + codigo + " Descricao: " + descricao + " Tipo: " + tipo +  " Preço Unitário : " + preco + "Idade : " + idade + "Raca: " + raca + "]" ;
    }
    
    public String toString(String delimitador) {
        return codigo+delimitador+descricao+delimitador+tipo+delimitador+preco+delimitador+idade+delimitador+raca;
    }

}
