package br.com.checkpoint.atividade01;

import java.util.logging.Logger;

public class Main {
	
	static Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		ContaBancaria contaBancaria = new ContaBancaria();
		contaBancaria.setTitular("Anderson Fonseca");
		
		contaBancaria.depositar(1000);
		contaBancaria.sacar(500);
		
		log.info("Titular da conta >>" + contaBancaria.getTitular());
		log.info("Saldo da conta >>" + contaBancaria.consultarSaldo());
		
		contaBancaria.setTitular("Sophia Fonseca");

		log.info("Novo Titular da conta >>" + contaBancaria.getTitular());
		
	}

}
