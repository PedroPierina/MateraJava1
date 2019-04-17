package Imoveis;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {

//		try {
//			Imovel imovel1 = new Velho("rua1", 500);
//			Imovel imovel2 = new Novo("rua2", 220);
//			Imovel imovel3 = new Novo("rua3", 290);
//			Imovel imovel4 = new Velho("rua4", 300);
//			Imovel imovel5 = new Novo("rua5", 400);
//			Imovel imovel6 = new Velho("rua6", 550);
//			Imovel imovel7 = new Velho("rua7", 666);
//			Imovel imovel8 = new Velho("rua8", 100);
//			Imovel imovel9 = new Novo("rua9", 800);
//			Imovel imovel10 = new Novo("rua10", 990);
//
//		} catch (ValorNullOuValorNegativoException e) {
//			System.out.println(e.getMessage());
//		}
		
		Imovel imovel1 = new Velho("rua1", 500);
		Imovel imovel2 = new Novo("rua2", 220);
		Imovel imovel3 = new Novo("rua3", 290);
		Imovel imovel4 = new Velho("rua4", 300);
		Imovel imovel5 = new Novo("rua5", 400);
		Imovel imovel6 = new Velho("rua6", 550);
		Imovel imovel7 = new Velho("rua7", 666);
		Imovel imovel8 = new Velho("rua8", 100);
		Imovel imovel9 = new Novo("rua9", 800);
		Imovel imovel10 = new Novo("rua10", 990);
		
		Map<Integer, Imovel> mapaDeImoveis = new HashMap<>();
		
		mapaDeImoveis.put(1, imovel1);
		mapaDeImoveis.put(2, imovel2);
		mapaDeImoveis.put(3, imovel3);
		
		System.out.println(mapaDeImoveis.containsKey(4));
		
		Imovel info = mapaDeImoveis.get(3);
		
		System.out.println(info.toString());
		
	}

}
