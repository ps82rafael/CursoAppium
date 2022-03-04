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
		
		//acessar Opção 1 para direita
		page.swipeElementRight("Opção 1");
		
		//clicar opção +
		//page.clicarPorTexto("(+)");
		page.clicarBotaoMais();
		
		//verificar op1+
		Assert.assertTrue(page.existeElemetoPorTexto("Opção 1 (+)"));
		
		//op4 para direita
		page.swipeElementRight("Opção 4");
		
		//op4 -
		page.clicarPorTexto("(-)");
		
		//verificar op4
		Assert.assertTrue(page.existeElemetoPorTexto("Opção 4 (-)"));
		
		
		//op5 para esquerda
		page.swipeElementLeft("Opção 5 (-)");
		
		
		//verificar op5
		Assert.assertTrue(page.existeElemetoPorTexto("Opção 5"));
		
		
	}
	
	
	

}
