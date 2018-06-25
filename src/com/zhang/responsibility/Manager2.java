package com.zhang.responsibility;

public class Manager2 extends Handler{
	public Manager2(){
		super(2);
	}
	
	@Override
	public void response(){
		System.out.println("Manager2's response is agree !");
	}
	
}
