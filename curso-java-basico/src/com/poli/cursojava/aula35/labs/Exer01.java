package com.poli.cursojava.aula35.labs;

public class Exer01 {

	public static void main(String[] args) {
		
		System.out.println(Calculadora.fibonacci(3));
		
		for(int i = 0; i < 10; i++) {
			System.out.print(Calculadora.fibonacci(i) +", ");
			
			if(i == 9) {
				System.out.print(Calculadora.fibonacci(i) +". ");	
			}
		}
	}

}
