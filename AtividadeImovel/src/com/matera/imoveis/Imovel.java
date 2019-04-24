package com.matera.imoveis;

import java.text.DecimalFormat;
import java.util.Comparator;

public class Imovel implements Comparable<Imovel> {
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

	public String verificaStringNull(String valor) {
		if (valor == null) {
			throw new ValorNullOuValorNegativoException("String nula, insira nova String");
		} else {
			this.setEndereco(valor);
			return this.getEndereco();
		}
	}

	@Override
	public String toString() {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		return "endereco=" + endereco + ", preco=" + numberFormat.format(getPreco()) + "\n";
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imovel other = (Imovel) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
			return false;
		return true;
	}

	@Override
	public int compareTo(Imovel o) {
		if (new String(this.endereco).compareTo(o.endereco) > 0) {
			return 1;
		} else {
			if (new String(this.endereco).compareTo(o.endereco) < 0) {
				return -1;
			} else {
				return new Double(this.preco).compareTo(o.getPreco());
			}
		}
	}

}
