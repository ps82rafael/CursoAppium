package br.ps.rafael.appium.page;

import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BasePage;

public class AccodionPage extends BasePage {

	public void selecionarOpcao1() {
		clicarPorTexto("Opção 1");
	}

	public String obterValorOp1() {
		return obterTexte(By.xpath(
				"//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}

}
