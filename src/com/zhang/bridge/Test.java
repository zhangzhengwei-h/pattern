package com.zhang.bridge;

public class Test {
	public static void main(String[] args) {
		ClothesCorp c1 = new ClothesCorp(new Clothes());
		c1.makeMoney();
		
		HouseCorp h = new HouseCorp(new House());
		h.makeMoney();
	}
}	
