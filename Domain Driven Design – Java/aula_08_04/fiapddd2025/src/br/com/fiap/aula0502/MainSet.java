package br.com.fiap.aula0502;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainSet {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<String>();
		
		set.add("Maria");
		set.add("Jose");
		set.add("Maria");
		set.add("Pedro");
		
		System.out.println(set);
		System.out.println(set.contains("Maria"));
		System.out.println(set.contains("Joana"));
		
		set.remove("Maria");
		System.out.println(set);
		
		for (String valor : set) {
			if (valor.equals("Pedro")) {
				System.out.println(valor);
			}
		}
		
		Set<String> hashSet = new HashSet<String>();
					hashSet.add("Mariana");
					hashSet.add("Jose");
					hashSet.add("Maria");
					hashSet.add("Pedro");
		
					System.out.println(hashSet);
	}
	
}
