package com.zhang.responsibility;

public class Manager3 extends Handler{
	public Manager3(){
		super(3);
	}
	
	@Override
	public void response(){
		System.out.println("Manager3's response is agree !");
	}
	
}
