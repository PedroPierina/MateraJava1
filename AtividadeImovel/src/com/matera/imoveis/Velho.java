package com.matera.imoveis;

public class Velho extends Imovel {

	public Velho(String endereco, double preco) {
		super(endereco, preco);
		setEndereco(verificaStringNull(endereco));
		setPreco(desconto(preco));
		
	}

	private double desconto(double valor){
		if(valor < 0 || valor == 0){
			throw new ValorNullOuValorNegativoException ("Valor negativo ou nulo, insira um novo valor");
		}else{
			valor = valor * 0.90;
			return valor;
		}
	}
	
}
