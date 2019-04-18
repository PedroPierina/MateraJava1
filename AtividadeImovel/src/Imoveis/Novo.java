package Imoveis;

public class Novo extends Imovel {
	
	public Novo(String endereco, double preco){
		super(endereco, preco);
		setEndereco(verificaStringNull(endereco));
		setPreco(precoAddicional(preco));
	}
	
	private double precoAddicional(double valor){
		if(valor < 0 || valor == 0){
			throw new ValorNullOuValorNegativoException ("Valor negativo ou nulo, insira um novo valor");
		}else{
			valor = valor * 1.10;
			return valor;
		}
	}
	
	
}
