package provaSicredi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import provaSicredi.navegador.INavegador;
import provaSicredi.navegador.NavegadorFactory;
import provaSicredi.navegador.OpcoesNavegadores;
import provaSicredi.pagina.PaginaTemaBootstrap;
import provaSicredi.pagina.PaginaTemaBootstrapAdicionar;

public class Desafio2Test {
	private WebDriver driver;
	private String siteUrl = "https://www.grocerycrud.com/demo/bootstrap_theme";
	private INavegador navegador;
	
	
	@Before
	public void setUp() throws Exception {
		navegador = NavegadorFactory.fabricarNavegador(OpcoesNavegadores.chrome);
		driver = navegador.getDriver();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();  // Fecha o browser
	}

	@Test
	public void test() {
		PaginaTemaBootstrap          pgTemaBootstrap = new PaginaTemaBootstrap();
		PaginaTemaBootstrapAdicionar pgTemaBootstrapAdicionar = new PaginaTemaBootstrapAdicionar();
		
        driver.get(siteUrl);
       driver.manage().window().maximize();
		
        // Executar Desafio 1 //
		pgTemaBootstrap.testeDesafio1(driver);
		pgTemaBootstrapAdicionar.testeDesafio1(driver);
		
		// Executar Desafio 2 //
	   pgTemaBootstrapAdicionar.testeDesafio2(driver);
       pgTemaBootstrap.testeDesafio2(driver);

	}

}
