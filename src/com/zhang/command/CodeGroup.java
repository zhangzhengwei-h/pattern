package com.zhang.command;

public class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("code find");
	}

	@Override
	public void add() {
		System.out.println("code add");
	}

	@Override
	public void delete() {
		System.out.println("code delete");
	}

	@Override
	public void update() {
		System.out.println("code update");
	}

	@Override
	public void plan() {
		System.out.println("code plan");
	}

}
