package com.poli.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {


//		//upgasting
//
//		Aluno aluno = new Aluno();
//		Pessoa pessoaAluno = aluno;
//
//		Pessoa aluno2 = new Aluno();
//		Pessoa aluno3 = (Pessoa) new Aluno();
//
//
//		//downcasting, exemplo que dá erro
//
//		Pessoa aluno4 = new Pessoa();
//		Aluno aluno5 = (Aluno) aluno4; 

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if(pessoa instanceof Pessoa) {
			System.out.println("É do Tipo Pessoa.");
		}
		if(aluno instanceof Aluno) {
			System.out.println("É do Tipo Aluno.");
		}
		if(professor instanceof Professor) {
			System.out.println("É do Tipo Professor.");
		}
		
		
		
		

	}

}
