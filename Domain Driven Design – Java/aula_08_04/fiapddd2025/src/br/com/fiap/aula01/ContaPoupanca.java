package br.com.fiap.aula01;

public class ContaPoupanca extends Conta implements IConta {

	private double taxaJuros;
	
	public ContaPoupanca(String numero, String nome, double saldo, double taxaJuros) {
		super(numero, nome, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	public void aplicarJuros() {
		setSaldo(getSaldo() * this.taxaJuros);
	}

}
