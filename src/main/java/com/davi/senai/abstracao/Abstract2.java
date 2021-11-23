package com.davi.senai.abstracao;

public class Abstract2 extends Abstracao{
	private static double valor;
	private static double porcentagemValor;
	
	@Override
	public double getBonificacao(double valor, double porcentagemValor) {
		double resultado;
		resultado = ((valor * porcentagemValor)/100);
		return resultado;
	}
	
	public Abstract2() {}
	
	public Abstract2(double valor, double porcentagemValor) {
		super();
		Abstract2.valor = valor;
		Abstract2.porcentagemValor = porcentagemValor;
	}

	public static double getValor() {
		return valor;
	}

	public static void setValor(double valor) {
		Abstract2.valor = valor;
	}

	public static double getPorcentagemValor() {
		return porcentagemValor;
	}

	public static void setPorcentagemValor(double porcentagemValor) {
		Abstract2.porcentagemValor = porcentagemValor;
	}
	
	
}