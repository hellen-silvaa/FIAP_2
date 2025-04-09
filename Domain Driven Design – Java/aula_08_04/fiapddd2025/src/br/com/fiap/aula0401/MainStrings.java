package br.com.fiap.aula0401;

public class MainStrings {
	
	public static void main(String[] args) {
		
		String xpto1 = "Maria";
		String xpto2 = "Maria";
		
		String xpto3 = new String("Maria");
			   xpto3 = xpto3 + " de Lourdes";	
		
		StringBuilder xpto4 = new StringBuilder("Maria");
		       xpto4.append(" de Lourdes");
		       
		StringBuffer xpto5 = new StringBuffer();
		xpto5.append("teste");
		
		System.out.println();
		
	}

}
