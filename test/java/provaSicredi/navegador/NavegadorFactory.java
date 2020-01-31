package provaSicredi.navegador;

public class NavegadorFactory {

	public static INavegador fabricarNavegador(OpcoesNavegadores opcao) {
	   
		INavegador navegador = null;
		
		switch (opcao) {
	       case chrome:
	    	   navegador = new NavegadorChrome("webdriver.chrome.driver"
		   	                                  ,"C:/Projetos/Profissional/SeleniumConfigs/chromedriver/chromedriver.exe");
		       break;
		}
		return navegador;
    }
}
