package br.com.bancofiap.modelo;

public class ContaEspecial extends ContaComum {

	private double limite;
	
	public ContaEspecial(Agencia agencia, Cliente cliente, String numero, double saldo, double limite) {
		super(agencia, cliente, numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
			return limite;
	}

	
	public double obterSaldo() {
		return super.obterSaldo() + this.limite;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Conta Especial\n");
		sb.append("-----------------------------------\n");
		sb.append(super.toString());
		
		return sb.toString();
	}
	
}
