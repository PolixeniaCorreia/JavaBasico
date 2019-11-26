package com.poli.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {

		System.out.println("*** Teste Conta Bancaria ***");

		ContaBancaria contaSimples = new ContaBancaria();
		
		contaSimples.setNomeCliente("Fernanda");
		contaSimples.setNumConta("1596");
		contaSimples.depositar(1000);
		
		realizarSaque(contaSimples, 100);
		realizarSaque(contaSimples, 1000);

		System.out.println(contaSimples);
		
		System.out.println();
		System.out.println();

		System.out.println("*** Teste Conta Poupança ***");

		ContaPoupança contaPoupanca = new ContaPoupança();
		
		contaPoupanca.setNomeCliente("Julia");
		contaPoupanca.setNumConta("9996");
		contaPoupanca.setDiaRendimento(26);
		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		realizarSaque(contaPoupanca, 70);
		
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("rendimento aplicado, novo saldo é = " +contaPoupanca.getSaldo());
		}else {
			System.out.println("hj não é dia de rendimento. ");
		}

		System.out.println(contaPoupanca);
		
		System.out.println();
		System.out.println();

		System.out.println("*** Teste Conta Especial ***");

		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaEspecial.setNomeCliente("Paula");
		contaEspecial.setNumConta("2569");
		contaEspecial.depositar(100);
		contaEspecial.setLimite(50);
		
		realizarSaque(contaEspecial, 50);
		realizarSaque(contaEspecial, 70);
		

	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque Concluido, seu saldo é: " +conta.getSaldo());
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	

}
