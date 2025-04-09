package br.com.fiap.aula0303;

public class ParesImpares {
	
	public static void main(String[] args) {
		
		ParesImpares pi = new ParesImpares();
		pi.checarNumero(13);
		
	}

	public void checarNumero(int valor) {

		if (valor >= 0) {
			if (valor % 2 == 0) {
				System.out.println("O numero " + valor + " eh par.");
			} else {
				System.out.println("O numero " + valor + " eh impar.");
			}
		}
	}

}
