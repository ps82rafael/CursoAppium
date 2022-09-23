package br.ps.rafael.appium.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;
import br.ps.rafael.appium.page.WebViewPage;

public class WebViewTeste extends BaseTest{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	
	
	@Test
	public void devefazerLogin() {
		//acessar o menu 
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
		page.entrarContextoWeb();
		
		//preencher email
		page.setEmail("ps.rafael@gmail.com");
		
		//senha
		page.setSenha("baratao");
		
		//entrar
		page.entrar();
		
		//verificar
		Assert.assertEquals("Bem vindo, Rafael!", page.getMensagem());
	}
	
	@After
	public void tearDown() {
		page.sairentrarContextoWeb();
		
	}

}
