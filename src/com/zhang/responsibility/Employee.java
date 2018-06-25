package com.zhang.responsibility;

public class Employee implements IEmployee{
	private int type;
	private String request;
	
	public Employee(int type,String request){
		this.type = type;
		this.request = request;
	}
	
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getRequest() {
		return this.request;
	}
	
}
