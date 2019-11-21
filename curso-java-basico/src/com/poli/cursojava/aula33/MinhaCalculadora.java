package com.poli.cursojava.aula33;

public class MinhaCalculadora {

	public int soma(int num1, int num2) {

		return num1+ num2;
	}
	
	public double soma(double num1, double num2) {

		return num1+ num2;
	}
	
	public int soma(int num1, int num2, int num3) {

		return num1+ num2 + num3;
	}
	
	public int soma(int [] vetorInteitos) {

		int total = 0;
		for(int i = 0; i < vetorInteitos.length; i++) {
			total += vetorInteitos[i];
		}
		return total;
	}

}
