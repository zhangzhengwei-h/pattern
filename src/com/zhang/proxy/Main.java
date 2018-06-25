package com.zhang.proxy;

import com.zhang.basic.A1;
import com.zhang.basic.A2;

public class Main {
	public static void main(String[] args) {
		P p = new P(new A1());
		p.print();
		
		p = new P(new A2());
		p.print();
		
		
	}
}
