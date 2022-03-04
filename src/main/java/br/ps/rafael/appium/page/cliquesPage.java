package br.ps.rafael.appium.page;

import org.openqa.selenium.By;

import br.ps.rafael.appium.core.BasePage;

public class cliquesPage extends BasePage {

	public void cliquelongo() {
		cliqueLongo(By.xpath("//*[@text='Clique Longo']"));
	}
	
	public String obterTextoCompo() {
		return obterTextoCampo();
		
	}

}
