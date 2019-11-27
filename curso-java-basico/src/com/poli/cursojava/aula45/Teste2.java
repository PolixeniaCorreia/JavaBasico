package com.poli.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
	
		Object obj1 = obterString();
		String s1 = (String) obj1;
		
		//upgasting
		Object obj2 = "Minha String";
		
		//downcasting
		//funciona
		String s2 = (String) obj2;
		
		//não funciona
		Object obj3 = new Object();
		String s3 = (String) obj3;
		
		//não funciona
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;
	
	}

	private static int obterInteiro() {

		return 1;
	}

	public static String obterString() {
		
		return "minha String";
	}
}
