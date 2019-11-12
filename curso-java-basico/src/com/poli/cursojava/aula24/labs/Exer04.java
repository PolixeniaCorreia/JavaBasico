package com.poli.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();

		livro.nome = "nome1";
		livro.autor = "autor1";
		livro.anoLancamento = 2000;
		livro.isbn= "boolk";
		livro.qtdPaginas = 500;
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Polixenia";
		
		System.out.println(livro);

	}

}
