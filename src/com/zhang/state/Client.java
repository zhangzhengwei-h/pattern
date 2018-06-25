package com.zhang.state;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		context.setLiftState(new OpenningState());
		
		context.open();
		context.stop();
		context.run();
		context.close();
		
	}
}
