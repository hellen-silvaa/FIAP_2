package br.com.fiap.aula0501;

public class MainEx4 {
	
	public static void main(String[] args) {
		
		int[] numero = new int[10];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = i+1;
		}
		
		int resultado = 0;
		
		for (int i = 0; i < numero.length; i++) {
			resultado += numero[i];
		}
		
		System.out.println(resultado);
		
	}

}
