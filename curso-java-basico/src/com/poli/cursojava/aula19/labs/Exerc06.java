package com.poli.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int [] vA = new int [3];
		int [] vB = new int [vA.length];
		int [] vC = new int [vA.length];
		
		
		for(int i = 0; i < vA.length; i++) {
			System.out.println("Entre com o valor do Vetor A posição: " +i);
			vA[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vB.length; i++) {
			System.out.println("Entre com o valor do Vetor B posição: " +i);
			vB[i] = scan.nextInt();
		}
		
		for(int i = 0; i < vC.length; i++) {
			vC[i] = vA[i] + vB[i];
			System.out.println(vC[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("Vetor A = ");
		for(int i = 0; i < vA.length; i++) {
			System.out.print(vA[i] + " ");	
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i < vA.length; i++) {
			System.out.print(vB[i] + " ");	
		}
		System.out.println();
		
		System.out.print("Vetor C = ");
		for(int i = 0; i < vC.length; i++) {
			System.out.print(vC[i] + " ");	
		}
		System.out.println();
		
	}

}
