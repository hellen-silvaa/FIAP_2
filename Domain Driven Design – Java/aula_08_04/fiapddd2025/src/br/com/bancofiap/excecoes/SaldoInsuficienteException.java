package br.com.bancofiap.excecoes;

public class SaldoInsuficienteException extends Exception {
	
	public SaldoInsuficienteException() {
		super("O valor solicitado eh inferior ao saldo atual");
	}

}
