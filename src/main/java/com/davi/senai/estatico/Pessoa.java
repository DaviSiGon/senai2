package com.davi.senai.estatico;

import com.davi.senai.estatico.Pessoa;

public class Pessoa {
	
	private int idade;
	private static int contador;
	
	public Pessoa() {
		Pessoa.contador = Pessoa.contador + 1;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Pessoa.contador = contador;
	}

}
