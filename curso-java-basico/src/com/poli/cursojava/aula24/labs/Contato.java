package com.poli.cursojava.aula24.labs;

import java.util.Arrays;

public class Contato {
	
	public String nome;
	public String email;
	public String endereco;
	public String[] telefones;
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", endereco=" + endereco + ", telefones="
				+ Arrays.toString(telefones) + "]";
	}
	

}
