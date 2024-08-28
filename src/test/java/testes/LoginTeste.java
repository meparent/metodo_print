package testes;

import org.junit.jupiter.api.Test;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;
import runner.Navegadores;

public class LoginTeste {
	
	ElementosWeb el = new ElementosWeb();
	MetodosDeTestes metodo = new MetodosDeTestes();
	
	
	@Test
	public void loginCampoSenhEmBranco() {
		Navegadores.iniciarTeste();
		metodo.clicar(el.btnLogin);
	
	}
}