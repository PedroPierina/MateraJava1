package Imoveis;

import java.text.DecimalFormat;
import java.util.Comparator;

public class Imovel implements Comparable<Imovel>{
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
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return "endereco=" + endereco + ", preco=" + numberFormat.format(getPreco()) + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		Imovel imovel = (Imovel) obj;
		return this.endereco.equals(imovel.getEndereco());
	}
	
	@Override
	public int hashCode(){
		return getEndereco().length()*5;
	}
	
	public int compareTo(Imovel other){
		if(this.preco < other.preco){
			return -1;
		}else{
			if(this.preco > other.preco){
				return 1;
			}else{
				return 0;
			}
		}
		
	}

}
