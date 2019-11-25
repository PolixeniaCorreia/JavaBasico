package com.poli.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
	
		aluno.setEndereco("Rua 2, Num2");
		professor.setEndereco("Rua 3, Num3");
	
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
		
		
		
	}

}
