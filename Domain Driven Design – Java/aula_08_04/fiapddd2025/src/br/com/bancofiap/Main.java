package br.com.bancofiap;

import br.com.bancofiap.excecoes.SaldoInsuficienteException;
import br.com.bancofiap.excecoes.ValorInvalidoException;
import br.com.bancofiap.modelo.Agencia;
import br.com.bancofiap.modelo.Banco;
import br.com.bancofiap.modelo.Cliente;
import br.com.bancofiap.modelo.ContaComum;
import br.com.bancofiap.modelo.ContaEspecial;
import br.com.bancofiap.modelo.ContaRemunerada;

public class Main {
	
	public static void main(String[] args) {
		
		Banco banco = new Banco();
		banco.setNome("Banco FIAP");
		
		Agencia agencia1 = new Agencia(banco, "0001-2", "Aclimacao");
		Agencia agencia2 = new Agencia(banco, "0002-3", "Paulista");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson Fonseca");
		
		Cliente clienteEspecial = new Cliente();
		clienteEspecial.setNome("Maria Fonseca");
					
		ContaComum contaComum = banco.criar(agencia1, "123456-0", cliente, 100.00);
		
		try {
			contaComum.depositar(100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}
		
		try {
			contaComum.sacar(500);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
		}
						
		ContaEspecial contaEspecial = banco.criar(agencia2, "789123-0", clienteEspecial, 1000, 100.00);
		
		ContaRemunerada contaRemunerada = banco.criar(agencia1, "999999-9", 1.20, clienteEspecial, 100.00);
		contaRemunerada.remunerarConta();
		
		System.out.println(contaComum);
		System.out.println(contaEspecial);
		System.out.println(contaRemunerada);

		
//		System.out.println("O saldo da conta numero " + contaComum.getNumero() +
//				      " do cliente " + contaComum.getCliente().getNome() + "  eh " + contaComum.obterSaldo());
//
//		System.out.println("O saldo da conta especial numero " + contaEspecial.getNumero() +
//				" do cliente " + contaEspecial.getCliente().getNome() + " eh " + contaEspecial.obterSaldo());
//
//		System.out.println("O saldo da conta remunerada numero " + contaRemunerada.getNumero() +
//				" do cliente " + contaRemunerada.getCliente().getNome() + " eh " + contaRemunerada.obterSaldo());

		
	}

}
