package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {
	

	public static void iniciarTeste() {
		driver = new ChromeDriver(); // método construtor da class ChromeDriver
		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();
	}

}
