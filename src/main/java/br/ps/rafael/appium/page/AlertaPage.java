package br.ps.rafael.appium.page;

import br.ps.rafael.appium.core.BasePage;

public class AlertaPage extends BasePage {
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	
	public void clicarConfirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void clicarSair() {
		clicarPorTexto("SAIR");
	}
	
	public void clicarForaCaixa() {
		tap(100, 150);
	}
	

	
	
	
	

}
