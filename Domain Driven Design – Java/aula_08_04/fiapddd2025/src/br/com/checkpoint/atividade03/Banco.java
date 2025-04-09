package br.com.checkpoint.atividade03;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.aula04.banco.conta.controlador.ContaControlador;

public class Banco {
	
	private List<ContaBancaria> bancos = new ArrayList<>();
	
	public void adicionarContas (ContaBancaria contaBancaria) {
		this.bancos.add(contaBancaria);
	}
	
	public void executarOperacoes() {
		for (ContaBancaria contaBancaria : bancos) {
			if (contaBancaria instanceof ContaPoupanca) {
				ContaPoupanca contaPoupanca = (ContaPoupanca) contaBancaria;
				contaPoupanca.calcularRendimento();
			} else if (contaBancaria instanceof ContaCorrente) {
				ContaCorrente contaCorrente = (ContaCorrente) contaBancaria;
				contaCorrente.calcularImposto();
			}
		}
	}

}
