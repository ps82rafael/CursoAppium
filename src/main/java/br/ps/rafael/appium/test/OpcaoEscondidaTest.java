package br.ps.rafael.appium.test;

import static br.ps.rafael.appium.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ps.rafael.appium.core.BaseTest;
import br.ps.rafael.appium.page.MenuPage;

public class OpcaoEscondidaTest extends BaseTest {
	
	MenuPage menu = new MenuPage();
	
	
	  @Test 
	  public void deveEncontrarOpcaoEscondida() {
	  //scroll down 
      WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
	  "//*[@text='Formul�rio']"))); menu.scroll(0.9, 0.1);
	  System.out.println("Come�ando");
	  
	  menu.scrollDown();
	  
	  //clicar menu 
	  menu.clicarPorTexto("Op��o bem escondida");
	  
	  //verificar mensagem 
	  assertEquals("Voc� achou essa op��o",menu.obterMensagemAlerta());
	  
	  //sair
	  menu.clicarPorTexto("OK");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  }
	 
}
