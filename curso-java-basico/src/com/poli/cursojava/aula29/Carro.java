package com.poli.cursojava.aula29;

public class Carro {
	
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capComb;
	public double consumoCombustivel;
	
	public Carro() {
		numPassageiros = 4;
	}
	
	public Carro(String marcA, String modelO, int numPassageiroS, double capComB, double consumoCombustiveL) {
		marca = marcA;
		modelo = modelO;
		numPassageiros = numPassageiroS;
		capComb = capComB;
		consumoCombustivel = consumoCombustiveL;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+capComb * consumoCombustivel + " km");
	}

	double obterAutonomia() {
		return capComb * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}

}
