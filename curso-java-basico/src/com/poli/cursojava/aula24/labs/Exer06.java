package com.poli.cursojava.aula24.labs;

public class Exer06 {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Paula";
		contato1.endereco = "Av. Paulista, 150";
		contato1.email = "paula@gmail.com";
		contato1.telefones = new String[5];
		contato1.telefones[0] = "9.8895-9569";
		contato1.telefones[1] = "9.8895-8523";
		contato1.telefones[1] = "9.8895-6589";
		
		System.out.println(contato1);
	}

}
