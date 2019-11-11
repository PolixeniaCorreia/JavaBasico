package com.poli.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [30][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 7;
		notasAlunos[1][2] = 9;
		notasAlunos[1][3] = 9.5;
		
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 9.5;
		
		for(int i = 0; i < notasAlunos.length; i++) {
//			System.out.println(notasAlunos[i] + " ");
			for(int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j]+ " - ");
			}
		}
		
	}

}
