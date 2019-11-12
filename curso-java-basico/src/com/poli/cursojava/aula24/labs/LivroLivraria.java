package com.poli.cursojava.aula24.labs;

public class LivroLivraria {

	public String nome;
	public String autor;
	public int qtdPaginas;
	public int anoLancamento;
	public String isbn;
	public double preco;
	
	@Override
	public String toString() {
		return "LivroLivraria [nome=" + nome + ", autor=" + autor + ", qtdPaginas=" + qtdPaginas + ", anoLancamento="
				+ anoLancamento + ", isbn=" + isbn + ", preco=" + preco + "]";
	}

	

}
