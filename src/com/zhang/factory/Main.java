package com.zhang.factory;

import com.zhang.basic.A;
import com.zhang.basic.A1;

public class Main {
	public static void main(String[] args) {
		A a1 = Factory.createA(A1.class);
		a1.print();
	}
}
