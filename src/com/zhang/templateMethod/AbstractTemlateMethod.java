package com.zhang.templateMethod;

public abstract class AbstractTemlateMethod {
	private void f1(){
		System.out.println(111);
	}
	
	public abstract void f2();
	
	private void f3(){
		System.out.println(333);
	}
	
	public void run(){
		this.f1();
		this.f2();
		this.f3();
	}
}
