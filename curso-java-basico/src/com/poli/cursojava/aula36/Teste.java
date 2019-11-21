package com.poli.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Poli");
		//		contato.setEndereco("Rua Clodoaldo");
		//		contato.setTelefone("9.8888-8888");

		//		System.out.println(contato.getNome());
		//		System.out.println(contato.getTelefone());

		Endereco end = new Endereco();
		end.setNomeRua("Rua1");
		end.setNumero("20");
		end.setCidade("Paraiba");
		end.setEstado("PB");
		end.setComplemento("-");
		end.setCep("777777777");

		contato.setEndereco(end);

		//		System.out.println(contato.getNome());
		//		System.out.println(contato.getTelefone());

		if( contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCep());
		}




		Telefone tel = new Telefone();

		tel.setTipo("celular");
		tel.setDdd("83");
		tel.setNumero("9.9999-9999");

		//		contato.setTelefone(tel);
		//		
		//		System.out.println(contato.getNome());
		////	System.out.println(contato.getTelefone());
		//
		//		if( contato != null && contato.getTelefone() != null) {
		//			System.out.println(contato.getTelefone().getDdd());
		//		}


		Telefone tel2 = new Telefone();

		tel2.setTipo("celular");
		tel2.setDdd("83");
		tel2.setNumero("9.5555-5555");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = tel;
		telefones[1] = tel2;

		contato.setTelefones(telefones);

		if(contato != null && contato.getTelefones() != null) {
			for(Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd()+ " " + t.getNumero());
			}
		}









	}

}
