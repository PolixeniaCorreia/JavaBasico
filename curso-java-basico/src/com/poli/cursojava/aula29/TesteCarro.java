package com.poli.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
//		van.numPassageiros = 12;
		van.capComb = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros );
		System.out.println();

		Carro van2 = new Carro("Fiat", "Ducato", 12, 100, 0.2);

		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capComb);
		System.out.println(van2.consumoCombustivel);



	}	
}
