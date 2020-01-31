package provaSicredi.navegador;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegadorChrome implements INavegador {

	private String chave; 
	private String caminho;
	private WebDriver driver;
	
	
	
	public NavegadorChrome(String chave, String caminho) {
		this.chave = chave;
		this.caminho = caminho;
		
		System.setProperty(chave,caminho);
		
		driver = new ChromeDriver();
	}

	@Override
	public String getChave() {
		// TODO Auto-generated method stub
		return chave;
	}

	@Override
	public String getCaminho() {
		// TODO Auto-generated method stub
		return caminho;
	}

	@Override
	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
