package com.zhang.builder;

public class ConcreateBuild implements Build{
	private Product product;
	
	public ConcreateBuild(){
		product = new Product();
	}
	
	@Override
	public void buildBasic() {
		this.product.setBasic("basic");
	}

	@Override
	public void buildRoofed() {
		this.product.setRoofed("roofed");
	}

	@Override
	public void buildWall() {
		this.product.setWall("wall");
	}

	@Override
	public Product buildProduct() {
		return this.product;
	}

}
