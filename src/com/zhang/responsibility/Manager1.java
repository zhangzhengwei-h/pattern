package com.zhang.responsibility;

public class Manager1 extends Handler{
	public Manager1(){
		super(1);
	}
	
	@Override
	public void response(){
		System.out.println("Manager1's response is agree !");
	}
	
}
