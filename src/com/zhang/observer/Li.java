package com.zhang.observer;

import java.util.Observable;
import java.util.Observer;

public class Li implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("report begein:");
		System.out.println("msg: " + arg.toString());
		System.out.println("report over");
	}
	
}
