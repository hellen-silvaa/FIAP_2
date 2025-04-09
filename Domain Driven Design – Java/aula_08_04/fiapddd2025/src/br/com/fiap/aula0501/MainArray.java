package br.com.fiap.aula0501;

public class MainArray {
	
	public static void main(String[] args) {
		
		
		int[][] numeros = new int[3][3];
		
		numeros[0][0] = 1;
		numeros[0][1] = 2;
		numeros[0][2] = 3;
		
		numeros[1][0] = 4;
		numeros[1][1] = 5;
		numeros[1][2] = 6;
		
		numeros[2][0] = 7;
		numeros[2][1] = 8;
		numeros[2][2] = 9;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posicao " + i);
			System.out.println("-----------------------------");
			for (int j = 0; j < numeros.length; j++) {
				System.out.print("[" + i + "][" + j + "] = ");
				System.out.println(numeros[i][j]);
			}
			System.out.println("-----------------------------");
		}
		
	
		
	}

}
