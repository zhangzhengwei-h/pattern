package com.zhang.decorator;

public class Decorator2 extends SchoolReport{
	private SchoolReport sr;
	
	public Decorator2(SchoolReport sr){
		this.sr = sr;
	}
	
	@Override
	public void report() {
		this.sr.report();
		System.out.println("decorator 2");
	}

	@Override
	public void sign() {
		this.sr.sign();
	}
	
}
