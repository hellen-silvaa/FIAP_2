package br.com.fiap.aula0502;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		
		List<String> lista = new ArrayList<String>();
				     lista.add("Maria");
				     lista.add("Jose");
				     lista.add("Joao");
				     lista.add("Pedro");
		
				     System.out.println(lista);
				     
				     lista.remove("Joao"); // Remover por objeto
				     System.out.println(lista);
				     lista.remove(0); // Remover por posicao
				     System.out.println(lista);
				     lista.set(0, "Renata"); // Alterar pela posicao
				     System.out.println(lista);
				     System.out.println(lista.get(1)); // Obtem o valor da posicao
				     	
				     for (String valor : lista) {
						System.out.println(valor);
					}
				     	
	}
	
}
