package com.zhang.factory;

import com.zhang.basic.A;

public class Factory {
	public static A createA(@SuppressWarnings("rawtypes") Class c){
		A a = null;
			try {
				a = (A)c.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		return a;
	}

}
