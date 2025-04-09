package br.com.fiap.aula0401;

import java.util.HashMap;
import java.util.Map;

public class ContadorVogais {
	
	public Map<String, Integer> mapaVogais = new HashMap<>();
	
	public ContadorVogais() {
		mapaVogais.put("A", 0);
		mapaVogais.put("E", 0);
		mapaVogais.put("I", 0);
		mapaVogais.put("O", 0);
		mapaVogais.put("U", 0);
	}
	
	
	public void contador(String texto) {
		
		for (int i = 0; i < texto.length(); i++) {
			
			if (texto.substring(i, i+1).equalsIgnoreCase("A")){
				mapaVogais.put("A", mapaVogais.get("A")+1);
			} else if (texto.substring(i, i+1).equalsIgnoreCase("E")){
				mapaVogais.put("E", mapaVogais.get("E")+1);
			} else if (texto.substring(i, i+1).equalsIgnoreCase("I")){
				mapaVogais.put("I", mapaVogais.get("I")+1);
			} else if (texto.substring(i, i+1).equalsIgnoreCase("O")){
				mapaVogais.put("O", mapaVogais.get("O")+1);
			} else if (texto.substring(i, i+1).equalsIgnoreCase("U")){
				mapaVogais.put("U", mapaVogais.get("U")+1);
			}
		}
		
		System.out.println(this.mapaVogais);
	}
	
	public static void main(String[] args) {
		
		String texto = "Maria Joaquina de Amaral";
		
		ContadorVogais contadorVogais = new ContadorVogais();
		contadorVogais.contador(texto);
		
	}

}
