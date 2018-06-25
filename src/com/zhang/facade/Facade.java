package com.zhang.facade;

public class Facade {
	Letter l = new LetterImpl();
	
	Check c = new Check();
	
	public void run(){
		l.f1();
		
		String str = "right";
		if(c.check(str)){
			l.f2(str);;
		}else {
			System.out.println("error");
		}
		
		l.f3();
	}
}
 