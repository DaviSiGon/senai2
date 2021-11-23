package com.davi.senai.polimorfismo;

public class Teste {
	public static void barulho (Animal animal) {
		animal.fazerBarulho();
	}
	
	public static void main(String[] args) {
		Cachorro cao = new Cachorro();
		Galinha gal = new Galinha();
		
		barulho(cao);
		barulho(gal);
	}
}
