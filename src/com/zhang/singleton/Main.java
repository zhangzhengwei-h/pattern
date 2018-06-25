package com.zhang.singleton;

public class Main {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingleton();
		System.out.println(s1.hashCode());
		
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2.hashCode());
		
		System.out.println(s1 == s2);

		System.out.println(f1());
	}
	
	
	private static boolean f1(){
		int x = 1;
		
		return x==1;
	}
}
