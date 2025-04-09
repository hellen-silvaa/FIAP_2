package br.com.fiap.aula0301;

public class Dinheiro implements TipoPagamento {

	@Override
	public void pagar() {
		System.out.println("Pagar com Dinheiro!!!");
	}

}
