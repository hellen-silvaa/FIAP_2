package br.com.bancofiap.modelo;

public class Agencia {

	private Banco banco;
	
	private String numero;
	
	private String nome;

	public Agencia(Banco banco, String numero, String nome) {
		super();
		this.banco = banco;
		this.numero = numero;
		this.nome = nome;
	}

	public Banco getBanco() {
		return banco;
	}

	public String getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}
	
}
