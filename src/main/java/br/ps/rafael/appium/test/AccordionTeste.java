package br.ps.rafael.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.AccodionPage;
import br.ps.rafael.appium.page.MenuPage;

public class AccordionTeste extends BaseTest {
	
	MenuPage menu = new MenuPage();
	AccodionPage page = new AccodionPage();
	
	
	@Test
	public void deveInteragirComAccordion() {
		//acessar menu
		menu.acessarAccordion();
		
		//acessar op��o 1
		page.selecionarOpcao1();
		
		//validar mensagem
		esperar(2000);
	//	Assert.assertEquals("Esta � a descri��o da op��o 1", page.obterValorOp1());
		Assert.assertTrue(page.existeElemetoPorTexto("Esta � a descri��o da op��o 1"));
		
	}
	
	
}
