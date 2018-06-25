package com.zhang.abstractFactory.human;

public abstract class AbstreachYellowHuman implements Human{

	@Override
	public void cry() {
		System.out.println("yellow cry");
	}

	@Override
	public void laugh() {
		System.out.println("yellow laugh");		
	}

	@Override
	public void run() {
		System.out.println("yellow run");		
	}
	
}
