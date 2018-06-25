package com.zhang.observer;

public class Main {
	public static void main(String[] args) {
		Han h = new Han();
		Li li = new Li();
		h.addObserver(li);
		h.f1();
		
		h.f2();
	}
}
