package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	// Elementos Login
	public By btnLogin = By.xpath("//button[@class='login-button']");
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By btnContinuar = By.xpath("//button[@class='form-button']");
	public By btnCancelar = By.xpath("//button[@class='form-button secondary-button']");
	
	

	// Elementos abrir conta 
	public By btnAbrirConta = By.xpath("//button[@class='open-account-button']");
	
}
