package com.matera.imoveis;
import org.junit.Assert;
import org.junit.Test;

import com.matera.imoveis.*;

public class TesteNovo {
	@Test
	public void testPrecoAddicional(){
		Imovel imovel = new Novo("rua1", 500.00);
		
		Assert.assertEquals("rua1" , imovel.getEndereco());
		Assert.assertEquals(550,00, imovel.getPreco());
		
	}
}
