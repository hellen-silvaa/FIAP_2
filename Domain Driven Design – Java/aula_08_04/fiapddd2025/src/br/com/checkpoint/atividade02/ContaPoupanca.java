package br.com.checkpoint.atividade02;

public class ContaPoupanca extends ContaBancaria {
	
	private static double rendimentoMensal = 0.05;
	
	public void aplicarRendimentoMensal() {
		super.depositar((super.exibirSaldo() * rendimentoMensal));
	}

}
