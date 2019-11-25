package com.poli.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		double [] notas = {10,5,9};
		aluno.setNotas(notas);
		aluno.setCurso("ADS");

		System.out.println(aluno);

		String s1 = "ak";
		String s2 = "aK";	

		System.out.println(s1.equalsIgnoreCase(s2));

		Aluno aluno2 = new Aluno();

		double [] notas2 = {0,0,9};
		aluno2.setNotas(notas);
		aluno2.setCurso("ADS");

		System.out.println(aluno.equals(aluno2));


	}

}
