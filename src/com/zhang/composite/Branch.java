package com.zhang.composite;

import java.util.ArrayList;
import java.util.List;



public class Branch extends Corp {
	List<Corp> subordinate = new ArrayList<Corp>();
	
	public Branch(String name, String position, int salary) {
		super(name, position, salary);
	}
	
	public void addSubordinate(Corp corp){
		this.subordinate.add(corp);
	}
	
	public List<Corp> getSubordinate(){
		return this.subordinate;
	}

}
