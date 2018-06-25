package com.zhang.builder;

public class Test {
	public static void main(String[] args) {
		Direct d = new Direct();
		System.out.println(d.m1(new ConcreateBuild()));
		
		System.out.println(d.m2(new ConcreateBuild()));
	}
}
