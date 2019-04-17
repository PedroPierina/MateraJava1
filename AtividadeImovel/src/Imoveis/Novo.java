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
	
	private String verificaStringNull(String valor){
		if(valor == null){
			throw new ValorNullOuValorNegativoException("String nula, insira nova String");
		}else{
			this.setEndereco(valor);
			return this.getEndereco();
		}
	}
}
