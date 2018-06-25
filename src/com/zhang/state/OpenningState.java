package com.zhang.state;

public class OpenningState extends LiftState{
	protected Context context;
	
	public void setOpenningState(Context context) {
		this.context = context;
	}

	@Override
	public void open() {
		System.out.println("open");
	}

	@Override
	public void close() {
		super.context.setLiftState(Context.closingState);
		super.context.getLiftState().close();
	}

	@Override
	public void run() {
		 
	}

	@Override
	public void stop() {
		
	}

}
