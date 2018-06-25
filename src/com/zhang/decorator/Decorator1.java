package com.zhang.decorator;

public class Decorator1 extends SchoolReport{
private SchoolReport sr;
	
	public Decorator1(SchoolReport sr){
		this.sr = sr;
	}
	
	@Override
	public void report() {
		this.sr.report();
		System.out.println("decorator 1");
	}

	@Override
	public void sign() {
		this.sr.sign();
	}

}
