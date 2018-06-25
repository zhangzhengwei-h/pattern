package com.zhang.adapter;

public class Adapter extends OutInfoImpl implements InInfo{

	@Override
	public String getId() {
		return super.getBasicInfo().get("id");
	}

	@Override
	public String getName() {
		return super.getBasicInfo().get("name");
	}
	
}
