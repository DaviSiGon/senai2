package com.teste.senai;

public class Programa {

	public static void main(String[] args) {
		
		Conta davi = new Conta();
		davi.setNumConta(1);
		davi.setNome("Davi");
		davi.setSaldo(500000);
		davi.setLimite(10000);
		
		davi.saque(250);
		
		Conta amandha = new Conta();
		amandha.setNumConta(2);
		amandha.setNome("Amandha");
		amandha.setSaldo(1000000);
		amandha.setLimite(50000);
		
		amandha.saque(100);
		
		System.out.println(davi.getNumConta()+"---"+davi.getNome()+"---"+davi.getSaldo( ));
		
		System.out.println(amandha.getNumConta()+"---"+amandha.getNome()+"---"+amandha.getSaldo( ));
	}
}
