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
		
		//clicar bot�o direita
		menu.clicarPorTexto("�");
		
		//verificar texto 'Chegar at� o fim'
		Assert.assertTrue(menu.existeElemetoPorTexto("Chegar at� o fim!"));
		
		//swipe esquerda
		menu.swipeLeft();
		
		//clicar bot�o esquerda
		menu.clicarPorTexto("�");
		
		//verificar texto 'a esquerda'
		Assert.assertTrue(menu.existeElemetoPorTexto("a esquerda"));
	}
}
