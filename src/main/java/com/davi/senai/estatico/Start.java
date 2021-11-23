package com.davi.senai.estatico;

import com.davi.senai.estatico.Pessoa;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		Pessoa p5 = new Pessoa();
		
		System.out.println(Pessoa.getContador());
		
		System.out.println(p1.getContador());
	}

	
}
