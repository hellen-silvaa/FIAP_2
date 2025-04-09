package br.com.bancofiap.excecoes;

public class ValorInvalidoException extends Exception {

	public ValorInvalidoException() {
		super("Por favor informe um valor valido maior que zero");
	}
	
	public ValorInvalidoException(String message) {
		super(message);
	}
	
}
