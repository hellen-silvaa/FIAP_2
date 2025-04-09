package br.com.checkpoint.atividade01;

public class ContaBancaria {
	
	private double saldo;
	
	private String titular;

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
		}
	}
	
	public double consultarSaldo() {
		return this.saldo;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
