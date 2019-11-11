package com.poli.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 12;
		van.capComb = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		System.out.println();
		
		Carro fusca = new Carro();
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 4;
		fusca.capComb = 50;
		fusca.consumoCombustivel = 0.12;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
		
		
	}

}
