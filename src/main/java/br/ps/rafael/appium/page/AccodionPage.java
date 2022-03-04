package br.ps.rafael.appium.page;

import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BasePage;

public class AccodionPage extends BasePage {

	public void selecionarOpcao1() {
		clicarPorTexto("Op��o 1");
	}

	public String obterValorOp1() {
		return obterTexte(By.xpath(
				"//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}

}
