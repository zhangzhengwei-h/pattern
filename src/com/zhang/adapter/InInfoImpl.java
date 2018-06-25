package com.zhang.adapter;

public class InInfoImpl implements InInfo{
	private String id ;
	private String name;
	
	
	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
}
