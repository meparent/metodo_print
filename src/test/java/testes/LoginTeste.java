package testes;

import org.junit.Test;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;
import runner.Navegadores;

public class LoginTeste {
	
	ElementosWeb el = new ElementosWeb();
	MetodosDeTestes metodo = new MetodosDeTestes();
	
	
	@Test
	public void loginCampoSenhaEmBranco() {
		Navegadores.iniciarTeste();
		metodo.tirarPrint("Login/loginCampoSenhaEmBranco","Pagina inicial");
		metodo.clicar(el.btnLogin);
		metodo.tirarPrint("Login/loginCampoSenhaEmBranco","Tela de login");
		metodo.clicar(el.btnContinuar); //se ele deu erro, os próximos passos não serão executados
	    metodo.tirarPrint("Login/loginCampoSenhaEmBranco","mensagem de login dados em branco"); // botão direito encima regressivos
	}                                                                                           //refresh- cria pasta evidencias na lateral/login
	
	
                        //*************EXECUTADO COM SUCESSO******************//
			
	
	@Test
	public void loginDadosInvalidos() {
		Navegadores.iniciarTeste();
		metodo.tirarPrint("Login","loginDadosInvalidos-Pagina inicial");
		metodo.clicar(el.btnLogin);
		metodo.tirarPrint("Login", "loginDadosInvalidos-Tela de login");
		metodo.escrever(el.username, "Mercedes");
		metodo.escrever(el.password, "77777");
		metodo.clicar(el.btnContinuar); //se ele deu erro, os próximos passos não serão executados
	    metodo.tirarPrint("Login","loginloginDadosInvalidos-mensagem de login dados invalidos"); // botão direito encima regressivos
	}      
	//refresh- cria pasta evidencias na lateral/login
	
}