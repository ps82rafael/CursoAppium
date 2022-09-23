package br.ps.rafael.appium.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.core.DriverFactory;
import br.ps.rafael.appium.page.FormularioPage;
import br.ps.rafael.appium.page.MenuPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest{
	

	private MenuPage menu = new MenuPage();
	private FormularioPage page = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();

	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		page.escreverNome("Rafael");
		assertEquals("Rafael", page.obterNome());
	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {
		page.selecionarCombo("Nintendo Switch");
		Assert.assertEquals("Nintendo Switch", page.obterValorCombo());

	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException {
		assertFalse(page.isCheckMarcado());
		assertTrue(page.isSwitchMarcado());

		
		page.clicarCheck();
		page.clicarSwitch();

		assertTrue(page.isCheckMarcado());
		assertFalse(page.isSwitchMarcado());

	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {
		page.escreverNome("Rafael");
		page.clicarCheck();
		page.clicarSwitch();
		page.selecionarCombo("Nintendo Switch");
		
		page.clicarSalvar();
		
		Assert.assertEquals("Nome: Rafael", page.obterNomeCadastrado());
		Assert.assertEquals("Console: switch", page.obterConsoleCadastrado());
		Assert.assertTrue(page.obterCheckboxCadastrado().endsWith("Off"));
		Assert.assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));

	}
	
	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		page.escreverNome("Rafael");
	
		
		page.clicarSalvarDemorado();
		//esperar(3000);
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Rafael']")));
		
		
		
		Assert.assertEquals("Nome: Rafael", page.obterNomeCadastrado());
		
	}
	
	@Test
	public void deveAlterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElemetoPorTexto("20/2/2000"));
		
		
	}
	
	@Test
	public void deveAlterarHora() {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElemetoPorTexto("10:40"));
		
	}
	
	@Test
	public void deveInteragirComSeeKbar() {
		//clicar no seekbar
		page.clicarSeeKBar(0.65);
		
		//salvar
		page.clicarSalvar();
		
		//obter o valor
		Assert.assertTrue(page.existeElemetoPorTexto("Slider: 65"));
	
		
	}
	
	
	
	
}
