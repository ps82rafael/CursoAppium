package br.ps.rafael.appium.page.seuBarriga;

import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BasePage;

public class SBContasPage extends BasePage {

	public void setConta(String nome) {
		escrever(By.className("android.widget.EditText"), nome);
	}

	public void salvar() {
		clicarPorTexto("SALVAR");
	}
	
	public void selecionarContas(String conta) {
		cliqueLongo(By.xpath("//*[@text='"+conta+"']"));
	}
	
	public void excluir() {
		clicarPorTexto("EXCLUIR");
	}
}
