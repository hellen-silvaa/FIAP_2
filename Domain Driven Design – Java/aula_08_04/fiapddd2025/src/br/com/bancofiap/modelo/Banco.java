package br.com.bancofiap.modelo;

public class Banco {

	private String nome;
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ContaComum criar(Agencia agencia, String numero, Cliente cliente, double saldo) {
		ContaComum conta = new ContaComum(agencia, cliente, numero, saldo);
		return conta;
	}
	
	public ContaRemunerada criar(Agencia agencia, String numero, double taxaRemuneracao, Cliente cliente, double saldo) {
		ContaRemunerada conta = new ContaRemunerada(agencia, cliente, numero, saldo, taxaRemuneracao);
		return conta;
	}
	
	public ContaEspecial criar(Agencia agencia, String numero, Cliente cliente, double saldo, double limite) {
		ContaEspecial conta = new ContaEspecial(agencia, cliente, numero, saldo, limite);
		return conta;
	}
	
}
