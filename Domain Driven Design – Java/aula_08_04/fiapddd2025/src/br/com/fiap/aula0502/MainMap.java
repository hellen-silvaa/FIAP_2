package br.com.fiap.aula0502;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MainMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "Anderson");
		map.put(2, "Maria");
		map.put(3, "Heloisa");
		map.put(4, "Joao");
		
		System.out.println(map);
		map.remove(10);
		System.out.println(map);
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			System.out.println(map.get(it.next()));
		}
		
		Iterator<Entry<Integer, String>> itEntry = map.entrySet().iterator();
		
		while(itEntry.hasNext()) {
			System.out.println(itEntry.next().getValue());
		}

		
		
	}

}
