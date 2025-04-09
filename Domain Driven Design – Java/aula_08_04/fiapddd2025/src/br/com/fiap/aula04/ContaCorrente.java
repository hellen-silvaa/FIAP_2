package br.com.fiap.aula04;

public abstract class ContaCorrente {

	private String cliente;
	
	private String numero;		
			
	private double saldo;
	
	public ContaCorrente(String cliente, String numero, double saldo) {
		super();
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public abstract String exibirSaldo();
	
}
