package com.zhang.adapter;

import java.util.HashMap;
import java.util.Map;

public class OutInfoImpl implements OutInfo{
	@Override
	public Map<String, String> getBasicInfo() {
		Map<String,String> basicInfo = new HashMap<String,String>();
		basicInfo.put("id", "10000");
		basicInfo.put("name", "lisi");
		return basicInfo;
	}
	
}
