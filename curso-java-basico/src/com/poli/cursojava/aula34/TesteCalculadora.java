package com.poli.cursojava.aula34;

import com.poli.cursojava.aula34.MinhaCalculadora;

public class TesteCalculadora {
	
	static int resultSoma;

	public static void main(String[] args) {
		
		//MinhaCalculadora cal = new MinhaCalculadora();
		//cal.soma(1,2);
		
		resultSoma = MinhaCalculadora.soma(1,2);
		soma2Valores(10,20);
		
	}
	
	static int soma2Valores(int num1, int num2) {
		
		return MinhaCalculadora.soma(num1,num2);
	}

}
