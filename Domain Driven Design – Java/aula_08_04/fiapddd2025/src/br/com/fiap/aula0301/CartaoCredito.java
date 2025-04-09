package br.com.fiap.aula0301;

public class CartaoCredito implements TipoPagamento {

	@Override
	public void pagar() {
		System.out.println("Pagar com Cartao de Credito!!!");
	}

}
