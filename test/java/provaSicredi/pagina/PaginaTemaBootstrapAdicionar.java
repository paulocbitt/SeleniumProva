package provaSicredi.pagina;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaginaTemaBootstrapAdicionar {
	private String nomeTexto = "Teste Sicredi";
	private String nomeId = "field-customerName";
    
    private String ultimoNomeTexto = "Teste";
	private String ultimoNomeId = "field-contactLastName";
    
    // • ContactFirstName: seu nome 
	private String contatoTexto = "Paulo Cezar";
	private String contatoId = "field-contactFirstName";
    
    // • Phone: 51 9999-9999 
	private String foneTexto = "5199999999";
	private String foneId = "field-phone";
    
    // • AddressLine1: Av Assis Brasil, 3970
	private String endereco1Texto = "Av Assis Brasil, 3970";
	private String endereco1Id = "field-addressLine1";
    
    // • AddressLine2: Torre D
	private String endereco2Texto = "Torre D";
	private String endereco2Id = "field-addressLine2";
    
    // • City: Porto Alegre
	private String cidadeTexto = "Porto Alegre";
	private String cidadeId = "field-city";
    
    // State: RS
	private String estadoTexto = "RS";
	private String estadoId = "field-state";
 
    // • PostalCode: 91000-000
	private String cepTexto = "91000000";
	private String cepId = "field-postalCode";
    
    // • Country: Brasil
	private String paisTexto = "Brasil";
	private String paisId = "field-country";

    
    // • from Employeer: Fixter
	private String empregadosTexto = "Fixter";
	private String empregadosId = "field_salesRepEmployeeNumber_chosen";
	private String empregadosCaminhoXPATH = "//div[@id='field_salesRepEmployeeNumber_chosen']/div/div/input";
    
    // • CreditLimit: 200
	private String limiteCreditoTexto = "200";
	private String limiteCreditoId = "field-creditLimit";
       
    // • botão Save
	private String botaoSalvarId = "form-button-save";
       
    // • mensagem "Your data has been successfully stored into the database."
    private String mensagemValidacaoTexto = "Your data has been successfully stored into the database.";
    private String mensagemValidacaoCaminhoXPATH = "//div[@id='report-success']";
    
    
    private String linkGoBackTexto = "Go back to list";
    
    
    
    
	public String getNomeTexto() {
		return nomeTexto;
	}
	public String getNomeId() {
		return nomeId;
	}
	public String getUltimoNomeTexto() {
		return ultimoNomeTexto;
	}
	public String getUltimoNomeId() {
		return ultimoNomeId;
	}
	public String getContatoTexto() {
		return contatoTexto;
	}
	public String getContatoId() {
		return contatoId;
	}
	public String getFoneTexto() {
		return foneTexto;
	}
	public String getFoneId() {
		return foneId;
	}
	public String getEndereco1Texto() {
		return endereco1Texto;
	}
	public String getEndereco1Id() {
		return endereco1Id;
	}
	public String getEndereco2Texto() {
		return endereco2Texto;
	}
	public String getEndereco2Id() {
		return endereco2Id;
	}
	public String getCidadeTexto() {
		return cidadeTexto;
	}
	public String getCidadeId() {
		return cidadeId;
	}
	public String getEstadoTexto() {
		return estadoTexto;
	}
	public String getEstadoId() {
		return estadoId;
	}
	public String getCepTexto() {
		return cepTexto;
	}
	public String getCepId() {
		return cepId;
	}
	public String getPaisTexto() {
		return paisTexto;
	}
	public String getPaisId() {
		return paisId;
	}
	public String getEmpregadosTexto() {
		return empregadosTexto;
	}
	public String getEmpregadosId() {
		return empregadosId;
	}
	public String getEmpregadosCaminhoXPATH() {
		return empregadosCaminhoXPATH;
	}
	public String getLimiteCreditoTexto() {
		return limiteCreditoTexto;
	}
	public String getLimiteCreditoId() {
		return limiteCreditoId;
	}
	public String getBotaoSalvarId() {
		return botaoSalvarId;
	}
	public String getMensagemValidacaoTexto() {
		return mensagemValidacaoTexto;
	}
	public String getMensagemValidacaoCaminhoXPATH() {
		return mensagemValidacaoCaminhoXPATH;
	}
    
	public String getLinkGoBackTexto() {
		return linkGoBackTexto;
	}
	
	/// DESAFIOS ///
	
	public void testeDesafio1(WebDriver driver) {

	     // 4. Preencha os campos do formulário com as seguintes informações:
	        // • Name: Teste Sicredi
	           driver.findElement(By.id(nomeId)).sendKeys(nomeTexto);
	        
	        // • Last name: Teste
	           driver.findElement(By.id(ultimoNomeId)).sendKeys(ultimoNomeTexto);
	        
	        // • ContactFirstName: seu nome 
	           driver.findElement(By.id(contatoId)).sendKeys(contatoTexto);
	        
	        // • Phone: 51 9999-9999 
	           driver.findElement(By.id(foneId)).sendKeys(foneTexto);
	        
	        // • AddressLine1: Av Assis Brasil, 3970
	           driver.findElement(By.id(endereco1Id)).sendKeys(endereco1Texto);
	        
	        // • AddressLine2: Torre D
	           driver.findElement(By.id(endereco2Id)).sendKeys(endereco2Texto);
	        
	        // • City: Porto Alegre
	           driver.findElement(By.id(cidadeId)).sendKeys(cidadeTexto);
	        
	        // State: RS
	           driver.findElement(By.id(estadoId)).sendKeys(estadoTexto);
	     
	        // • PostalCode: 91000-000
	           driver.findElement(By.id(cepId)).sendKeys(cepTexto);
	        
	        // • Country: Brasil
	           driver.findElement(By.id(paisId)).sendKeys(paisTexto);
	        
	        // • from Employeer: Fixter
	           driver.findElement(By.id(empregadosId)).click();
	           driver.findElement(By.xpath(empregadosCaminhoXPATH)).sendKeys(empregadosTexto);
	           driver.findElement(By.xpath(empregadosCaminhoXPATH)).sendKeys(Keys.RETURN);
	        
	        // • CreditLimit: 200
	           driver.findElement(By.id(limiteCreditoId)).sendKeys(limiteCreditoTexto);
	           
	     // 5. Clique no botão Save
	           driver.findElement(By.id(botaoSalvarId)).click();

	     // 6. Validar a mensagem "Your data has been successfully stored into the database." através de uma asserção
	           // Espera o componente estar visível na tela //
	           WebDriverWait wait = new WebDriverWait(driver, 2000);
	           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mensagemValidacaoCaminhoXPATH)));
	           
	           String mensagemValidacao = mensagemValidacaoTexto;
	           String mensagem = driver.findElement(By.xpath(mensagemValidacaoCaminhoXPATH)).getText();
	           
	           Assert.assertTrue("Mensagem correta!", mensagem.contains(mensagemValidacao));
	}
	

	public void testeDesafio2(WebDriver driver) {
		// 1. Clique no link Go back to list
        driver.findElement(By.linkText(linkGoBackTexto)).click();
        
	}
    
}
