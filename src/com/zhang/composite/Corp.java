package com.zhang.composite;

public abstract class Corp {
	private String name = "";
	private String position = "";
	private int salary = 0;
	
	public Corp(String name, String position, int salary) {
		super();
		this.name = name;
		this.position = position;
		this.salary = salary;
	}
	
	public String getInfo(){
		String info = "";
		info = "name : " + this.name;
		info += "\t position : " + this.position;
		info += "\tsalary : " + this.salary;
		return info;
	}
	
}
