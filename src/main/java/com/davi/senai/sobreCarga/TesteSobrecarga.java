package com.davi.senai.sobreCarga;

public class TesteSobrecarga {

	public static void main(String[] args) {
		new SobreCargaConstrutores();
		new SobreCargaConstrutores(2);
		new SobreCargaConstrutores("gaivota");
		new SobreCargaConstrutores(90 + "Regua");
	}
}