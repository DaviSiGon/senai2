package com.teste.senai;

public class Conta {

	private Integer numConta;
	private String nome;
	private double saldo;
	private double limite;
	
	//Metodo saque
	public void saque(double valor) {
		this.saldo=this.saldo - valor;
	}
	
	public Integer getNumConta() {
		return numConta;
	}
	public void setNumConta(Integer numConta) {
		if (numConta>0) {
		this.numConta = numConta;
		}
		else {
			System.out.println("Número Invalido");
		}
	}
	public String getNome() {
		if (nome != null) {
			
		}
		else {
			System.out.println("Preencha o nome");
		}
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}