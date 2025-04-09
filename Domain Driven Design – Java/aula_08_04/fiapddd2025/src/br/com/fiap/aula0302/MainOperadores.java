package br.com.fiap.aula0302;

public class MainOperadores {

	public static void main(String[] args) {
		
		int soma = 10 + 5;
		int sub = 10 - 5;
		int mult = 10 * 5;
		int div = 10 / 5;
		int mod = 10 % 5;
		
		System.out.println("soma " + soma);
		System.out.println("sub " + sub);
		System.out.println("mult " + mult);
		System.out.println("div " + div);
		System.out.println("mod " + mod);
		
		System.out.println((soma < div));
		
		int a = 10;
		int b = 20;
		
		if ((a < 2) || (b > 18)) {
			System.out.println("Imprima alguma coisa");
		}
		
		a /= 5;
		
		System.out.println("Valor de (a) : " + a);
		
		System.out.println("if ternario " + (a <= 2 ? 10 : 5));
		
		CalculoIMC calculoIMC = new CalculoIMC();
		System.out.println("IMC calculado " + calculoIMC.calculo(70, 1.60));
		
		ComparadorNumeros cn = new ComparadorNumeros();
		cn.compare(5, 10);
		
		VerificadorMaioridade vm = new VerificadorMaioridade();
		System.out.println(vm.verificar(19));
		
		DiaDaSemana daSemana = new DiaDaSemana();
		System.out.println(daSemana.checarDiaSemana(5));
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Testes" + i);
		}
		
		boolean blnTest = true;
		int indice = 0;
		
		while(blnTest) {

			System.out.println("Valor do indice " + indice);
			
			if (indice == 10) {
				blnTest = false;
			}
			
			indice++;
		}
		
	}
	
	
}
