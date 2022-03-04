package br.ps.rafael.appium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;
import br.ps.rafael.appium.page.SplashPage;

public class SplashTeste extends BaseTest {
	
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();
	
		
	@Before
	public void setup() {
		//acessar menu aplash
		menu.acessarSplash();
				
	}
	
	
	@Test
	public void deveAguardarSplashSumir() {
		//verificar que o splash esta sendo exibido
		page.isTelaSplashVisivel();
		
		//aguardar saida do splash
		page.aguardandoSplashSumir();
		
		
		//verificar que o furmulario esta aparecendo
		Assert.assertTrue(page.existeElemetoPorTexto("Formulário"));
	}

}
