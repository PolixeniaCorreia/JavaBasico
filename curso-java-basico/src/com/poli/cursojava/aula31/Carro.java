package com.poli.cursojava.aula31;

public class Carro {

	public String marca;
	String modelo;
	int numPassageiros;
	double capComb;
	private double consumoCombustivel;


	public Carro() {
	}

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+capComb * consumoCombustivel + " km");
	}

	public double obterAutonomia() {
		return capComb * consumoCombustivel;
	}

	private double dividekmPorCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {

		return this.dividekmPorCombustivel(km);
	}

}
