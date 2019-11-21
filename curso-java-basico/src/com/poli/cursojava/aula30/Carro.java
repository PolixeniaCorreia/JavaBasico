package com.poli.cursojava.aula30;

public class Carro {
	public String marca;
	public String modelo;
	public int numPassageiros;
	public double capComb;
	public double consumoCombustivel;
	

	public Carro() {
	}
	
	public Carro(String marca, String modelo, int numPassageiros, double capComb, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capComb = capComb;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Construtor com 3 parâmetros "+marca+" "+modelo+" ");
	}
	
	public Carro(String marca, String modelo) {
		// o this está chamando o construtor cm 3 parâmetros
		this("FIAT", "DUCATO",10);
		System.out.println("Construtor com 2 parâmetros: "+this.marca+" "+this.modelo+" ");
		System.out.println("Construtor com 2 parâmetros: "+marca+" "+modelo+" ");
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
