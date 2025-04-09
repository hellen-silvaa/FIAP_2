package br.com.bancofiap.modelo;

import br.com.bancofiap.excecoes.SaldoInsuficienteException;
import br.com.bancofiap.excecoes.ValorInvalidoException;

public class ContaComum {
	
	private Agencia agencia;
	
	private Cliente cliente;
	
	private String numero;
	
	private double saldo = 0.0;
	
	public ContaComum(Agencia agencia, Cliente cliente, String numero) {
		super();
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
	}
		
	public ContaComum(Agencia agencia, Cliente cliente, String numero, double saldo) {
		super();
		this.agencia = agencia;
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getNumero() {
		return numero;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException {
		
		if (valor <= this.saldo) {
			saldo -= valor;
		} else {
			throw new SaldoInsuficienteException();
		}
	}

	public void depositar(double valor) throws ValorInvalidoException {
		
		if (valor <= 0) {
			throw new ValorInvalidoException();
		}
		
		this.saldo += valor;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.agencia.getBanco().getNome() + "\n");
		sb.append(this.agencia.getNumero() + " - " + this.agencia.getNome() + "\n");
		sb.append(this.numero + "\n");
		sb.append(this.cliente.getNome() + "\n");
		sb.append("---------------------------------------------------------------");
		
		return sb.toString();
	}
	
	
	
}
