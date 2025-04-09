package br.com.fiap.aula0402;

public class Main {
	
	public static void main(String[] args) {
		
//		short numeroShort = 0;
//		long numeroLong = 1234567890;
//		numeroShort = (short) numeroLong;
//		System.out.println("Numero Long " + numeroLong);
//		System.out.println("Numero Short " + numeroShort);
//		numeroLong = numeroShort;
//		System.out.println("Numero Long " + numeroLong);
		
		Animal animal = new Cachorro();
			   animal.fazerSom();
			   
		Animal animal2 = new Gato();
			   animal2.fazerSom();	
			   
		if (animal2 instanceof Cachorro) {
			Cachorro cachorro = (Cachorro) animal2;	   
	         cachorro.fazerSom();
		}
		
		double duplo = 2.00;
		
		Double duplo2 = 3.00;
				 
	}

}
