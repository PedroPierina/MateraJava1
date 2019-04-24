package com.matera.imoveis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// try {
		// Imovel imovel1 = new Velho("rua1", 500);
		// Imovel imovel2 = new Novo("rua2", 220);
		// Imovel imovel3 = new Novo("rua3", 290);
		// Imovel imovel4 = new Velho("rua4", 300);
		// Imovel imovel5 = new Novo("rua5", 400);
		// Imovel imovel6 = new Velho("rua6", 550);
		// Imovel imovel7 = new Velho("rua7", 666);
		// Imovel imovel8 = new Velho("rua8", 100);
		// Imovel imovel9 = new Novo("rua9", 800);
		// Imovel imovel10 = new Novo("rua10", 990);
		//
		// } catch (ValorNullOuValorNegativoException e) {
		// System.out.println(e.getMessage());
		// }

		Imovel imovel1 = new Velho("ruaA", 500.00);
		Imovel imovel2 = new Novo("ruaB", 220.00);
		Imovel imovel3 = new Novo("ruaA", 290.00);
		Imovel imovel4 = new Velho("ruaC", 300.00);
		Imovel imovel5 = new Novo("rua5", 400.00);
		Imovel imovel6 = new Velho("rua5", 550.00);
		Imovel imovel7 = new Velho("rua7", 666.00);
		Imovel imovel8 = new Velho("rua8", 100.00);
		Imovel imovel9 = new Novo("rua1", 800.00);
		Imovel imovel10 = new Novo("rua10", 990.00);

		Map<Integer, Imovel> mapaDeImoveis = new HashMap<>();

		mapaDeImoveis.put(1, imovel1);
		mapaDeImoveis.put(2, imovel2);
		mapaDeImoveis.put(3, imovel3);

		System.out.println("--------------Teste de HashMap--------------");
		System.out.println(mapaDeImoveis.containsKey(4));

		Imovel info = mapaDeImoveis.get(3);

		System.out.println(info.toString());

		// Array de imoveis atribuindo os imoveis criados acima
		System.out.println("---------------Teste de Array---------------");
		Imovel[] imoveis = new Imovel[10];
		imoveis[0] = imovel1;
		imoveis[1] = imovel2;
		imoveis[2] = imovel3;
		imoveis[3] = imovel4;
		imoveis[4] = imovel5;
		imoveis[5] = imovel6;
		imoveis[6] = imovel7;
		imoveis[7] = imovel8;
		imoveis[8] = imovel9;
		imoveis[9] = imovel10;

		// Arrays.sort(imoveis);
		// System.out.println(Arrays.toString(imoveis));

		// ArrayList de imoveis, atribuindo os imoveis criados e fazendo sort
		System.out.println("-------------Teste de ArrayList-------------");
		ArrayList imoveisList = new ArrayList();
		imoveisList.add(imovel1);
		imoveisList.add(imovel2);
		imoveisList.add(imovel3);
		imoveisList.add(imovel4);
		imoveisList.add(imovel5);
		imoveisList.add(imovel6);
		imoveisList.add(imovel7);
		imoveisList.add(imovel8);
		imoveisList.add(imovel9);
		imoveisList.add(imovel10);

		Collections.sort(imoveisList);
		System.out.println(imoveisList);
	}

}
