package com.poli.cursojava.aula40;

public class Professor extends Pessoa{
	
	private double salario;
	private String Nomecurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomecurso() {
		return Nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		Nomecurso = nomecurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	public String obterEtiquetaEndereco() {
		String s = "Endereço do Professor:";
		s += super.getEndereco();
		
		return s;
	}
	
}
