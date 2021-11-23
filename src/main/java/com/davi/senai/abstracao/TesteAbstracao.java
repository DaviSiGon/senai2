package com.davi.senai.abstracao;

public class TesteAbstracao {
	
	public static void main(String[] args) {
		Abstract2 abs = new Abstract2();
		System.out.println(abs.getBonificacao(350.0, 5.9));
	}

}
