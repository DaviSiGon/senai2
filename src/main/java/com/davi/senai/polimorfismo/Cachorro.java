package com.davi.senai.polimorfismo;

public class Cachorro extends Animal {
	
	private String nome;
	private String raca;
	
	public Cachorro() {};
	
	@Override
	public void fazerBarulho() {
		System.out.println("Au Au");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
