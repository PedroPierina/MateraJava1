package Imoveis;

public class Imovel {
	private String endereco;
	private double preco;

	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "endereco=" + endereco + ", preco=" + preco;
	}

	@Override
	public boolean equals(Object obj) {
		Imovel imovel = (Imovel) obj;
		return this.endereco.equals(imovel.getEndereco());
	}
	
	public int hashCode(){
		return getEndereco().length()*5;
	}

}
