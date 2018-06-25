package com.zhang.bridge;

public class House extends Product {

	@Override
	public void beProducted() {
		System.out.println("house be producted");
	}

	@Override
	public void beSelled() {
		System.out.println("house be selled!");
	}

}
