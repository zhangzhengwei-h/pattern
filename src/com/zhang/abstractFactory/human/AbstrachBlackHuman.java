package com.zhang.abstractFactory.human;

public abstract class AbstrachBlackHuman implements Human {
	@Override
	public void cry() {
		System.out.println("black cry");
	}

	@Override
	public void laugh() {
		System.out.println("black laugh");		
	}

	@Override
	public void run() {
		System.out.println("black run");		
	}
}
