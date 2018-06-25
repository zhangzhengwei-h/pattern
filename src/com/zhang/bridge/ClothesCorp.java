package com.zhang.bridge;

public class ClothesCorp extends Corp{
	public ClothesCorp(Product product){
		super(product);
	}
	
	@Override
	public void makeMoney() {
		super.makeMoney();
		System.out.println("clothes makeMoney");
	}
	
}
