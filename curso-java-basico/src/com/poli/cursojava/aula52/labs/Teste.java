package com.poli.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 1;
		
		while (opcao != 3) {
			opcao = obterOpcaoMenu(scan);
						
			if(opcao == 1) {
				consultaContato(scan, agenda);
				
			}else if(opcao == 2) {
				adicionarContato(scan, agenda);

			}	
		}
		

	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {	
		
		try {
			System.out.println("Entre com as informações do Contato: ");
			
			String nome = leInformacaoString(scan, "Entre com o nome do contato.");
			String telefone = leInformacaoString(scan, "Entre com o telefone do contato.");
			String email = leInformacaoString(scan, "Entre com o email do contato.");
			
			Contatos contato = new Contatos();
			contato.setNome(nome);
			contato.getTelefone();
			contato.setEmail(email);
			
			System.out.println("Contato a ser criado: ");
			System.out.println(contato);
			
			agenda.adicionarContato(contato);
			
		} catch (AgendaCheiaException e) {
			
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda");
			System.out.println(agenda);
		}
	
	}
	
	public static void consultaContato(Scanner scan, Agenda agenda) {

		String nomeContato = leInformacaoString(scan,"Entre com o nome do Contato que deseja vizualizar na Agenda");

		try {
			if (agenda.consultaContatoPorNome(nomeContato) >= 0) {

				System.out.println("Contato Existe.");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println("Contato Não Existe.");
			System.out.println(e.getMessage());

		}
	}

	public static String leInformacaoString(Scanner scan, String msg) {

		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}

	public static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int opcao = 3;

		while (!entradaValida){

			System.out.println("Digite a opção desejada:");
			System.out.println("1: Consultar contato");
			System.out.println("2: Adicionar contato");
			System.out.println("3: Sair");

			try {

				String entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if (opcao == 1 || opcao == 2 || opcao == 3){

					entradaValida = true;
					System.out.println("Entrada OK");

				} else {
					throw new Exception("Entrada inválida");
				}
			} 
			catch (Exception e){
				System.out.println("Entrada inválida, digite novamente\n");
			}
		}

		return opcao;
	}

}
