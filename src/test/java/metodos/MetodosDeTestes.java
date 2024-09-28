package metodos;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import drivers.Drivers;

public class MetodosDeTestes extends Drivers {
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	// as 3 linhas que preciso saber para implementar um método de Print Screm no
	// meu método
	// linha 1 public void tirarPrint (String nomeDoTeste, String nomeDaEvidencia) {
	// desenvolvo metodo screm Print/não é obrigatório nome do teste/evidencia
	// importar o file //fazer catsh
	// linha 2 File srcFile = ((TakesScreenshot)
	// driver).getScreenshotAs(OutputType.FILE); essa linha cria a FOTO
	// fazer cash ou casth
	// linha 3 FileUtils.copyFile(srcFile, new File("./evidencia/" + nomeDoTeste +
	// "/" + nomeDaEvidencia + ".png"));
	// "/" + nomeDaEvidencia + ".png"));

	public void tirarPrint(String nomeDaFeature, String nomeDaEvidencia) {

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		try { // como pegar horário e adicionar na evidencia
			FileUtils.copyFile(srcFile,
					new File("./" + nomeDaFeature + "/" + nomeDaEvidencia + "_ " + timestamp + ".png"));

			// logincomsucesso 20240903_200105.png
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
                   
}
                             