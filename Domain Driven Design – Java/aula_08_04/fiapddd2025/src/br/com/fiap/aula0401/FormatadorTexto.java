package br.com.fiap.aula0401;

public class FormatadorTexto {
	
	
	public void formatar(String texto) {
		
		String[] palavras = texto.split(" ");
		
		for (int i = 0; i < palavras.length; i++) {
			System.out.print(palavras[i].substring(0,1).toUpperCase() + palavras[i].substring(1) + " ");
		}
	}
	
	public static void main(String[] args) {
		
		String texto = "o rato roeu a roupa do rei de roma";
		
		System.out.println(texto);
		
		FormatadorTexto fm = new FormatadorTexto();
		fm.formatar(texto);
		
	}

}
