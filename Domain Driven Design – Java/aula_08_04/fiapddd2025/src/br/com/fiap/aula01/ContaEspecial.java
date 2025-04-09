package br.com.fiap.aula01;

public class ContaEspecial extends Conta implements IConta {

	private double limiteCredito;
	
	public ContaEspecial(String numero, String nome, double saldo, double limiteCredito) {
		super(numero, nome, saldo);
		this.limiteCredito = limiteCredito;
	}
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > 0 && (this.getSaldo() + this.limiteCredito) >= valor) {
			setSaldo((getSaldo()+limiteCredito) - valor); ;
		} else {
			throw new SaldoInsuficienteException("O valor é maior que o saldo atual + limite de credito!!");
		}
	}


}
