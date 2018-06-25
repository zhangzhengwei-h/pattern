package com.zhang.proxy;

import com.zhang.basic.A;

public class P implements A{
	private A a ;

	public P(A a){
		this.a = a;
	}
	
	@Override
	public void print() {
		this.a.print();
	}
	
}
