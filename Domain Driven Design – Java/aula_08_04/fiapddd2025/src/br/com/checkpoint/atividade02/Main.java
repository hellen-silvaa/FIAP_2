package br.com.checkpoint.atividade02;

import java.util.logging.Logger;

import br.com.checkpoint.atividade02.excecoes.LimiteSaqueExcedidoException;
import br.com.checkpoint.atividade02.excecoes.SaldoInsuficienteException;

public class Main {

	static Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		  ContaCorrente contaCorrente = new ContaCorrente();
		  contaCorrente.setNumeroConta("123456-0");
		  contaCorrente.setTitular("Maria Helena");
		  
		  contaCorrente.depositar(400);
		  contaCorrente.depositar(200);
		  
		  
		  log.info("Numero da conta >>" + contaCorrente.getNumeroConta());
		  log.info("Titula da conta >>" + contaCorrente.getTitular());
		  log.info("Saldo da conta >>" + contaCorrente.exibirSaldo());
		  
		  log.info("Saldo da conta >>" + contaCorrente.exibirSaldo());
		  
		  try { contaCorrente.sacar(1000); } catch (SaldoInsuficienteException e1) {
		  log.info(e1.getMessage()); }
		  
		  try { contaCorrente.sacar(100); } catch (SaldoInsuficienteException e1) {
		  log.info(e1.getMessage()); }
		  
		  contaCorrente.aplicarTaxaManutencao();
		  
		  log.info("Saldo da conta >>" + contaCorrente.exibirSaldo());
		 
		
		// -----------------------------------------------------------------------------------
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNumeroConta("456789-00");
		contaPoupanca.setTitular("Joao Carlos");
		
		contaPoupanca.depositar(1000);

		log.info("Numero da conta >>" + contaPoupanca.getNumeroConta());
		log.info("Titula da conta >>" + contaPoupanca.getTitular());
		log.info("Saldo da conta >>" + contaPoupanca.exibirSaldo());

		contaPoupanca.aplicarRendimentoMensal();
		
		log.info("Saldo da conta >>" + contaPoupanca.exibirSaldo());
		
		// -----------------------------------------------------------------------------------
		
		ContaSalario contaSalario = new ContaSalario();
		contaSalario.setNumeroConta("321654-5");
		contaSalario.setTitular("Pedro Silva");
		
		contaSalario.depositar(1000);

		log.info("Numero da conta >>" + contaSalario.getNumeroConta());
		log.info("Titula da conta >>" + contaSalario.getTitular());
		log.info("Saldo da conta >>" + contaSalario.exibirSaldo());

		try {
			contaSalario.sacar(1100);
			log.info("Saldo da conta >>" + contaSalario.exibirSaldo());
		} catch (SaldoInsuficienteException | LimiteSaqueExcedidoException e) {
			log.info(e.getMessage());
		}

		try {
			contaSalario.sacar(100);
			log.info("Saldo da conta >>" + contaSalario.exibirSaldo());
		} catch (SaldoInsuficienteException | LimiteSaqueExcedidoException e) {
			log.info(e.getMessage());
		}
		
		try {
			contaSalario.sacar(200);
			log.info("Saldo da conta >>" + contaSalario.exibirSaldo());
		} catch (SaldoInsuficienteException | LimiteSaqueExcedidoException e) {
			log.info(e.getMessage());
		}
		
	}
}
