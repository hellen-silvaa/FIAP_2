package br.com.fiap.aula04;

public class ContaEspecial extends ContaCorrente {

	private double limite;
	
	public ContaEspecial(String cliente, String numero, double saldo, double limite) {
		super(cliente, numero, saldo);
		this.limite = limite;
	}

	@Override
	public String exibirSaldo() {
		return "O saldo atual + o limite eh " + (super.getSaldo() + this.limite);
	}

}
