package com.poli.cursojava.aula24.labs;

public class Livro {
	
	public String nome;
	public String autor;
	public int qtdPaginas;
	public int anoLancamento;
	public String isbn;
	
	
	@Override
	public String toString() {
		return "Livro [nome = " + nome + ",\n autor = " + autor + ",\n qtdPaginas = " + qtdPaginas + ",\n anoLancamento = "
				+ anoLancamento + ",\n isbn = " + isbn + "]";
	}

}
