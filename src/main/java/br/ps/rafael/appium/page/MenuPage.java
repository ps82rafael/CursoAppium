package br.ps.rafael.appium.page;

import static br.ps.rafael.appium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ps.rafael.appium.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarFormulario() {
		clicarPorTexto("Formulário");

	}

	public void acessarSplash() {
		clicarPorTexto("Splash");
	}

	public void acessarAlertas() {
		clicarPorTexto("Alertas");

	}

	public void acessarAbas() {
		clicarPorTexto("Abas");
	}

	public void acessarAccordion() {
		clicarPorTexto("Accordion");
	}

	public void acessarCliques() {
		clicarPorTexto("Cliques");
	}

	public void acessarSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSeuBarrigaHíbrido() {
		clicarPorTexto("SeuBarriga Híbrido");
	}

	public void acessarSwipeList() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		//menu.scroll(0.9, 0.1);
		scrollDown();
		clicarPorTexto("Swipe List");
	}

	public void acessarDragAndDrop() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
		//menu.scroll(0.9, 0.1);
		scrollDown();
		clicarPorTexto("Drag and drop");
	}
	
	public void acessarSeuBarrigaNativo() {
		clicarPorTexto("SeuBarriga Nativo");
	}

}
