package com.poli.cursojava.aula24.labs;

public class ContaCorrente {

	public String numero;
	public String agencia;
	public boolean especial;
	public double limiteEspecial;
	public double saldo;
	
	
	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + ", especial=" + especial
				+ ", limiteEspecial=" + limiteEspecial + ", saldo=" + saldo + "]";
	}
	
	
	
}
