package com.zhang.observer;

import java.util.Observable;

public class Han extends Observable{
	public void f1(){
		System.out.println("f1 begin");
		super.setChanged();
		super.notifyObservers("f1 ing");
	}
	
	public void f2(){
		System.out.println("f2 begin");
		super.setChanged();
		super.notifyObservers("f2 ing");
	}
}
