package com.poli.cursojava.aula43.labs.exer01;

import java.util.Calendar;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ContaPoupança extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupança [nomeCliente= " + super.getNomeCliente() + ", numConta= " + super.getNumConta() + ","
				+ " saldo= " + super.getSaldo() + ", diaRendimento= " +this.diaRendimento + "]";
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar hj = Calendar.getInstance();
		
		if(diaRendimento == hj.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() +(this.getSaldo() * taxaRendimento));
			return true;
		}
		
		return false;
	}
	
	
	
	

}
