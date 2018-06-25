package com.zhang.state;

public class RunningState extends LiftState{

	@Override
	public void open() {
		
	}

	@Override
	public void close() {
		
	}

	@Override
	public void run() {
		System.out.println("run");
	}

	@Override
	public void stop() {
		super.context.setLiftState(Context.stopingState);
		super.context.getLiftState().stop();
	}
}
