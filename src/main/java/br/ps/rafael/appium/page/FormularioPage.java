package br.ps.rafael.appium.page;

import static br.ps.rafael.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BasePage;
import br.ps.rafael.appium.core.DriverFactory;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage{

	

	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}
	
	public String obterNome() {
		return obterTexte(MobileBy.AccessibilityId("nome"));
	}
	
	public void selecionarCombo(String valor) {
		selecionarCombo(MobileBy.AccessibilityId("console"), valor);
	}
	
	public String obterValorCombo() {
		return obterTexte(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public  void clicarCheck() {
		clicar(By.className("android.widget.CheckBox"));
		
	}
	
	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}
	
	public boolean isCheckMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox"));
	}
	
	
	public boolean  isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}

	
	public void clicarSeeKBar(double posicao) {
		int delta = 55;
		MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
		int y = seek.getLocation().y + (seek.getSize().height / 2);
		System.out.println(y);
		
		int xinicial = seek.getLocation().x + delta;
		int x = (int) ( xinicial + ((seek.getSize().width - 2 * delta) * posicao));
		System.out.println(x);
		
		tap(x, y);
		
	}
	
	public void clicarSalvar() {
		clicarPorTexto("SALVAR");
	}
	
	public void clicarSalvarDemorado() {
		clicarPorTexto("SALVAR DEMORADO");
	}
	
	
	public String obterNomeCadastrado() {
		return obterTexte(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));	
		
	}
	
	public String obterConsoleCadastrado() {
		return obterTexte(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
	}
	
	public String obterCheckboxCadastrado() {
		return obterTexte(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
	}
	
	public String obterSwitchCadastrado() {
		return obterTexte(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
	}
	


}
