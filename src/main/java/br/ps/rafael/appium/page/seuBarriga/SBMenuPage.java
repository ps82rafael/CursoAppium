package br.ps.rafael.appium.page.seuBarriga;

import br.ps.rafael.appium.core.BasePage;

public class SBMenuPage extends BasePage {
	
	public void acessarContas() {
		clicarPorTexto("CONTAS");
		
	}
	
	public void acessrMovimentacoes() {
		clicarPorTexto("MOV...");
	}
	
	
}
