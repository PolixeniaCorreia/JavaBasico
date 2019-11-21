package com.poli.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat", "Ducato");
		Carro van1 = new Carro("Fiat", "Ducato", 6);
		
		System.out.println(van.numPassageiros);
		
	}

}
