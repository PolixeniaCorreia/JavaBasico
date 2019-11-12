package com.poli.cursojava.aula24.labs;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "15936";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.agencia = "113";
		conta.saldo = 12000.00;
		
		System.out.println(conta);
	}

}
