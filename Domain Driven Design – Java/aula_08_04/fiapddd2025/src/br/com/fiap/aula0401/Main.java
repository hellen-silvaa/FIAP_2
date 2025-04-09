package br.com.fiap.aula0401;

public class Main {
	
	public static void main(String[] args) {
		
		String saudacao1 = "Ola, Mundo!!!";
		String saudacao2 = new String("OLA, Mundo!!!");
		String saudacao3 = "Ola, Mundo!!!";
		String saudacao4 = new String("Ola, Mundo!!!");

		System.out.println("");
		
		saudacao1.concat("Anderson!!");
		
		System.out.println("");
		
		System.out.println(saudacao1 == saudacao2); // false
		System.out.println(saudacao1 == saudacao3); // true
		
		System.out.println(saudacao1.equals(saudacao2)); // false
		System.out.println(saudacao1.equalsIgnoreCase(saudacao2)); // true

		String titulo = " Estamos na turma 2ESR a noite aprendendo Java 2 de noite* ";
		
		int indice = titulo.lastIndexOf("noite");
		
		System.out.println(titulo.substring(indice));
		
		System.out.println("O total de caracteres do titulo eh " + titulo.length());
		
		System.out.println(titulo.replace("a", "u"));
		
		String[] stringDivido = titulo.split(" ");
		
		for (int i = 0; i < stringDivido.length; i++) {
			System.out.println(i + ". " + stringDivido[i]);
		}
		
		System.out.println(titulo.trim());
		
		String str = "";
		for (int i = 0; i < stringDivido.length; i++) {
			str += stringDivido[i];
		}
		System.out.println(str);
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
	}

}
