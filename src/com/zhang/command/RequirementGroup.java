package com.zhang.command;

public class RequirementGroup extends Group{

	@Override
	public void find() {
		System.out.println("requirement find");
	}

	@Override
	public void add() {
		System.out.println("requirement add");
	}

	@Override
	public void delete() {
		System.out.println("requirement delete");
	}

	@Override
	public void update() {
		System.out.println("requirement update");
	}

	@Override
	public void plan() {
		System.out.println("requirement plan");
	}

}
