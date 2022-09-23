package br.ps.rafael.appium.page;

import br.ps.rafael.appium.core.BasePage;

public class AbasPage extends BasePage {

	public boolean isAba1() {
		return existeElemetoPorTexto("Este é o conteúdo da Aba 1");
	}
	
	public boolean isAba2() {
		return existeElemetoPorTexto("Este é o conteúdo da Aba 2");
	}
	
	public void selecionarAba2() {
		clicarPorTexto("ABA 2");
		
	}
	
	

}
