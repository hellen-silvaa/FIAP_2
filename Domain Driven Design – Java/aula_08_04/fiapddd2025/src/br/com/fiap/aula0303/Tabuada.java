package br.com.fiap.aula0303;

public class Tabuada {

	public static void main(String[] args) {

		Tabuada tabuada = new Tabuada();
		tabuada.gerarTabuada(2, "Soma");
		System.out.println("-----------------------");
		tabuada.gerarTabuada(10, "Subtrair");
		System.out.println("-----------------------");
		tabuada.gerarTabuada(10, "Divisao");
		System.out.println("-----------------------");
		tabuada.gerarTabuada(5, "Multiplicacao");


	}

	public void gerarTabuada(int valor, String tipoOperacao) {

		if (tipoOperacao.equals("Soma")) {
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " + " + i + " = " + (valor + i));
			}
		} else if (tipoOperacao.equals("Subtrair")) {
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " - " + i + " = " + (valor - i));
			} 
		} else if (tipoOperacao.equals("Divisao")) {
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " / " + i + " = " + (valor / i));
			}
		} else if (tipoOperacao.equals("Multiplicacao")) {
			for (int i = 1; i < 11; i++) {
				System.out.println(valor + " * " + i + " = " + (valor * i));
			}
		}
	}

}
