package com.davi.senai.interfaceAula;

public class Interface2 implements Interface{
	
	public double num;
	public double num2;
	
	@Override
	public void getAcelerar() {
		System.out.println("Acelerar!!!");
	}
	
	@Override
	public double getSoma(double num, double num2) {
		Double result;
		result = num+num2;
		return result;
	}
}
