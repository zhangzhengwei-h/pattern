package com.zhang.strategy;

import com.zhang.basic.A;

public class Strategy {
	private A a;
	
	public Strategy(A a){
		this.a = a;
	}
	
	public void print(){
		this.a.print();
	}
}
