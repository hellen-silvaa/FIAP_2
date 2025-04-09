package br.com.fiap.aula04;

public class ContaPoupanca extends ContaCorrente {

	private double juros;
	
	public ContaPoupanca(String cliente, String numero, double saldo, double juros) {
		super(cliente, numero, saldo);
		this.juros = juros;
	}

	@Override
	public String exibirSaldo() {
		return "O saldo atual + o juros eh " + (super.getSaldo() * this.juros);
	}

}
