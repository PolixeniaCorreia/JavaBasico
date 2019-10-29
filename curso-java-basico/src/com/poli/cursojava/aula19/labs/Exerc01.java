package com.poli.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vA = new int [5];
		int [] vB = new int [vA.length];
		
		for(int i = 0; i < vA.length; i++) {
			
			System.out.println("Entre com o valor da posição: " +i);
			vA[i] = scan.nextInt();
			
			vB[i] = vA[i]; 
			
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vA.length; i++ ) {
			System.out.print(vA[i]+ " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vB.length; i++ ) {
			System.out.print(vB[i]+ " ");
		}
		System.out.println();

	}

}
