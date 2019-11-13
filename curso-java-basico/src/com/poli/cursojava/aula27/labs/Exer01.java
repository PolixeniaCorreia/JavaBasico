package com.poli.cursojava.aula27.labs;

public class Exer01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.desligar();
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		System.out.println();
		
		lampada.mostrarEstado();
		
	}

}
