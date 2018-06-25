package com.zhang.abstractFactory.human;

public abstract class AbstractWhiteHuman implements Human{
	@Override
	public void cry() {
		System.out.println("white cry");
	}

	@Override
	public void laugh() {
		System.out.println("white laugh");		
	}

	@Override
	public void run() {
		System.out.println("white run");		
	}
}
