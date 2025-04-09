package br.com.checkpoint.atividade03;

import br.com.checkpoint.atividade02.excecoes.SaldoInsuficienteException;

public class ContaBancaria {
	
	private String numeroConta;
	
	private String titular;
	
	private double saldo;
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > 0 && valor <= this.saldo) {
			this.saldo -= valor;
		} else if (valor > this.saldo) {
			throw new SaldoInsuficienteException("O valor solicitado é maior que o saldo atual!!");
		}
	}
	
	public double exibirSaldo() {
		return this.saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
