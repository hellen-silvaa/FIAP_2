package br.com.fiap.aula01;

public class Conta implements IConta {

	private String numero;
	
	private String nome;
	
	private double saldo;
	
	public Conta() {};
	
	public Conta(String numero, String nome, double saldo) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > 0 && this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			throw new SaldoInsuficienteException("O valor solicitado é maior que o saldo atual.");
		}
	}
	
	public void exibirSaldo() {
		System.out.println("Saldo atual :"  + this.saldo);
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [" + (numero != null ? "numero=" + numero + ", " : "")
				+ (nome != null ? "nome=" + nome + ", " : "") + "saldo=" + saldo + "]";
	}
	
	
	
}
