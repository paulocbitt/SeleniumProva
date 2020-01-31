package provaSicredi.pagina;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaTemaBootstrap {
	private String versaoTexto = "bootstrap_theme_v4";
	private String versaoId = "switch-version-select";
	private String botaoAdicionarTextoLink = "Add Customer";
	
	private String pesquisaTexto = "Teste Sicredi";
	private String pesquisaXPATH = "//input[@name='search']";
	private String pesquisaBotaoXPATH = "//div[@class='floatR']/a";
	
	
	private String tabelaXPATH = "//input[@class='select-all-none']" ;//"//div[@class='scroll-if-required']/table/tr/td/div/input";
	private String botaoDeleteXPATH = "//div[@class='scroll-if-required']/table/thead/tr/td[@class='no-border-left ']";
    
	private String mensagemPopUpTexto = "Are you sure that you want to delete this 1 item?";
	private String mensagemConfimaDeleteTexto = "Your data has been successfully deleted from the database.";
	private String mensagemValidacaoCaminhoXPATH = "//p[@class='alert-delete-multiple-one']";
	private String mensagemConfimaDeleteCaminhoXPATH = "//div[@class='alert alert-success growl-animated animated bounceInDown']/span[@data-growl='message']";
    
	private String botaoConfirmaDeleteXPATH = "//div[@class='modal-footer']/button";
	
	
	public String getVersaoTexto() {
		return versaoTexto;
	}
	
	public String getVersaoId() {
		return versaoId;
	}
	
	public String getBotaoAdicionarTextoLink() {
		return botaoAdicionarTextoLink;
	}
	
	public String getPesquisaTexto() {
		return pesquisaTexto;
	}
	
	public String getPesquisaXPATH() {
		return pesquisaXPATH;
	}
	
	public String getPesquisaBotaoXPATH() {
		return pesquisaBotaoXPATH;
	}
	
	public String getTabelaXPATH() {
		return tabelaXPATH;
	}

	public String getBotaoDeleteXPATH() {
		return botaoDeleteXPATH;
	}

	public String getMensagemPopUpTexto() {
		return mensagemPopUpTexto;
	}

	public String getMensagemConfimaDeleteTexto() {
		return mensagemConfimaDeleteTexto;
	}

	public String getMensagemValidacaoCaminhoXPATH() {
		return mensagemValidacaoCaminhoXPATH;
	}

	public String getMensagemConfimaDeleteCaminhoXPATH() {
		return mensagemConfimaDeleteCaminhoXPATH;
	}

	public String getBotaoConfirmaDeleteXPATH() {
		return botaoConfirmaDeleteXPATH;
	}
	
	public void testeDesafio1(WebDriver driver) {
	    // 2. Mude o valor da combo Select version para "Bootstrap V4 Theme"
        Select selectVersion = new Select(driver.findElement(By.id(versaoId)));
        selectVersion.selectByValue(versaoTexto);
        
        // 3. Clique no botão Add Customer
        driver.findElement(By.linkText(botaoAdicionarTextoLink)).click();
	}
	
	
	/// DESAFIOS ///
	
	public void testeDesafio2(WebDriver driver) {
		
     // 2. Clique no ícone da lupa (pesquisa) e digite o conteúdo do Name (Teste Sicredi)
		driver.findElements(By.xpath(pesquisaBotaoXPATH)).get(2).click();
		
        // Espera o componente estar visível na tela //
        WebDriverWait wait = new WebDriverWait(driver, 2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pesquisaXPATH)));
        
        driver.findElement(By.xpath(pesquisaXPATH)).sendKeys(pesquisaTexto);
        driver.findElement(By.xpath(pesquisaXPATH)).sendKeys(Keys.ENTER);
        
     // 3. Clicar no checkbox abaixo da palavra Actions
        driver.findElement(By.xpath(tabelaXPATH)).click();
        
     // 4. Clicar no botão Delete
        driver.findElement(By.xpath(botaoDeleteXPATH)).click();
        
     // 5. Validar o texto "Are you sure that you want to delete this 1 item?" através de uma asserção para a popup que será apresentada
     
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mensagemValidacaoCaminhoXPATH)));
        String mensagemPopUp = driver.findElement(By.xpath(mensagemValidacaoCaminhoXPATH)).getText();
        
        Assert.assertTrue("Mensagem correta!", mensagemPopUp.contains(mensagemPopUpTexto));
        
     // 6. Clicar no botão Delete da popup
        driver.findElements(By.xpath(botaoConfirmaDeleteXPATH)).get(3).click();
        
     // 7. Aparecerá uma mensagem dentro de um box verde na parte superior direito da tela. Adicione uma asserção na mensagem "Your data has been successfully deleted from the database."
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mensagemConfimaDeleteCaminhoXPATH)));
        String mensagemConfimaDelete = driver.findElement(By.xpath(mensagemConfimaDeleteCaminhoXPATH)).getText();
        
        Assert.assertTrue("Mensagem correta!", mensagemConfimaDelete.contains(mensagemConfimaDeleteTexto));
	}

	
	
	
}
