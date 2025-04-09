package br.com.fiap.aula0501;

public class MainEx3 {
	
	public static void main(String[] args) {
		
		int[][] numero = new int[10][10];
		
		int x = 0;
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				numero[i][j] = x;
				x++;
			}
		}
		
		for (int i = 0; i < numero.length; i++) {
			for (int j = 0; j < numero.length; j++) {
				System.out.print(numero[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
