package com.matera.imoveis;

import org.junit.Assert;
import org.junit.Test;

public class ImovelTest {

	
	@Test
	public void testCompareToEnderecosIguaisEValorDiferentes(){
		Imovel imovel1 = new Imovel("rua1", 1.00);
		Imovel imovel2 = new Imovel("rua1", 2.00);
		
		Assert.assertEquals(-1, imovel1.compareTo(imovel2));
	}
	
	// Ta errado o teste.
	@Test
	public void testCompareToEnderecosDiferentesEValorDiferentes(){
		Imovel imovel1 = new Imovel("rua apolonio", 1.00);
		Imovel imovel2 = new Imovel("rua ze carlos", 2.00);
		
		Assert.assertEquals(-1, imovel1.compareTo(imovel2));
	}
	
}
