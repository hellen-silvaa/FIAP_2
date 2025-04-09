package br.com.fiap.aula01;

import java.util.Date;

public class Pessoa {

	private String primeironome;
	
	private String sobrenome;
	
	private Date dataNascimento;
	
	public Pessoa() {}
	
	public Pessoa(String primeiroNome, String sobreNome) {
		setPrimeiroNome(primeiroNome);
		setSobreNome(sobreNome);
	}
	
	public void setPrimeiroNome(String primeiroNome) {
		if (primeiroNome.trim().length() == 0) {
			System.out.println("Voce deve informar um valor valido!!");
		} else {
			this.primeironome = primeiroNome;
		}
	}
	
	public void setSobreNome(String sobreNome) {
		if (sobreNome.trim().length() == 0) {
			System.out.println("Voce deve informar um valor valido!!");
		} else {
			this.sobrenome = sobreNome;
		}
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [" + (primeironome != null ? "primeironome=" + primeironome + ", " : "")
				+ (sobrenome != null ? "sobrenome=" + sobrenome + ", " : "")
				+ (dataNascimento != null ? "dataNascimento=" + dataNascimento : "") + "]";
	}
	
	
	
}
