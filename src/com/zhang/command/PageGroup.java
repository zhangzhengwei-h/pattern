package com.zhang.command;

public class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("page find");
	}

	@Override
	public void add() {
		System.out.println("page add");
	}

	@Override
	public void delete() {
		System.out.println("page delete");
	}

	@Override
	public void update() {
		System.out.println("page update");
	}

	@Override
	public void plan() {
		System.out.println("page plan");
	}

}
