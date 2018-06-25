package com.zhang.state;

public class Context {
	public static final OpenningState openningState = new OpenningState();
	public static final ClosingState closingState = new ClosingState();
	public static final RunningState runningState = new RunningState();
	public static final StopingState stopingState = new StopingState();
	
	private LiftState liftState;
	
	public LiftState getLiftState(){
		return this.liftState;
	}
	
	public void setLiftState(LiftState liftState){
		this.liftState = liftState;
		this.liftState.setContext(this);
	}
	
	public void open(){
		this.liftState.open();
	}
	
	public void close(){
		this.liftState.close();
	}
	
	public void run(){
		this.liftState.run();
	}
	
	public void stop(){
		this.liftState.stop();
	}
	
}
