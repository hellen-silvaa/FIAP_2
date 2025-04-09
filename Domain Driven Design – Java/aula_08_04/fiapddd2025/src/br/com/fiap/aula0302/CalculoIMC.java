package br.com.fiap.aula0302;

public class CalculoIMC {

	
	// IMC = peso / (altura * altura)
	public double calculo(double peso, double altura) {
		double imc = peso / (altura * altura);
		return imc;
	}
	
}
