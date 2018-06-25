package com.zhang.responsibility;

public abstract class Handler {
	int type;
	
	private Handler nextHandler;
	
	public Handler(int type){
		this.type = type;
	}
	
	public void setNextHandler(Handler handler){
		this.nextHandler = handler;
	}
	
	public final void getMsg(IEmployee employee){
		if(employee.getType() == this.type){
			switch(employee.getType()){
				case 1:System.out.println("to Manager1 :" + employee.getRequest()); break;
				case 2:System.out.println("to Manager2 :" + employee.getRequest()); break;
				case 3:System.out.println("to Manager3 :" + employee.getRequest()); break;
			}
			this.response();
		}else{
			if(this.nextHandler != null){
				this.nextHandler.getMsg(employee);
			}else {
				System.out.println("have no next handler");
			}
		}
	}
	
	public abstract void response();
}
