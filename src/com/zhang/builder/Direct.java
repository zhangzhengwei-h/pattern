package com.zhang.builder;

public class Direct {
	public Product m1(ConcreateBuild b){
		b.buildBasic();
		b.buildRoofed();
		
		return b.buildProduct();
	}
	
	public Product m2(ConcreateBuild b){
		b.buildBasic();
		b.buildProduct();
		b.buildWall();
		return b.buildProduct();
	}
}
