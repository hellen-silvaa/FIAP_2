package br.com.fiap.aula01;

public class Main {
	
	public static void main(String[] args) {
		
//		Pessoa p = new Pessoa();
//			   p.setPrimeiroNome("Anderson");
//			   p.setSobreNome("Fonseca");
//
//		Pessoa p1 = new Pessoa("Anderson", "Fonseca");
//			   p1.setDataNascimento(new Date());	
//
//		System.out.println(p);
//		System.out.println(p1);
		
		 IConta iConta = new Conta("123456-0", "Maria Eduarda", 1000.0);	
		      	iConta.exibirSaldo();
		      	
		      	try {
					iConta.sacar(1100.00);
				} catch (SaldoInsuficienteException e) {
					e.printStackTrace();
				}
		      	
		      	System.out.println(iConta);
		      
//		ContaPoupanca contaPoupanca = new ContaPoupanca("123456-0", "Anderson Fonseca", 1000.0, 1.10);
//				      contaPoupanca.exibirSaldo();
//				      contaPoupanca.aplicarJuros();
//				      contaPoupanca.exibirSaldo();
//				      
//				      System.out.println(contaPoupanca);
//				      
		ContaEspecial contaEspecial = new ContaEspecial("123456-0", "Maria Eduarda", 1000.0, 500.0);		      
				      System.out.println(contaEspecial);
				     
				      try {
						contaEspecial.sacar(1600);
					} catch (SaldoInsuficienteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				      System.out.println(contaEspecial);
	}

}
