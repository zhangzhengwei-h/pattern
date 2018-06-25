package com.zhang.facade;

public class Check {
	public boolean check(String str){
		if(!"err".equals(str)){
			return true;
		} else {
			return false;
		}
	}
}
