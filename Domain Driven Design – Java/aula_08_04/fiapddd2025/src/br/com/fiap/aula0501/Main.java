package br.com.fiap.aula0501;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		int[] valores = new int[3];
		
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		
		System.out.println(valores[2]);
		
		int[] valores2 = new int[]{10,20,30};
		
		System.out.println(valores2[2]);
		
		System.out.println(valores.length);
		
		String[] nomes = new String[]{"Maria", "Joana", "Roberta"};
		
		System.out.println("Usando for classico");
		
		for (int i = 0;i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		System.out.println("Usando for-each");
		
		for(String nom: nomes) {
			
			System.out.println(nom);
		
		}
		
	}
	
}
