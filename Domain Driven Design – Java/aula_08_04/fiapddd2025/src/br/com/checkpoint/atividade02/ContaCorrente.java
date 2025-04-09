package br.com.checkpoint.atividade02;

import br.com.checkpoint.atividade02.excecoes.SaldoInsuficienteException;

public class ContaCorrente extends ContaBancaria {

	private static double taxaManutencao = 0.02;
	
	private double limite = 100.0;
	
	private double saldo;
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		if (valor > 0 && valor <= (this.saldo+this.limite)) {
			this.saldo -= valor;
		} else if (valor > (this.saldo+this.limite)) {
			throw new SaldoInsuficienteException("Saque excede o saldo e o limite disponível!");
		}
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void aplicarTaxaManutencao() {
		this.saldo -= (saldo * taxaManutencao);
	}
	
	public double exibirSaldo() {
		return this.saldo+this.limite;
	}
}
