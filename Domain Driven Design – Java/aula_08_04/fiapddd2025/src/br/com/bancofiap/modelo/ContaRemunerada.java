package br.com.bancofiap.modelo;

public class ContaRemunerada extends ContaComum {

	private double taxaRemuneracao = 0.0;
	
	public double saldoRemunerado;
	
	public ContaRemunerada(Agencia agencia, Cliente cliente, String numero, double saldo, double taxaRemuneracao) {
		super(agencia, cliente, numero, saldo);
		this.taxaRemuneracao = taxaRemuneracao;
	}	
	
	public double getTaxaRemuneracao() {
		return taxaRemuneracao;
	}

	public void remunerarConta() {
		saldoRemunerado = super.obterSaldo() * this.taxaRemuneracao;
	}
	
	public double obterSaldo() {
		return this.saldoRemunerado;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Conta Remunerada\n");
		sb.append("-----------------------------------\n");
		sb.append(super.toString());
		
		return sb.toString();
	}

	
}
