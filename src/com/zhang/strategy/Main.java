package com.zhang.strategy;

import com.zhang.basic.A2;

public class Main {
	public static void main(String[] args) {
		Strategy s2 = new Strategy(new A2());
		s2.print();
		
		
	}
}
