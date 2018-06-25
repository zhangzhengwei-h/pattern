package com.zhang.responsibility;

public class Main {
	public static void main(String[] args) {
		Manager1 m1 = new Manager1();
		Manager2 m2 = new Manager2();
		Manager3 m3 = new Manager3();
		
		m1.setNextHandler(m2);
		m2.setNextHandler(m3);
		
		IEmployee emp = new Employee(2,"go shopping !");
		
		m1.getMsg(emp);
		
	}
}
