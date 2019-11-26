package com.poli.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria {

	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(int i) {
		this.limite = (double) i;
	}

	@Override
	public String toString() {
	
		return "ContaEspecial [nomeCliente= " + super.getNomeCliente() + ", numConta= " + super.getNumConta() + "," 
				   + " saldo= " + super.getSaldo() + ", limite= " + limite + "]";
	}
	
	@Override
	public boolean sacar(double valor) {
		
		double saldoLimite = this.getSaldo() + limite;
		
		if((saldoLimite - valor) >= 0) {
			this.setSaldo(this.getSaldo() - valor);
			
			return true;
		}
		
		return false;	
	}
	
	
	
	
	
	
	
	
	
}
