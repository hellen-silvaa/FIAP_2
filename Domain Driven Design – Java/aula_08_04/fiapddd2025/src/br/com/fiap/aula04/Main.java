package br.com.fiap.aula04;

import br.com.fiap.aula01.Conta;

public class Main {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaEspecial("Anderson", "123456-0", 100, 500);
		contaCorrente.depositar(50);
		System.out.println(contaCorrente.exibirSaldo());

		ContaCorrente contaCorrente2 = new ContaPoupanca("Maria", "456789-0", 100, 1.10);
		contaCorrente2.depositar(50);
		System.out.println(contaCorrente2.exibirSaldo());
		
		
		Conta conta = new Conta();
		
		br.com.fiap.aula04.banco.cliente.entidade.Conta conta2 = new br.com.fiap.aula04.banco.cliente.entidade.Conta();
		
		

	}

}
