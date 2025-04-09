package br.com.fiap.aula01;

public interface IConta {

	public String getNumero();

	public String getNome();

	public void depositar(double valor);

	public void sacar(double valor) throws SaldoInsuficienteException;

	public void exibirSaldo();

	public double getSaldo();

	public void setSaldo(double saldo);

}
