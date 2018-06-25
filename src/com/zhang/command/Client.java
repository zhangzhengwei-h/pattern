package com.zhang.command;

public class Client {
	public static void main(String[] args) {
		Invoker i1 = new Invoker(new AddRequirementCommand());
		i1.execute();
		
		Invoker i2 = new Invoker(new DeletePageCommand());
		i2.execute();
	}
}
