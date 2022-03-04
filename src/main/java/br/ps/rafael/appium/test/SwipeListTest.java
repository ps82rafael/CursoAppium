package br.ps.rafael.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;
import br.ps.rafael.appium.page.SwipeListPage;

public class SwipeListTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page = new SwipeListPage();	
	
	@Test
	public void deveRealizarSwipeList() {
		//menu
		menu.scrollDown();
		menu.acessarSwipeList();
		
		//acessar Op��o 1 para direita
		page.swipeElementRight("Op��o 1");
		
		//clicar op��o +
		//page.clicarPorTexto("(+)");
		page.clicarBotaoMais();
		
		//verificar op1+
		Assert.assertTrue(page.existeElemetoPorTexto("Op��o 1 (+)"));
		
		//op4 para direita
		page.swipeElementRight("Op��o 4");
		
		//op4 -
		page.clicarPorTexto("(-)");
		
		//verificar op4
		Assert.assertTrue(page.existeElemetoPorTexto("Op��o 4 (-)"));
		
		
		//op5 para esquerda
		page.swipeElementLeft("Op��o 5 (-)");
		
		
		//verificar op5
		Assert.assertTrue(page.existeElemetoPorTexto("Op��o 5"));
		
		
	}
	
	
	

}
