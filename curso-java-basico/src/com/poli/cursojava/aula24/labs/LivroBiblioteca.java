package com.poli.cursojava.aula24.labs;

import java.util.Date;

public class LivroBiblioteca {
	
	public String nome;
	public String autor;
	public int qtdPaginas;
	public int anoLancamento;
	public String isbn;
	public boolean emprestado;
	public Date dataEntrega;
	public String emprestadoA;
	
	@Override
	public String toString() {
		return "LivroBiblioteca [nome=" + nome + ", autor=" + autor + ", qtdPaginas=" + qtdPaginas + ", anoLancamento="
				+ anoLancamento + ", isbn=" + isbn + ", emprestado=" + emprestado + ", dataEntrega=" + dataEntrega
				+ ", emprestadoA=" + emprestadoA + "]";
	}
	
	
	
}
