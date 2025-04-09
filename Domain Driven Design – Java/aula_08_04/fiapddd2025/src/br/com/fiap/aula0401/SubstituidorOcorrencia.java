package br.com.fiap.aula0401;

public class SubstituidorOcorrencia {
	
	
	public void substituir(String texto, String palavraEncontrada, String palavraSubstituta) {
		
		String textoInterno = texto;
		String resultado = textoInterno.replaceAll(palavraEncontrada, palavraSubstituta);
		System.out.println(resultado);
		
	}
	
	public static void main(String[] args) {
		
		String texto = "Eu adoro programar em PHPxp. PHP eh muito legal. Você gosta de PHP?";
		
		System.out.println(texto);
		
		SubstituidorOcorrencia so = new SubstituidorOcorrencia();
		so.substituir(texto, "PHP", "Java ");
		
	}

}
