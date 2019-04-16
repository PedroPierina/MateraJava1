package Imoveis;

public class Main {
	public	static	void	main(String[]	args){
		 
		try{
			 Imovel imovel1 = new Imovel("rua1", 200);
			 Imovel imovel2 = new Imovel("rua2", 220);
			 Imovel imovel3 = new Imovel("rua3", 290);
			 Imovel imovel4 = new Imovel("rua4", 300);
			 Imovel imovel5 = new Imovel("rua5", 400);
			 Imovel imovel6 = new Imovel("rua6", 550);
			 Imovel imovel7 = new Imovel("rua7", 666);
			 Imovel imovel8 = new Imovel("rua8", 100);
			 Imovel imovel9 = new Imovel("rua9", 800);
			 Imovel imovel10 = new Imovel("rua10", 990);
		
		}catch(ValorNullOuValorNegativoException e){
			System.out.println(e.getMessage());
		}
		
		 
	}

}
