package br.com.checkpoint.atividade02;

import br.com.checkpoint.atividade02.excecoes.LimiteSaqueExcedidoException;
import br.com.checkpoint.atividade02.excecoes.SaldoInsuficienteException;

public class ContaSalario extends ContaBancaria {

	private int numeroSaques = 0;
	
	public void sacar(double valor) throws LimiteSaqueExcedidoException, SaldoInsuficienteException {
		if (this.numeroSaques < 1) {
			super.sacar(valor);
			this.numeroSaques++;
		} else {
			throw new LimiteSaqueExcedidoException("Saque não permitido. Limite de um saque por mês já atingido.");
		}
	}
	
}
