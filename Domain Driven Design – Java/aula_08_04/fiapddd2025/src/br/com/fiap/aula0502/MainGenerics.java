package br.com.fiap.aula0502;

import java.util.ArrayList;
import java.util.List;

public class MainGenerics {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		
			 lista.add("Joao");
			 lista.add(1);
			 lista.add(1.0d);
			 
			 for (Object object : lista) {
				double d = (double) object;
				System.out.println(d);
			}
			 
		List<Double> listaString = new ArrayList<>();	 
					 listaString.add(1.0);

					 
					 
	}

}
