package com.zhang.bridge;

public class Clothes extends Product {

	@Override
	public void beProducted() {
		System.out.println("clothes be producted");
	}

	@Override
	public void beSelled() {
		System.out.println("clothes be selled!");
	}

}
