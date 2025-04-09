package br.com.fiap.aula0302;

public class DiaDaSemana {

	public String checarDiaSemana(int dia) {

		String diaSemana = "";

		switch (dia) {
		case 1:
			diaSemana = "domingo";
			break;
		case 2:
			diaSemana = "segunda";
			break;
		case 3:
			diaSemana = "terca";
			break;
		case 4:
			diaSemana = "quarta";
			break;
		case 5:
			diaSemana = "quinta";
			break;
		case 6:
			diaSemana = "sexta";
			break;
		case 7:
			diaSemana = "sabado";
			break;
		default:
			diaSemana = "Dia invalido";
		}

		return diaSemana;
	}

}
