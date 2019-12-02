package com.poli.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int opcao = obterOpcaoMenu(scan);


	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida) {

			System.out.println("Digite a opção desejada: ");
			System.out.println("1: Consultar contato ");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");
		
			try {
				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if( opcao != 1 || opcao != 2  || opcao != 3 ) {
					throw new Exception("Entrada Inválida ");
				}else {
					entradaValida = true;
				}
			}catch (Exception e) {
				System.out.println("Entrada Inválida, digite outro valor. \n");
			}
		}
		
		return opcao;
	}

}
