package br.com.fiap.aula0301;

public class MainPolimorfismo {
	
	public static void main(String[] args) {
		
		TipoPagamento tipoPagamento = new CartaoCredito();

		Pagamento pagamento = new Pagamento();
		pagamento.pagar(tipoPagamento);
		
	}
	
	

}
