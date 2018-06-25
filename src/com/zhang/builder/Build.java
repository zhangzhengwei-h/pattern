package com.zhang.builder;

public interface Build {
	void buildBasic();
	void buildRoofed();
	void buildWall();
	
	Product buildProduct();
}
