package br.ps.rafael.appium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;

public class SwinpeTest extends BaseTest {
	
	private MenuPage  menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		//acessar menu
		menu.acessarSwipe();
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElemetoPorTexto("a esquerda"));
		
		//swipe para direita
		menu.swipeRight();
		
		//verificar texto 'E vejo se'
		Assert.assertTrue(menu.existeElemetoPorTexto("E veja se"));
		
		//clicar botão direita
		menu.clicarPorTexto("›");
		
		//verificar texto 'Chegar até o fim'
		Assert.assertTrue(menu.existeElemetoPorTexto("Chegar até o fim!"));
		
		//swipe esquerda
		menu.swipeLeft();
		
		//clicar botão esquerda
		menu.clicarPorTexto("‹");
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElemetoPorTexto("a esquerda"));
	}
}
