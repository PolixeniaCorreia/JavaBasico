package com.poli.cursojava.aula24.labs;

import java.util.Arrays;

public class Lampada {
	
	public String modelo;
	public String tensao;
	public int potencia;
	public String cor;
	public String tipoLuz;
	public int garantiaMeses;
	public String[] tipos;
	public boolean tipoAbajur;
	
	@Override
	public String toString() {
		return "Lampada [modelo=" + modelo + ", tensao=" + tensao + ", potencia=" + potencia + ", cor=" + cor
				+ ", tipoLuz=" + tipoLuz + ", garantiaMeses=" + garantiaMeses + ", tipos=" + Arrays.toString(tipos)
				+ ", tipoAbajur=" + tipoAbajur + "]";
	}
	
	

}
