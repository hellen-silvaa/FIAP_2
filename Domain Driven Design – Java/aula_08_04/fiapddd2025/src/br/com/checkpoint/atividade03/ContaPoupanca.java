package br.com.checkpoint.atividade03;

import java.util.logging.Logger;

public class ContaPoupanca extends ContaBancaria implements Rentavel {
	
	static Logger log = Logger.getLogger(ContaPoupanca.class.getName());
	
	private static double rendimentoMensal = 0.05;
	
	public void aplicarRendimentoMensal() {
		super.depositar((super.exibirSaldo() * rendimentoMensal));
	}

	@Override
	public void calcularRendimento() {
		log.info("Calculando Rendimento");
		this.aplicarRendimentoMensal();
	}

}
