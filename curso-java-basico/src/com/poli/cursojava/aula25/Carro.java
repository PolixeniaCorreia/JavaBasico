package com.poli.cursojava.aula25;

public class Carro {
	
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capComb;
	public double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: "+capComb * consumoCombustivel + "km");
	}
}
