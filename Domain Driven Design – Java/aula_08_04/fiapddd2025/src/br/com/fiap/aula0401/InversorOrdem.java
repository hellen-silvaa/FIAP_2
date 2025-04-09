package br.com.fiap.aula0401;

import java.util.Iterator;

public class InversorOrdem {
	
	
	public void inverterTexto(String texto) {
		
		String[] textoDividido = texto.split(" ");
		
		for (int i = (textoDividido.length-1); i >= 0; i--) {
			System.out.print(textoDividido[i] + " ");
		}
		
	}
	
	public static void main(String[] args) {
		
		String texto = "o rato roeu a roupa do rei de roma";
		
		InversorOrdem iv = new InversorOrdem();
		iv.inverterTexto(texto);
		
	}

}
