package br.com.fiap.aula0303;

public class MediaAluno {

	public static void main(String[] args) {
		
		MediaAluno mediaAluno = new MediaAluno();
		
		mediaAluno.calcularMedia(10, 5.5, 8);
		mediaAluno.calcularMedia(7, 6, 5);
		mediaAluno.calcularMedia(1, 3, 5);
	}
	
	public void calcularMedia(double notaUm, double notaDois, double notaTres) {
		
		double media = (notaUm + notaDois + notaTres)/3;
		
		if (media >= 0 && media <= 10) {
			if (media >= 7) {
				System.out.println("Media " + media + " - Aprovado");
			} else if (media >=5 && media < 7) {
				System.out.println("Media " + media + " - Recuperacao");
			} else if (media < 5) {
				System.out.println("Media " + media + " - Reprovado");
			}		
		}		
	}
	
}
