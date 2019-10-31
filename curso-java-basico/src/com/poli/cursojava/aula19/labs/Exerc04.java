package com.poli.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int [] vA = new int [3];
		double [] vB = new double [vA.length];

		for(int i = 0; i < vA.length; i++) {

			System.out.println("Entre com o valor da posição: " +i);
			vA[i] = scan.nextInt();

			vB[i] = Math.sqrt(vA[i]); 
			
		}

		System.out.print("Vetor A = ");
		
		for(int i = 0; i < vA.length; i++ ) {
			System.out.print(vA[i]+ " ");
		}
		
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor B = ");
		
		for(int i = 0; i < vB.length; i++ ) {
			
			System.out.print(df.format(vB[i]) + " ");
		}
		
		System.out.println();

	}

}
