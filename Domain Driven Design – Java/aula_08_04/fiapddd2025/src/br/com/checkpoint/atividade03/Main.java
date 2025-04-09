package br.com.checkpoint.atividade03;

public class Main {
	
	public static void main(String[] args) {
		
		
		ContaBancaria contaCorrente = new ContaCorrente();
		contaCorrente.depositar(1000);
		
		ContaBancaria poupanca = new ContaPoupanca();
		poupanca.depositar(500);
				
		Banco banco = new Banco();
		banco.adicionarContas(contaCorrente);
		banco.adicionarContas(poupanca);
		
		banco.executarOperacoes();
		
	}

}
