package com.poli.cursojava.aula52.labs;

import java.util.Arrays;

public class Agenda {
	
	private Contatos[] contatos;
	
	public Agenda() {
		
		contatos = new Contatos[5];
	}

	public void adicionarContato(Contatos c) throws AgendaCheiaException {
		
		boolean cheia = true;
		for( int i = 0; i < contatos.length; i++) {
			if( contatos[i] != null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if(cheia) {
			throw new AgendaCheiaException();
		}
	}
	
	public int consultaContatoPorNome(String nome) throws ContatoNaoExisteException {
		
		for( int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					
					return i;
				}	
			}
		}
		
		throw new ContatoNaoExisteException(nome);
	}
	
	@Override
	public String toString() {
		return "Agenda [contatos=" + Arrays.toString(contatos) + "]";
	}
		
}
