package br.com.fiap.aula0501;

public class MainExercicio {

	public static void main(String[] args) {
		
		int[] numero = new int[10];
		      numero[0] = 1;
		      numero[1] = 2;
		      numero[2] = 3;
		      numero[3] = 4;
		      numero[4] = 5;
		      numero[5] = 6;
		      numero[6] = 7;
		      numero[7] = 8;
		      numero[8] = 9;
		      numero[9] = 10;
		      
		int[] numeros1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		int[] numeros2 = new int[10];
		
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i] = i+1;
		}
		      
		for (int i = 0; i < numero.length; i++) {
			System.out.print(numero[i] + " ");
		}
		
		
	}
	
}
