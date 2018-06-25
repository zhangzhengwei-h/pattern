package com.zhang.decorator;

public class Main {
	public static void main(String[] args) {
		SchoolReport sr = new FouthGradeSchoolReport();
		Decorator1 s1 = new Decorator1(sr); 
		Decorator2 s2 = new Decorator2(s1);
		s2.report();
		s2.sign();
	}
}
