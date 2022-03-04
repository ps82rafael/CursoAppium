package br.ps.rafael.appium.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.core.DriverFactory;
import br.ps.rafael.appium.page.AlertaPage;
import br.ps.rafael.appium.page.MenuPage;

public class AlertTeste extends BaseTest {

	private MenuPage menu = new MenuPage();
	private AlertaPage page = new AlertaPage();

	@Before
	public void setup() {
		// acessar menu alerta
		menu.acessarAlertas();

	}

	@Test
	public void deveConfirmarAlerta() {

		// clicar em alerta confirm
		page.clicarAlertaConfirm();

		// verificar os textos
		Assert.assertEquals("Info", page.obterTituloAlerta());
		Assert.assertEquals("Confirma a operação?", page.obterMensagemAlerta());

		// confirmar alerta
		page.clicarConfirmar();

		// verificar nova mensagem
		esperar(1000);
		Assert.assertEquals("Confirmado", page.obterMensagemAlerta());

		// sair
		page.clicarSair();

	}
	
	@Test
	public void deveClicarForaAlerta() {
		//clicar alerta simples
		page.clicarAlertaSimples();
	
		//clicar fora da caixa
		esperar(1000);
		page.clicarForaCaixa();
		
		//verificar que a mensagem não está presente 
		Assert.assertFalse(page.existeElemetoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
		
	}

}
