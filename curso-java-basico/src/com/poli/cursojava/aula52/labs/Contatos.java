package com.poli.cursojava.aula52.labs;

public class Contatos {
	
	private static int contador = 0;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	
	public Contatos() {
		contador++;
		id = contador;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contatos [id=" + id + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
		
}
