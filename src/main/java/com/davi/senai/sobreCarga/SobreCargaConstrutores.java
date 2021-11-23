package com.davi.senai.sobreCarga;

public class SobreCargaConstrutores {
	SobreCargaConstrutores() {
		System.out.println("Sem Argumentos");
	}
	SobreCargaConstrutores(int i){
		int soma = i = 30;
		System.out.println("Resultado soma = " + soma);
		System.out.println("-------------------");
	}
	SobreCargaConstrutores(String i) {
		this();
		System.out.println("Nossa String = " + i);
		System.out.println("-------------------");
	}
	SobreCargaConstrutores(String... varargs) {
		System.out.println("Contrutor Varargs");
		System.out.println("-------------------");
	}
}