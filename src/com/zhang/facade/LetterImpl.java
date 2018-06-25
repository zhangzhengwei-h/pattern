package com.zhang.facade;

public class LetterImpl implements Letter{

	@Override
	public void f1() {
		System.out.println(111);
	}

	@Override
	public void f2(String str) {
		System.out.println(str);
	}

	@Override
	public void f3() {
		System.out.println(333);
	}
	
}
