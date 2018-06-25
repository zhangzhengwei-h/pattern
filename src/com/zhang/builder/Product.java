package com.zhang.builder;

public class Product {
	private String basic;
	
	private String roofed;
	
	private String wall;

	public String getBasic() {
		return basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getRoofed() {
		return roofed;
	}

	public void setRoofed(String roofed) {
		this.roofed = roofed;
	}

	public String getWall() {
		return wall;
	}

	public void setWall(String wall) {
		this.wall = wall;
	}

	@Override
	public String toString() {
		return "Product [basic=" + basic + ", roofed=" + roofed + ", wall="
				+ wall + "]";
	}
	
	
}
