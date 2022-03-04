package br.ps.rafael.appium.test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;
import br.ps.rafael.appium.page.seuBarriga.SBContasPage;
import br.ps.rafael.appium.page.seuBarriga.SBLoginPage;
import br.ps.rafael.appium.page.seuBarriga.SBMenuPage;

public class SBTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private SBLoginPage login = new SBLoginPage();
	private SBMenuPage menuSB = new SBMenuPage();
	private SBContasPage contas = new SBContasPage();

	@Before
	public void setup() {
		menu.acessarSeuBarrigaNativo();
		login.setMail("a@a");
		login.setSenha("a");
		login.entrar();
	}

	@Test
	public void deveInteragirSeuBarrigaNativo() {
		menuSB.acessarContas();
		contas.setConta("18053013");
		contas.salvar();
		Assert.assertTrue(contas.existeElemetoPorTexto("Conta adicionada com sucesso"));

	}
	
	@Test
	public void deveExcluirConta() {
		//entrar em contas
		menuSB.acessarContas();
		
		//clique longo na conta
		contas.selecionarContas("18053013");
		
		//Excluir
		contas.excluir();
		
		//verificar mensagem
		Assert.assertTrue(contas.existeElemetoPorTexto("Conta excluída com sucesso"));

	}
	
	public void deveValidarInclisaoMov() {
		menuSB.acessrMovimentacoes();
		
		//V
		
		
		
	}
	
	
}