package com.poli.cursojava.aula27;

import com.poli.cursojava.aula27.Carro;

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

		van.exibirAutonomia();

		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do Carro é: " + autonomia);
		System.out.println("A autonomia do Carro é: " + van.obterAutonomia());
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel20 = van.calcularCombustivel(20);
		
		System.out.println("qtdCombustivel10 é: " + qtdCombustivel10);
		System.out.println("qtdCombustivel20 é: " + qtdCombustivel20);
	}

}
