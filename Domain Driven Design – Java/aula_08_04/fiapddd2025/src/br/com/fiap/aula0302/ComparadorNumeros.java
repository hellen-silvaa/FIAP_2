package br.com.fiap.aula0302;

public class ComparadorNumeros {
	
	public void compare(int a, int b) {
		
		
//		System.out.println(a + " maior que " + b + " - " +  (a > b));
//		System.out.println(b + " maior que " + a + " - " +  (b > a));
//		System.out.println(a + " igual a " + b + " - " +  (a == b));
		
		if (a > b) {
			System.out.println(a + " maior que " + b);
		} else if (b > a) {
			System.out.println(b + " maior que " + a);
		} else {
			System.out.println(a + " igual a " + b);
		}
		
		
	}

}
