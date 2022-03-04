package br.ps.rafael.appium.test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;
import br.ps.rafael.appium.page.cliquesPage;

public class cliquesTeste extends BaseTest {
	private MenuPage menu = new MenuPage();
	private cliquesPage page = new cliquesPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarCliques();

	}
	
	
	@Test
	public void deveRealizarCliqueLogo() {
		//clique longo
		page.cliquelongo();
		
		//verificar texto
		Assert.assertEquals("Clique Longo", page.obterTextoCompo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo() {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		
		Assert.assertEquals("Duplo Clique", page.obterTextoCompo());
		
	}
	
	
	
	
	
	
	
	
}
